package com.sharedmarketing.bck.webcams.utility;

import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.FactoryConfigurationError;
import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;
import org.w3c.dom.Document;
import org.w3c.dom.DOMException;
import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.Text;
import org.w3c.dom.traversal.DocumentTraversal;
import org.w3c.dom.traversal.NodeFilter;
import org.w3c.dom.traversal.NodeIterator;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.JSplitPane;
import javax.swing.JEditorPane;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.awt.event.WindowAdapter;
import javax.swing.border.EmptyBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.event.TreeModelListener;
import javax.swing.tree.TreePath;

@SuppressWarnings("serial")
public class Echo extends JPanel{
    static Document document;
    boolean compress = false;
    static final int windowHeight = 460;
    static final int leftWidth = 300;
    static final int rightWidth = 340;
    static final int windowWidth = leftWidth + rightWidth;

    public Echo(){
        EmptyBorder eb = new EmptyBorder(5,5,5,5);
        BevelBorder bb = new BevelBorder(BevelBorder.LOWERED);
        CompoundBorder cb = new CompoundBorder(eb,bb);
        this.setBorder(new CompoundBorder(cb,eb));

        JTree tree = new JTree(new DomToTreeModelAdapter());

        JScrollPane treeView = new JScrollPane(tree);
            treeView.setPreferredSize( new Dimension( leftWidth, windowHeight ) );

        JEditorPane htmlPane = new JEditorPane("text/html","");
            htmlPane.setEditable(false);
        JScrollPane htmlView = new JScrollPane(htmlPane);
            htmlView.setPreferredSize( new Dimension( rightWidth, windowHeight ) );

        JSplitPane splitPane = new JSplitPane( JSplitPane.HORIZONTAL_SPLIT, treeView, htmlView );
            splitPane.setContinuousLayout( true );
            splitPane.setDividerLocation( leftWidth );
            splitPane.setPreferredSize( new Dimension( windowWidth + 10, windowHeight+10 ) );

        this.setLayout(new BorderLayout());
        this.add("Center", splitPane );

    }

    public static void main(String args[]){

        if(args.length!=1){
            //System.err.println("Usage: java Echo filename");
            //System.exit(1);
            buildDom();
            makeFrame();
            return;
        }

        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        try{
            DocumentBuilder builder = factory.newDocumentBuilder();
            document = builder.parse( new File(args[0]) );
            //makeFrame();
            //parseCheckBalanceResponse(document);
            //parseGetAdDetailsResponse(document);
            //parseGetAllClaimsResponse(document);
            getCrazyWithTheCheeseWhiz(document);
        }catch (SAXException sxe){
            Exception x = sxe;
            if ( sxe.getException()!=null )
                x = sxe.getException();
            x.printStackTrace();
        }catch(ParserConfigurationException pce){
            pce.printStackTrace();
        }catch(IOException ioe){
            ioe.printStackTrace();
        }

    }

    public static void makeFrame()
    {
        JFrame frame = new JFrame("DOM Echo");
        frame.addWindowListener(new WindowAdapter() {
          public void windowClosing(WindowEvent e) {System.exit(0);}
        });

        final Echo echoPanel = new Echo();
        frame.getContentPane().add("Center", echoPanel );
        frame.pack();
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int w = windowWidth + 10;
        int h = windowHeight + 10;
        frame.setLocation(screenSize.width/3 - w/2, screenSize.height/2 - h/2);
        frame.setSize(w, h);
        frame.setVisible(true);
    }

    static final String[] typeName = {
        "none",
        "Element",
        "Attr",
        "Text",
        "CDATA",
        "EntityRef",
        "Entity",
        "ProcInstr",
        "Comment",
        "Document",
        "DocType",
        "DocFragment",
        "Notation",
    };
    final int ELEMENT_TYPE = 1;
    static String[] treeElementNames = {
//      "slideshow",
//      "slide",
//      "title",
//      "slide-title",
//      "item",


    };
    boolean treeElement(String elementName){
        for(int i=0;i<treeElementNames.length;i++){
            if( elementName.equals(treeElementNames[i]) )
                return true;
            }
        return false;
    }

    public class AdapterNode
    {
      org.w3c.dom.Node domNode;

      // Construct an Adapter node from a DOM node
      public AdapterNode(org.w3c.dom.Node node) {
        domNode = node;
      }

      // Return a string that identifies this node in the tree
      // *** Refer to table at top of org.w3c.dom.Node ***
      public String toString() {
        String s = typeName[domNode.getNodeType()];
        String nodeName = domNode.getNodeName();
        if (! nodeName.startsWith("#")) {
           s += ": " + nodeName;
        }
        if (domNode.getNodeValue() != null) {
           if (s.startsWith("ProcInstr"))
              s += ", ";
           else
              s += ": ";
           // Trim the value to get rid of NL's at the front
           String t = domNode.getNodeValue().trim();
           int x = t.indexOf("\n");
           if (x >= 0) t = t.substring(0, x);
           s += t;
        }
        return s;
      }

      public int index(AdapterNode child){
          int count = childCount();
          for(int i=0;i<count;i++){
              AdapterNode n = this.child(i);
              if(child==n)
                return i;
          }
          return -1;
      }

      public AdapterNode child(int searchIndex){
          org.w3c.dom.Node node = domNode.getChildNodes().item(searchIndex);

          if(compress){
              int elementNodeIndex = 0;
              for(int i=0;i<domNode.getChildNodes().getLength();i++){
                  node = domNode.getChildNodes().item(i);
                  if (node.getNodeType() == ELEMENT_TYPE && treeElement( node.getNodeName() )&& elementNodeIndex++==searchIndex){
                    break;
                  }
              }
          }


          return new AdapterNode(node);
      }

      public int childCount(){
          if(!compress)
            return domNode.getChildNodes().getLength();

          int count = 0;
          for( int i=0; i<domNode.getChildNodes().getLength();i++){
              org.w3c.dom.Node node = domNode.getChildNodes().item(i);
              if( node.getNodeType() == ELEMENT_TYPE && treeElement(node.getNodeName()) )
                count++;
          }
        return count;
      }
    }

    public class DomToTreeModelAdapter implements javax.swing.tree.TreeModel{
        public Object getRoot(){
            return new AdapterNode(document);
        }

        public boolean isLeaf(Object aNode){
            AdapterNode node = (AdapterNode) aNode;
            if (node.childCount()>0)
                return false;
            return true;
        }

        public int getChildCount(Object parent){
            AdapterNode node = (AdapterNode) parent;
            return node.childCount();
        }

        public Object getChild(Object parent, int index){
            AdapterNode node = (AdapterNode) parent;
            return node.child(index);
        }

        public int getIndexOfChild(Object parent, Object child){
            AdapterNode node = (AdapterNode) parent;
            return node.index((AdapterNode)child);
        }

        public void valueForPathChanged(TreePath path, Object newValue){
        }

        private List<TreeModelListener> listenerList = new LinkedList<TreeModelListener>();
        public void addTreeModelListener( TreeModelListener listener ){
            if( listener!=null && ! listenerList.contains(listener) ) {
                listenerList.add( listener );
            }
        }
        public void removeTreeModelListener( TreeModelListener listener ){
            if ( listener != null ){
                listenerList.remove( listener );
            }
        }
    }
    @SuppressWarnings("cast")
    public static void buildDom(){
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        try{

            DocumentBuilder builder = factory.newDocumentBuilder();
            document = builder.newDocument();

            Element root = (Element) document.createElement("checkBalanceRequest");
            document.appendChild(root);
            Element sessionId = document.createElement("sessionId");
            Element clientName = document.createElement("clientName");
            Element hqAccNum = document.createElement("hqacNbr");

            root.appendChild( sessionId );
            sessionId.appendChild( document.createTextNode("SESSION ID") );
            root.appendChild( clientName );
            clientName.appendChild( document.createTextNode("CLIENT NAME") );
            root.appendChild( hqAccNum );
            hqAccNum.appendChild( document.createTextNode("HQ ACCOUNT NUMBER") );

            document.getDocumentElement().normalize();

        }catch( ParserConfigurationException pce ){
            pce.printStackTrace();
        }
    }

    private static void parseGetAllClaimsResponse(Document document){
        NodeList nodeList = document.getElementsByTagName("getAllClaimsResponse");
        Node responseRoot = nodeList.item(0);

        NodeList nodeListLevel1 = responseRoot.getChildNodes();
        NodeList nodeListLevel2 = null;
        NodeList nodeListLevel3 = null;

        for(int i=0;i<nodeListLevel1.getLength();i++)
        {
            Node node = nodeListLevel1.item(i);
            if( node != null )
            {
                if ( node.getNodeName().equals("programName") )
                {
                    if( node!=null )
                    {
                        System.out.println("level 1 "+node.getNodeName());
                    }
                }
                if ( node.getNodeName().equals("claims") )
                {
                    if( node!=null )
                    {
                        System.out.println("level 1 "+node.getNodeName());
                        nodeListLevel2 = node.getChildNodes();
                        for(int j=0;j<nodeListLevel2.getLength();j++)
                        {
                            node = nodeListLevel2.item(j);
                            if( node != null )
                            {
                                if ( node.getNodeName().equals("claim") )
                                {
                                    if( node!=null )
                                    {
                                        System.out.println("level 2 "+node.getNodeName());
                                        nodeListLevel3 = node.getChildNodes();

                                        for( int k=0;k<nodeListLevel3.getLength();k++ )
                                        {
                                            node = nodeListLevel3.item(k);
                                            if( node!=null )
                                            {
                                                if ( node.getNodeName().equals("number") )
                                                {
                                                    if( node!=null )
                                                    {
                                                        System.out.println("level 3 "+node.getNodeName());
                                                    }
                                                }
                                                if ( node.getNodeName().equals("totalClaimed") )
                                                {
                                                    if( node!=null )
                                                    {
                                                        System.out.println("level 3 "+node.getNodeName());
                                                    }
                                                }
                                                if ( node.getNodeName().equals("totalApproved") )
                                                {
                                                    if( node!=null )
                                                    {
                                                        System.out.println("level 3 "+node.getNodeName());
                                                    }
                                                }
                                                if ( node.getNodeName().equals("paymentAmount") )
                                                {
                                                    if( node!=null )
                                                    {
                                                        System.out.println("level 3 "+node.getNodeName());
                                                    }
                                                }
                                                if ( node.getNodeName().equals("processedDate") )
                                                {
                                                    if( node!=null )
                                                    {
                                                        System.out.println("level 3 "+node.getNodeName());
                                                    }
                                                }
                                                if ( node.getNodeName().equals("receivedDate") )
                                                {
                                                    if( node!=null )
                                                    {
                                                        System.out.println("level 3 "+node.getNodeName());
                                                    }
                                                }
                                                if ( node.getNodeName().equals("referenceCode") )
                                                {
                                                    if( node!=null )
                                                    {
                                                        System.out.println("level 3 "+node.getNodeName());
                                                    }
                                                }
                                                if ( node.getNodeName().equals("status") )
                                                {
                                                    if( node!=null )
                                                    {
                                                        System.out.println("level 3 "+node.getNodeName());
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }

                            }
                        }
                    }
                }
            }
        }


    }
    private static void parseGetAdDetailsResponse(Document document){
        NodeList nodeList = document.getElementsByTagName("getAdDetailsResponse");
        Node responseRoot = nodeList.item(0);

        NodeList nodeListLevel1 = responseRoot.getChildNodes();
        NodeList nodeListLevel2 = null;
        NodeList nodeListLevel3 = null;

        for(int i=0;i<nodeListLevel1.getLength();i++)
        {
            Node node = nodeListLevel1.item(i);
            if( node != null )
            {
                if ( node.getNodeName().equals("ad") )
                {
                    System.out.println("level 1 "+node.getNodeName());
                    nodeListLevel2 = node.getChildNodes();
                    for(int j=0;j<nodeListLevel2.getLength();j++)
                    {
                        node = nodeListLevel2.item(j);
                        if ( node!=null)
                        {
                            if (node.getNodeName().equals("adId")){
                                System.out.println("level 2 "+node.getNodeName());
                            }
                            if (node.getNodeName().equals("lastPaidDate")){
                                System.out.println("level 2 "+node.getNodeName());
                            }
                            if (node.getNodeName().equals("invoiceNumber")){
                                System.out.println("level 2 "+node.getNodeName());
                            }
                            if (node.getNodeName().equals("comments")){
                                System.out.println("level 2 "+node.getNodeName());
                            }
                            if (node.getNodeName().equals("advertisedProduct")){
                                nodeListLevel3 = node.getChildNodes();
                                for( int k=0;k<nodeListLevel3.getLength();k++ )
                                {
                                    node = nodeListLevel3.item(k);
                                    if ( node != null )
                                    {
                                        if ( node.getNodeName().equals("productCode") )
                                        {
                                            System.out.println("level3 " + node.getNodeName());
                                        }
                                        if ( node.getNodeName().equals("description") )
                                        {
                                            System.out.println("level3 " + node.getNodeName());
                                        }
                                        if ( node.getNodeName().equals("sizeSpec") )
                                        {
                                            System.out.println("level3 " + node.getNodeName());
                                        }
                                        if ( node.getNodeName().equals("pricePoint") )
                                        {
                                            System.out.println("level3 " + node.getNodeName());
                                        }
                                        if ( node.getNodeName().equals("slick") )
                                        {
                                            System.out.println("level3 " + node.getNodeName());
                                        }
                                    }
                                }
                            }

                        }
                    }
                }
            }

        }
    }

    private static void parseCheckBalanceResponse(Document document){
            NodeList nodeList = document.getElementsByTagName("checkBalanceResponse");//[checkBalanceResponse]
            Node responseRoot = nodeList.item(0);

            NodeList nodeListLevel1 = responseRoot.getChildNodes();//[dealer,programs+]
            NodeList nodeListLevel2=null;
            NodeList nodeListLevel3=null;
            NodeList nodeListLevel4=null;

            for( int i=0;i<nodeListLevel1.getLength();i++ )
            {
                Node node = nodeListLevel1.item(i);
                if ( node!=null ){
                    if ( node.getNodeName().equals("dealer") )
                    {
                        System.out.println(node.getNodeName());

                        nodeListLevel2 = node.getChildNodes();//[sessionId,dealerName,user,manager]
                        for ( int j=0;j<nodeListLevel2.getLength();j++ )
                        {
                            node = nodeListLevel2.item(j);
                            if ( node!=null ){
                                if ( node.getNodeName().equals("sessionId") ){
                                    System.out.println("level 2 dealer : "+node.getNodeName() + " value : "+node.getFirstChild().getNodeValue().trim());}
                                if ( node.getNodeName().equals("dealerName") ){
                                    System.out.println("level 2 dealer : "+node.getNodeName() + " value : "+node.getFirstChild().getNodeValue().trim());}
                                if ( node.getNodeName().equals("user") ){
                                    System.out.println("level 2 dealer : "+node.getNodeName());
                                    nodeListLevel3 = node.getChildNodes();//[-user-name,address,phone,email]
                                    for(int k=0;k<nodeListLevel3.getLength();k++)
                                    {
                                        node = nodeListLevel3.item(k);
                                        if ( node!=null )
                                        {
                                            if ( node.getNodeName().equals("name") ){
                                                System.out.println("level 3 user : "+node.getNodeName());}
                                            if ( node.getNodeName().equals("address") ){
                                                nodeListLevel4 = node.getChildNodes();//[-address-addr1,addr2,city,state,zip,country]
                                                for( int m=0;m<nodeListLevel4.getLength();m++)
                                                {
                                                    node=nodeListLevel4.item(m);
                                                    if ( node != null )
                                                    {
                                                        if( node.getNodeName().equals("addr1") ){
                                                            System.out.println("level 4 user address : "+ node.getNodeName());}
                                                        if( node.getNodeName().equals("addr2") ){
                                                            System.out.println("level 4 user address : "+ node.getNodeName());}
                                                        if( node.getNodeName().equals("city") ){
                                                            System.out.println("level 4 user address : "+ node.getNodeName());}
                                                        if( node.getNodeName().equals("zip") ){
                                                            System.out.println("level 4 user address : "+ node.getNodeName());}
                                                        if( node.getNodeName().equals("state") ){
                                                            System.out.println("level 4 user address : "+ node.getNodeName());}
                                                        if( node.getNodeName().equals("country") ){
                                                            System.out.println("level 4 user address : "+ node.getNodeName());}
                                                    }
                                                }
                                            }
                                            if ( node.getNodeName().equals("phone") ){
                                                System.out.println("level 3 user : "+node.getNodeName());}
                                            if ( node.getNodeName().equals("email") ){
                                                System.out.println("level 3 user : "+node.getNodeName());}
                                        }
                                    }
                                }

                                if ( node.getNodeName().equals("manager") ){
                                    System.out.println("level 2 dealer : "+node.getNodeName());
                                    nodeListLevel3 = node.getChildNodes();//[name,address,phone,email]
                                    for(int k=0;k<nodeListLevel3.getLength();k++)
                                    {
                                        node = nodeListLevel3.item(k);
                                        if ( node!=null )
                                        {
                                            if ( node.getNodeName().equals("name") ){
                                                System.out.println("level 3 manager : "+node.getNodeName());}
                                            if ( node.getNodeName().equals("address") ){
                                                nodeListLevel4 = node.getChildNodes();//[-address-addr1,addr2,city,zip,state,country]
                                                for( int m=0;m<nodeListLevel4.getLength();m++)
                                                {
                                                    node=nodeListLevel4.item(m);
                                                    if ( node != null )
                                                    {
                                                        if( node.getNodeName().equals("addr1") ){
                                                            System.out.println("level 4 manager address : "+ node.getNodeName());}
                                                        if( node.getNodeName().equals("addr2") ){
                                                            System.out.println("level 4 manager address : "+ node.getNodeName());}
                                                        if( node.getNodeName().equals("city") ){
                                                            System.out.println("level 4 manager address : "+ node.getNodeName());}
                                                        if( node.getNodeName().equals("zip") ){
                                                            System.out.println("level 4 manager address : "+ node.getNodeName());}
                                                        if( node.getNodeName().equals("state") ){
                                                            System.out.println("level 4 manager address : "+ node.getNodeName());}
                                                        if( node.getNodeName().equals("country") ){
                                                            System.out.println("level 4 manager address : "+ node.getNodeName());}
                                                    }
                                                }
                                            }
                                            if ( node.getNodeName().equals("phone") ){
                                                System.out.println("level 3 manager : "+node.getNodeName());}
                                            if ( node.getNodeName().equals("email") ){
                                                System.out.println("level 3 manager : "+node.getNodeName());}
                                        }
                                    }

                                }
                            }

                        }
                    }
                    if ( node.getNodeName().equals("programs") )
                    {
                        System.out.println(node.getNodeName());

                        nodeListLevel2 = node.getChildNodes();//[program*]
                        for ( int j=0;j<nodeListLevel2.getLength();j++ )
                        {
                            node = nodeListLevel2.item(j);
                            if ( node!=null )
                            {
                                if ( node.getNodeName().equals("program") )
                                {
                                    System.out.println("level 2 programs : "+node.getNodeName());
                                    nodeListLevel3=node.getChildNodes();//[name,year,currency,initialBalance,availableBalance,fundsUsed]
                                    for (int k = 0;k<nodeListLevel3.getLength();k++)
                                    {
                                        node = nodeListLevel3.item(k);
                                        if ( node!=null )
                                        {
                                            if( node.getNodeName().equals("name") ){
                                                System.out.println("level 3 program name : "+ node.getNodeName());}
                                            if( node.getNodeName().equals("year") ){
                                                System.out.println("level 3 program year : "+ node.getNodeName());}
                                            if( node.getNodeName().equals("currency") ){
                                                System.out.println("level 3 program address : "+ node.getNodeName());}
                                            if( node.getNodeName().equals("initialBalance") ){
                                                System.out.println("level 3 program address : "+ node.getNodeName());}
                                            if( node.getNodeName().equals("availableBalance") ){
                                                System.out.println("level 3 program address : "+ node.getNodeName());}
                                            if( node.getNodeName().equals("fundsUsed") ){
                                                System.out.println("level 3 program address : "+ node.getNodeName());}
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
    }

    private static void getCrazyWithTheCheeseWhiz(Document document){
        DOMImplementation impl = document.getImplementation();

        if (!impl.hasFeature("traversal","2.0")){
            System.out.println("A DOM implementation that supports traversal is required.");
            return;
        }

        NodeIterator iterate =  ((DocumentTraversal)document).createNodeIterator(
                                    document, NodeFilter.SHOW_ALL, new FilterAdDetailsByNodeName(), false );
        Node n;

        while((n = iterate.nextNode())!=null )
            System.out.println(n);
    }
}

class FilterByNodeType implements NodeFilter{
    public short acceptNode(Node n){
        short s = n.getNodeType();
        switch(s){
            case Node.ELEMENT_NODE:
                return FILTER_ACCEPT;
            case Node.ATTRIBUTE_NODE:
                return FILTER_SKIP;
            case Node.TEXT_NODE:
                return FILTER_SKIP;
            case Node.COMMENT_NODE:
                return FILTER_SKIP;
            default:
                return FILTER_SKIP;
        }
    }
}
class FilterByNodeName implements NodeFilter{
    public short acceptNode(Node n){
        String name = n.getNodeName();
        if (name.equals("programName"))
            return FILTER_ACCEPT;
        else if (name.equals("claims"))
            return FILTER_ACCEPT;
        else if (name.equals("claim"))
            return FILTER_ACCEPT;
        else if (name.equals("number"))
            return FILTER_ACCEPT;
        else if (name.equals("totalClaimed"))
            return FILTER_ACCEPT;
        else if (name.equals("totalApproved"))
            return FILTER_ACCEPT;
        else if (name.equals("paymentAmount"))
            return FILTER_ACCEPT;
        else if (name.equals("processedDate"))
            return FILTER_ACCEPT;
        else if (name.equals("receivedDate"))
            return FILTER_ACCEPT;
        else if (name.equals("referenceCode"))
            return FILTER_ACCEPT;
        else
            return FILTER_SKIP;
    }
}
class FilterGetAllClaimsByNodeName implements NodeFilter{
    public short acceptNode(Node n){
        String name = n.getNodeName();
        if (name.equals("programName"))
            return FILTER_ACCEPT;
        else if (name.equals("claims"))
            return FILTER_ACCEPT;
        else if (name.equals("claim"))
            return FILTER_ACCEPT;
        else if (name.equals("number"))
            return FILTER_ACCEPT;
        else if (name.equals("totalClaimed"))
            return FILTER_ACCEPT;
        else if (name.equals("totalApproved"))
            return FILTER_ACCEPT;
        else if (name.equals("paymentAmount"))
            return FILTER_ACCEPT;
        else if (name.equals("processedDate"))
            return FILTER_ACCEPT;
        else if (name.equals("receivedDate"))
            return FILTER_ACCEPT;
        else if (name.equals("referenceCode"))
            return FILTER_ACCEPT;
        else
            return FILTER_SKIP;
    }
}
class FilterCheckBalanceByNodeName implements NodeFilter{
    public short acceptNode(Node n){
        String name = n.getNodeName();
        if (name.equals("dealer"))
            return FILTER_ACCEPT;
        else if (name.equals("sessionId"))
            return FILTER_ACCEPT;
        else if (name.equals("dealerName"))
            return FILTER_ACCEPT;
        else if (name.equals("user"))
            return FILTER_ACCEPT;
        else if (name.equals("name"))
            return FILTER_ACCEPT;
        else if (name.equals("address"))
            return FILTER_ACCEPT;
        else if (name.equals("addr1"))
            return FILTER_ACCEPT;
        else if (name.equals("addr2"))
            return FILTER_ACCEPT;
        else if (name.equals("city"))
            return FILTER_ACCEPT;
        else if (name.equals("state"))
            return FILTER_ACCEPT;
        else if (name.equals("zip"))
            return FILTER_ACCEPT;
        else if (name.equals("phone"))
            return FILTER_ACCEPT;
        else if (name.equals("country"))
            return FILTER_ACCEPT;
        else if (name.equals("email"))
            return FILTER_ACCEPT;
        else if (name.equals("manager"))
            return FILTER_ACCEPT;
        else if (name.equals("programs"))
            return FILTER_ACCEPT;
        else if (name.equals("program"))
            return FILTER_ACCEPT;
        else if (name.equals("year"))
            return FILTER_ACCEPT;
        else if (name.equals("currency"))
            return FILTER_ACCEPT;
        else if (name.equals("initialBalance"))
            return FILTER_ACCEPT;
        else if (name.equals("availableBalance"))
            return FILTER_ACCEPT;
        else if (name.equals("fundsUsed"))
            return FILTER_ACCEPT;
        else
            return FILTER_SKIP;
    }
}
class FilterClaimDetailsByNodeName implements NodeFilter{
    public short acceptNode(Node n){
        String name = n.getNodeName();
        if (name.equals("claim"))
            return FILTER_ACCEPT;
        else if (name.equals("claimId"))
            return FILTER_ACCEPT;
        else if (name.equals("programYear"))
            return FILTER_ACCEPT;
        else if (name.equals("holdReason"))
            return FILTER_ACCEPT;
        else if (name.equals("letterCode"))
            return FILTER_ACCEPT;
        else if (name.equals("letterComments"))
            return FILTER_ACCEPT;
        else if (name.equals("mailTo"))
            return FILTER_ACCEPT;
        else if (name.equals("status"))
            return FILTER_ACCEPT;
        else if (name.equals("name"))
            return FILTER_ACCEPT;
        else if (name.equals("city"))
            return FILTER_ACCEPT;
        else if (name.equals("state"))
            return FILTER_ACCEPT;
        else if (name.equals("zip"))
            return FILTER_ACCEPT;
        else if (name.equals("paymentInfo"))
            return FILTER_ACCEPT;
        else if (name.equals("date"))
            return FILTER_ACCEPT;
        else if (name.equals("paymentType"))
            return FILTER_ACCEPT;
        else if (name.equals("paymentNumber"))
            return FILTER_ACCEPT;
        else if (name.equals("amountPaid"))
            return FILTER_ACCEPT;
        else if (name.equals("claimBalance"))
            return FILTER_ACCEPT;
        else if (name.equals("void"))
            return FILTER_ACCEPT;
        else if (name.equals("note"))
            return FILTER_ACCEPT;
        else if (name.equals("ads"))
            return FILTER_ACCEPT;
        else if (name.equals("ad"))
            return FILTER_ACCEPT;
        else if (name.equals("number"))
            return FILTER_ACCEPT;
        else if (name.equals("insertDate"))
            return FILTER_ACCEPT;
        else if (name.equals("productType"))
            return FILTER_ACCEPT;
        else if (name.equals("mediaName"))
            return FILTER_ACCEPT;
        else if (name.equals("mediaCode"))
            return FILTER_ACCEPT;
        else if (name.equals("claimRequestAmount"))
            return FILTER_ACCEPT;
        else if (name.equals("approvedClaimAmount"))
            return FILTER_ACCEPT;
        else if (name.equals("paid"))
            return FILTER_ACCEPT;
        else
            return FILTER_SKIP;
    }
}
class FilterAdDetailsByNodeName implements NodeFilter{
    public short acceptNode(Node n){
        String name = n.getNodeName();
        if (name.equals("ad"))
            return FILTER_ACCEPT;
        else if (name.equals("adId"))
            return FILTER_ACCEPT;
        else if (name.equals("lastPaidDate"))
            return FILTER_ACCEPT;
        else if (name.equals("invoiceNumber"))
            return FILTER_ACCEPT;
        else if (name.equals("comments"))
            return FILTER_ACCEPT;
        else if (name.equals("advertisedProduct"))
            return FILTER_ACCEPT;
        else if (name.equals("productCode"))
            return FILTER_ACCEPT;
        else if (name.equals("description"))
            return FILTER_ACCEPT;
        else if (name.equals("sizeSpec"))
            return FILTER_ACCEPT;
        else if (name.equals("pricePoint"))
            return FILTER_ACCEPT;
        else if (name.equals("slick"))
            return FILTER_ACCEPT;
        else
            return FILTER_SKIP;
    }
}