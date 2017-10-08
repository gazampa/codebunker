package datastructures;

import java.util.List;
import java.util.LinkedList;
import java.util.Deque;
import datastructures.nodes.ver1.Node;

public class BinaryTree{

	private Node root;

	public BinaryTree(){ }

	public BinaryTree(Node root){
		this.root = root;
	}

	public void setRoot(Node root){
		this.root = root;
	}

	public Node getRoot(){
		return root;
	}

	/** insert function **/
	public void insert(Node node, int value){

		if ( root == null )
			setRoot(node);

		if ( value == node.getDataValue() )
			return;

		if (value < node.getDataValue()){
			if ( node.getLeft() !=null ){
				insert(node.getLeft(), value);
			}else{
				node.setLeft(new Node(value));
			}
		}

		if ( value > node.getDataValue() ){
			if ( node.getRight() != null ){
				insert(node.getRight(), value);
			}else{
				node.setRight(new Node(value));
			}
		}
	}

	/** look up function --> combining sorted lists and binary search efficiency **/
	public boolean lookup(Node node, int target){
		boolean result = false;

		if ( node == null )
			return false;

		if ( target == node.getDataValue() )
			return true;

		if ( node.getRight() != null && target > node.getDataValue() )
			result = lookup(node.getRight(), target);

		if ( node.getLeft() != null && target < node.getDataValue() )
			result = lookup(node.getLeft(), target);

		return result;
	}

	/** size functions **/
	public int calculateNodeSize(Node node){
		int result = 1;

		if ( node == null )
			return 0;

		if (node.getLeft() == null && node.getRight() == null)
			return result;

		if ( node.getLeft()!=null )
			result++;

		if ( node.getRight()!=null )
			result++;

		return result;
	}

	public int calculateTreeSize(Node node){
		int result=1;

		if ( node == null )
			return 0;

		if ( node.getLeft()!=null){
			result+=calculateTreeSize(node.getLeft());
		}

		if ( node.getRight()!=null){
			result+=calculateTreeSize(node.getRight());
		}

		return result;

	}

	/** Depth Functions **/
	public int calculateMaxDepthLeft(Node node){
		int counter = 1;
		if ( node.getLeft()!=null){
			counter+=calculateMaxDepthLeft(node.getLeft());
		}
		return counter;
	}

	public int calculateMaxDepthRight(Node node){
		int counter = 1;
		if ( node.getRight()!=null)
			counter+=calculateMaxDepthRight(node.getRight());

		return counter;

	}

	/** Min and Max **/
	public int getMin(Node node){
		if ( node.getLeft() !=null )
			return getMin(node.getLeft());
		else
			return node.getDataValue();
	}

	public int getMax(Node node){
		if ( node.getRight() !=null )
			return getMax(node.getRight());
		else
			return node.getDataValue();
	}

	/** print function **/
	public void printPreOrder(Node node){

		System.out.print(node.getDataValue());System.out.print(", ");

		if (node.getLeft()!=null)
			printPreOrder(node.getLeft());

		if (node.getRight()!=null)
			printPreOrder(node.getRight());

	}

	public void printInOrder(Node node){

		if (node.getLeft()!=null)
			printInOrder(node.getLeft());

		System.out.print(node.getDataValue());System.out.print(", ");

		if (node.getRight()!=null)
			printInOrder(node.getRight());

	}

	public void printPostOrder(Node node){

		if (node.getLeft()!=null)
			printPostOrder(node.getLeft());

		if (node.getRight()!=null)
			printPostOrder(node.getRight());

		System.out.print(node.getDataValue());System.out.print(", ");
	}

	public void printBreadth(){
		Deque<Node> q = new LinkedList<Node>();

		q.addFirst(root);

		while ( ! q.isEmpty() ){
			Node n = q.getFirst();q.remove();

			System.out.print( n.getDataValue() + ", ");

			if ( n.getLeft() != null ){
				q.addLast(n.getLeft());
			}
			if ( n.getRight() != null ){
				q.addLast(n.getRight());
			}
		}
	}

	public void printBreadthRL(){
		Deque<Node> q = new LinkedList<Node>();

		q.addFirst(root);

		while ( ! q.isEmpty() ){
			Node n = q.getFirst();q.remove();

			System.out.print( n.getDataValue() + ", ");

			if ( n.getRight() != null ){
				q.addLast(n.getRight());
			}
			if ( n.getLeft() != null ){
				q.addLast(n.getLeft());
			}
		}
	}

	// if the tree was very large, this list would grow very large, the array method limits it
	public void printPaths(LinkedList<Node> path){
		if (path.isEmpty()) path.addLast( root );
		Node node = path.peekLast();
		if ( node.getLeft() == null && node.getRight() == null){
			System.out.println(path.toString());
		}else{
			if ( node.getLeft() != null ){
				path.addLast(node.getLeft());
				printPaths(path);
			}
			if ( node.getRight() != null ){
				path.addLast(node.getRight());
				printPaths(path);
			}
		}
		path.removeLast();
	}

}