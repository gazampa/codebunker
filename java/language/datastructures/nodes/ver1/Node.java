package datastructures.nodes.ver1;

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

	public Node getLeft(){
		return left;
	}

	public Node getRight(){
		return right;
	}

	public void setLeft(Node node){
		left = node;
	}

	public void setRight(Node node){
		right = node;
	}

	@Override
	public String toString(){
		return Integer.toString(dataValue);
	}

}