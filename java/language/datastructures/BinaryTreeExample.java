import java.util.LinkedList;
import java.util.Deque;

class BinaryTreeExample{
	/**
	*						          5
    *						         / \
    *						        4   8
    *						       /   / \
    *						      11  13  4
    *						     /  \      \
    *						    7    2      1
	*
	*	- combine the benefits of sorted lists and binary search
	*	- smaller go left, larger values go right, just like numeric sequence or natural sort of integer
	*	- writing all your functions into a node as below would make for very big nodes
	*/
	public static void main(String[] args){

		Node rootNode = new Node(5);
		Node node2 = new Node(8);
		Node node3 = new Node(4);
		Node node4 = new Node(4);
		Node node5 = new Node(13);
		Node node7 = new Node(11);
		Node node8 = new Node(1);
		Node node12 = new Node(2);
		Node node13 = new Node(7);

		rootNode.populateLeafs(node2, node3);

		node2.populateLeafs(node4, node5);
		node3.populateLeafs(null, node7);
		node4.populateLeafs(node8, null);
		node7.populateLeafs(node12, node13);

		System.out.println();
		rootNode.printBreadthRL();
		System.out.println(rootNode.calculateMaxDepthLeft());
	}

}

class Node{

	private int dataValue;
	Node parent;
	Node leftNode;
	Node rightNode;

	public Node(){}

	public Node(int value){
		dataValue = value;
		leftNode = null;
		rightNode = null;

	}

	public int getDataValue(){
		return dataValue;
	}

	/** look up function --> combining sorted lists and binary search efficiency **/
	public boolean lookup(int target){
		boolean result = false;

		if (dataValue == target)
			return true;

		if ( rightNode != null && target > dataValue )
			result = rightNode.lookup(target);

		if ( leftNode != null && target < dataValue )
			result = leftNode.lookup(target);

		return result;
	}

	/** leaf population functions **/
	public void setLeftNode(Node node){
		leftNode = node;
	}

	public void setRightNode(Node node){
		rightNode = node;
	}

	public void setLeftNodeNull(){
		leftNode = null;
	}

	public void setRightNodeNull(){
		rightNode = null;
	}

	public void populate(int val, Node right, Node left){
		dataValue = val;
		setRightNode(right);
		setLeftNode(left);
	}

	public void populateLeafs(Node right, Node left){
		setRightNode(right);
		setLeftNode(left);
	}

	/** size functions **/
	public int calculateNodeSize(){
		int result = 1;

		if (leftNode == null && rightNode == null)
			return result;

		if ( leftNode!=null )
			result++;

		if ( rightNode!=null )
			result++;

		return result;
	}

	public int calculateTreeSize(){
		int counter=1;

		if ( leftNode!=null){
			counter+=leftNode.calculateTreeSize();
		}
		if ( rightNode!=null){
			counter+=rightNode.calculateTreeSize();
		}

		System.out.println("exitant : " + counter);
		return counter;

	}

	/** Depth Functions **/
	public int calculateMaxDepthLeft(){
		int counter = 1;
		if ( leftNode!=null){
			counter+=leftNode.calculateMaxDepthLeft();
		}
		return counter;
	}

	public int calculateMaxDepthRight(){
		int counter = 1;
		if ( rightNode!=null)
			counter+=rightNode.calculateMaxDepthRight();

		return counter;

	}

	/** Min and Max **/
	public int getMinValue(){
		if ( leftNode !=null )
			return leftNode.getMinValue();
		else
			return dataValue;
	}

	public int getMaxValue(){
		if ( rightNode !=null )
			return rightNode.getMaxValue();
		else
			return dataValue;
	}

	/** print function **/
	public void printTree(){

		if (leftNode!=null)
			leftNode.printTree();

		System.out.print(dataValue);System.out.print(", ");

		if (rightNode!=null)
			rightNode.printTree();

	}

	public void printTreePostOrder(){

		if (leftNode!=null)
			leftNode.printTreePostOrder();

		if (rightNode!=null)
			rightNode.printTreePostOrder();

		System.out.print(dataValue);System.out.print(", ");
	}

	public void printNode(){
		System.out.print(this + " : " + getDataValue());System.out.print(", ");
		if ( leftNode!=null ) System.out.print(leftNode + " : " + leftNode.getDataValue());System.out.print(", ");
		if ( rightNode!=null ) System.out.print(rightNode + " : " + rightNode.getDataValue());System.out.print(". ");
		System.out.println("");
	}

	public void printBreadth(){
		Deque<Node> q = new LinkedList<Node>();

		q.addFirst(this);

		while ( ! q.isEmpty() ){
			Node n = q.getFirst();q.remove();

			System.out.print( n.getDataValue() + ", ");

			if ( n.leftNode != null ){
				q.addLast(n.leftNode);
			}
			if ( n.rightNode != null ){
				q.addLast(n.rightNode);
			}
		}
	}

	public void printBreadthRL(){
		Deque<Node> q = new LinkedList<Node>();

		q.addFirst(this);

		while ( ! q.isEmpty() ){
			Node n = q.getFirst();q.remove();

			System.out.print( n.getDataValue() + ", ");

			if ( n.rightNode != null ){
				q.addLast(n.rightNode);
			}
			if ( n.leftNode != null ){
				q.addLast(n.leftNode);
			}
		}
	}


}