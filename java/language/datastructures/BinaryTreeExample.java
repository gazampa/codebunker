import java.util.LinkedList;
import datastructures.BinaryTree;
import datastructures.nodes.ver1.Node;

class BinaryTreeExample{
	/**
	*						          5           		  5
    *						         / \				 / \
    *						        4   8				3   6
    *						       /   / \			   / \   \
    *						      11  13  4			  2   4   7
    *						     /  \      \			       \
    *						    7    2      1					10
	*															/ \
	*												    	   9  11
	*	- follow a logic to placing items into a list.
	*	- smaller go left, larger go right, just like numeric sequence or natural sort of integer
	*	- combine the benefits of sorted lists and binary search
	*	- in Java 8, the Collection HashMap has been modified such that instead of using a LinkedList to store different elements with colliding hashcodes, a Red-Black tree is used. This results in the improvement of time complexity of searching such an element from O(n) to O(log n)
	*	- this is a traditional looking binary tree written in a recursive style
	*	- by overloading methods you can clean up method signaturesyy
	*/
	public static void main(String[] args){

		/** create a binary search tree **/

		Node root = new Node(5);

		BinaryTree b = new BinaryTree();

		b.setRoot(root);

		b.insert(root, 3);
		b.insert(root, 2);
		b.insert(root, 6);
		b.insert(root, 4);
		b.insert(root, 7);
		b.insert(root, 10);
		b.insert(root, 9);
		b.insert(root, 11);

		System.out.println(b.lookup(b.getRoot(), 10));

		System.out.println(b.lookup(b.getRoot(),11));

		b.printPreOrder(b.getRoot());
		System.out.println();
		b.printInOrder(b.getRoot());
		System.out.println();
		b.printPostOrder(b.getRoot());

		System.out.println();
		b.printBreadth();
		System.out.println();
		b.printBreadthRL();
		System.out.println();
		//b.printPaths(new LinkedList<Integer>());

		System.out.println(b.calculateNodeSize(b.getRoot()));
		System.out.println(b.calculateTreeSize(b.getRoot()));
		System.out.println(b.calculateMaxDepthLeft(b.getRoot()));
		System.out.println(b.calculateMaxDepthRight(b.getRoot()));
		System.out.println(b.getMin(b.getRoot()));
		System.out.println(b.getMax(b.getRoot()));

	}

}