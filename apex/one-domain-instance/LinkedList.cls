public class LinkedList {

    Node head, tail;
 
    public class Node {
        
        Object element;
        Node previous;
        Node next;
        
        Node(Object o){
        	element = o;
            next = null;
        }
        
        public Object getElement(){
            return element;
        }
        
    }    

    public void add(Object data){
        //if ( data==null){ return; }
        Node n = new Node(data);
        
        if ( head == null ){
            head = tail = n;
            head.previous = tail.next = null;
        } else {
			tail.next = n;  
            n.previous = tail;  
            tail = n;  
            tail.next = null;          
        }

    }
    
    public Node getTail(){
 //       Node n = head;
 //       if ( n != null ){
 //           while( n.next!=null ){
 //               system.debug('---executing');
 //               n = n.next;
 //           }
 //       }        
        return tail;
    }

    public Node getHead(){
        system.debug('---executing ' + head + ' : ' + tail);
//        Node n = head;
//        if ( n != null ){
//            while( n.previous!=null ){
//                system.debug('---executing');
//                n = n.previous;
//            }
//        }        
        return head;
    }

    public void reduce(){    
        Node n = tail;
        if ( n != null ){
            if ( n.previous!=null){
        		tail = n.previous;
        		tail.next = null;
            } else {
                head = null;
                tail = null;
            }
          n = null;
        }
    }
    
}