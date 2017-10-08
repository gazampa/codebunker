package datastructures.nodes.ver2;

import java.util.List;
import java.util.LinkedList;
import java.util.Deque;

public class Node{

	private int dataValue;
	private Node left;
	private Node right;

	public Node(){}

	public Node(int value){
		dataValue = value;
		left = null;
		right = null;

	}

	public int getDataValue(){
		return dataValue;
	}

	/** insert function **/
	public void insert(int value){
		if ( value == dataValue )
			return;

		if (value < dataValue){
			if ( left !=null ){
				left.insert(value);
			}else{
				left = new Node(value);
			}
		}

		if ( value > dataValue ){
			if ( right != null ){
				right.insert(value);
			}else{
				right = new Node(value);
			}
		}
	}

	/** look up function --> combining sorted lists and binary search efficiency **/
	public boolean lookup(int target){
		boolean result = false;

		if (dataValue == target)
			return true;

		if ( right != null && target > dataValue )
			result = right.lookup(target);

		if ( left != null && target < dataValue )
			result = left.lookup(target);

		return result;
	}

	/** leaf population functions **/
	public void setLeftNode(Node node){
		left = node;
	}

	public void setRightNode(Node node){
		right = node;
	}

	public void nullLeftNode(){
		left = null;
	}

	public void nullRightNode(){
		right = null;
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

		if (left == null && right == null)
			return result;

		if ( left!=null )
			result++;

		if ( right!=null )
			result++;

		return result;
	}

	public int calculateTreeSize(){
		int counter=1;

		if ( left!=null){
			counter+=left.calculateTreeSize();
		}
		if ( right!=null){
			counter+=right.calculateTreeSize();
		}

		return counter;

	}

	/** Depth Functions **/
	public int calculateMaxDepthLeft(){
		int counter = 1;
		if ( left!=null){
			counter+=left.calculateMaxDepthLeft();
		}
		return counter;
	}

	public int calculateMaxDepthRight(){
		int counter = 1;
		if ( right!=null)
			counter+=right.calculateMaxDepthRight();

		return counter;

	}

	/** Min and Max **/
	public int getMin(){
		if ( left !=null )
			return left.getMin();
		else
			return dataValue;
	}

	public int getMax(){
		if ( right !=null )
			return right.getMax();
		else
			return dataValue;
	}

	/** print function **/
	public void printPreOrder(){

		System.out.print(dataValue);System.out.print(", ");

		if (left!=null)
			left.printPreOrder();

		if (right!=null)
			right.printPreOrder();

	}

	public void printInOrder(){

		if (left!=null)
			left.printInOrder();

		System.out.print(dataValue);System.out.print(", ");

		if (right!=null)
			right.printInOrder();

	}

	public void printPostOrder(){

		if (left!=null)
			left.printPostOrder();

		if (right!=null)
			right.printPostOrder();

		System.out.print(dataValue);System.out.print(", ");
	}

	public void printBreadth(){
		Deque<Node> q = new LinkedList<Node>();

		q.addFirst(this);

		while ( ! q.isEmpty() ){
			Node n = q.getFirst();q.remove();

			System.out.print( n.getDataValue() + ", ");

			if ( n.left != null ){
				q.addLast(n.left);
			}
			if ( n.right != null ){
				q.addLast(n.right);
			}
		}
	}

	public void printBreadthRL(){
		Deque<Node> q = new LinkedList<Node>();

		q.addFirst(this);

		while ( ! q.isEmpty() ){
			Node n = q.getFirst();q.remove();

			System.out.print( n.getDataValue() + ", ");

			if ( n.right != null ){
				q.addLast(n.right);
			}
			if ( n.left != null ){
				q.addLast(n.left);
			}
		}
	}

	// if the tree was very large, this list would grow very large, the array method limits it
	public void printPaths(LinkedList<Integer> path){
		path.addLast( (Integer) dataValue );
		if ( left == null && right == null){
			System.out.println(path.toString());
		}else{
			if ( left != null ){
				left.printPaths(path);
			}
			if ( right != null ){
				right.printPaths(path);
			}
		}
		path.removeLast();
	}

}