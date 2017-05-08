import java.util.List;
import java.util.LinkedList;
import java.util.Deque;
import datastructures.BinaryTree;
import datastructures.BinaryTreeNodeCentric;
import datastructures.nodes.ver1.Node;

class BinaryTreeNodeCentricExample{
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
	*
	*	- follow a logic to placing items into a list.
	*	- smaller go left, larger go right, just like numeric sequence or natural sort of integer
	*	- combines the benefits of sorted lists and binary search
	*	- in Java 8, the Collection HashMap has been modified such that instead of using a LinkedList to store different elements with colliding hashcodes, a Red-Black tree is used. This results in the improvement of time complexity of searching such an element from O(n) to O(log n)
	*	- this is a tree of which i like the methods, all nodes are the same, root is by assignment
	*	- if you had many nodes, it might become difficult to follow the code
	*/
	public static void main(String[] args){

		/** create a traditional binary search tree **/

		Node root = new Node(5);

		BinaryTree b = new BinaryTree(root);

		b.insert(root, 3);
		b.insert(root, 2);
		b.insert(root, 6);
		b.insert(root, 4);
		b.insert(root, 7);
		b.insert(root, 10);
		b.insert(root, 9);
		b.insert(root, 11);

		System.out.println(b.lookup(b.getRoot(), 10));

		System.out.println(b.lookup(b.getRoot(),110));

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
		b.printPaths(new LinkedList<Node>());

		System.out.println(b.calculateNodeSize(b.getRoot()));
		System.out.println(b.calculateTreeSize(b.getRoot()));
		System.out.println(b.calculateMaxDepthLeft(b.getRoot()));
		System.out.println(b.calculateMaxDepthRight(b.getRoot()));
		System.out.println(b.getMin(b.getRoot()));
		System.out.println(b.getMax(b.getRoot()));

		/** all the logic is in the node **/
		datastructures.nodes.ver2.Node rootNode = new datastructures.nodes.ver2.Node(5);

		/** create a binary search tree of just nodes **/

		rootNode.insert(3);
		rootNode.insert(2);
		rootNode.insert(6);
		rootNode.insert(4);
		rootNode.insert(7);
		rootNode.insert(10);
		rootNode.insert(9);
		rootNode.insert(11);

		System.out.println(rootNode.lookup(10));

		System.out.println(rootNode.lookup(110));

		rootNode.printPreOrder();
		System.out.println();
		rootNode.printInOrder();
		System.out.println();
		rootNode.printPostOrder();

		System.out.println();
		rootNode.printBreadth();
		System.out.println();
		rootNode.printBreadthRL();
		System.out.println();
		rootNode.printPaths(new LinkedList<Integer>());

		System.out.println(rootNode.calculateNodeSize());
		System.out.println(rootNode.calculateTreeSize());
		System.out.println(rootNode.calculateMaxDepthLeft());
		System.out.println(rootNode.calculateMaxDepthRight());
		System.out.println(rootNode.getMin());
		System.out.println(rootNode.getMax());

	}

}