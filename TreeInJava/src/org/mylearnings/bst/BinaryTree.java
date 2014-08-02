package org.mylearnings.bst;

public class BinaryTree<Key extends Comparable<Key>, Value> {

	private Node root;

	{
		root = null;
	}

	/**
	 * --Node-- The binary tree is built using this nested node class. Each node
	 * stores one data element, and has left and right sub-tree pointer which
	 * may be null. The node is a "dumb" nested class -- we just use it for
	 * storage; it does not have any methods.
	 */
	private class Node {
		Node left;
		Node right;
		Key key;
		Value value;

		Node(Key key, Value value) {
			this.key = key;
			this.value = value;
		}
	}

	/**
	 * Returns true if the given target is in the binary tree. Uses a recursive
	 * helper.
	 */
	public boolean lookup(Key data) {
		return lookup(root, data);
	}

	/**
	 * Helper function to implement lookup
	 */
	private boolean lookup(Node root, Key key) {
		if (root == null) {
			return false;
		} else if (key.compareTo(root.key) == 0) {
			return true;
		} else if (key.compareTo(root.key) <= 0) {
			return lookup(root.left, key);
		} else {
			return lookup(root.right, key);
		}
	}

	/**
	 * Inserts the given data into the binary tree. Uses a recursive helper.
	 */
	public void insert(Key key, Value value) {
		root = insert(root, key, value);
	}

	/**
	 * Helper function to implement insert
	 */
	private Node insert(Node root, Key key, Value value) {
		if (root == null) {
			root = new Node(key, value);
		} else if (key.compareTo(root.key) <= 0) {
			root.left = insert(root.left, key, value);
		} else {
			root.right = insert(root.right, key, value);
		}
		return root;
	}

	/**
	 * 
	 * @return the size of the tree, i.e total number of nodes present in the
	 *         tree
	 */
	public int size() {
		return size(root);
	}

	/**
	 * Helper function to calsulate size of the tree
	 */
	private int size(Node root) {
		if (root == null) {
			return 0;
		} else {
			return size(root.left) + 1 + size(root.right);
		}
	}

	/**
	 * Return maximum Depth of the tree
	 */
	public int maxDepth() {
		return maxDepth(root);
	}

	private int maxDepth(Node root) {
		if (root == null) {
			return 0;
		} else {
			int left = maxDepth(root.left);
			int right = maxDepth(root.right);
			return (Math.max(left, right) + 1);
		}
	}

	/**
	 * @return minimum value of an non empty tree
	 */
	public Value minValue() {
		return minValue(root);
	}

	private Value minValue(Node root) {
		while (root.left != null) {
			root = root.left;
		}
		return root.value;
	}

	/**
	 * Print tree elements in Inorder
	 */
	public void printTree() {
		System.out.print("Inorder: ");
		printTree(root);
	}

	private void printTree(Node root) {
		if (root == null) {
			return;
		} else {
			printTree(root.left);
			System.out.print("Key: " + root.key + " Value: " + root.value);
			printTree(root.right);
		}
	}

	/**
	 * Given a tree and a sum, returns true if there is a path from the root
	 * down to a leaf, such that adding up all the values along the path equals
	 * the given sum. Strategy: subtract the node value from the sum when
	 * recurring down, and check to see if the sum is 0 when you run out of
	 * tree.
	 */
	/*
	 * public boolean hasPathSum(int sum) { return( hasPathSum(root, sum) ); }
	 */

	public boolean isBST() {
		return isBST(root, null, null);
	}

	private boolean isBST(Node root, Key minKey, Key maxKey) {
		if (root == null)
			return true;
		if (minKey != null && (minKey.compareTo(root.key) > 0))
			return false;
		if (maxKey != null && (maxKey.compareTo(root.key) <= 0))
			return false;
		return isBST(root.left, minKey, root.key)
				&& isBST(root.right, root.key, maxKey);
	}

	public void deleteMin() {
		root = deleteMin(root);
	}

	private Node deleteMin(Node x) {
		if (x.left == null)
			return x.right;
		x.left = deleteMin(x.left);
		return x;
	}

	public void delete(Key key) {
		root = delete(root, key);
	}

	private Node delete(Node x, Key key) {
		if (x == null)
			return null;
		int cmp = key.compareTo(x.key);
		// Search for the key
		if (cmp < 0)
			x.left = delete(x.left, key);
		else if (cmp > 0)
			x.right = delete(x.right, key);
		else {
			// Case1: No right child 
			if (x.right == null)
				return x.left;
			// No left child
			if (x.left == null)
				return x.right;
			
			Node t = x;
			x = min(t.right);
			x.right = deleteMin(t.right);
			x.left = t.left;
		}
		return x;
	}

	private Node min(Node root) {
		while (root.left != null) {
			root = root.left;
		}
		return root;
	}
}
