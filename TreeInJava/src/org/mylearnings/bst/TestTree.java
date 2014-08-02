package org.mylearnings.bst;

public class TestTree {
	public static void main(String[] args){
		BinaryTree<String, Integer> tree = new BinaryTree<String, Integer>();
		System.out.println("Size: "+ tree.size());
		tree.insert("A", 5);
		tree.insert("C", 3);
		tree.insert("E", 2);
		tree.insert("R", 1);
		tree.insert("H", 1);
		tree.insert("M", 1);
		tree.insert("S", 1);
		tree.insert("X", 1);
		System.out.println("Size: "+ tree.size());
		System.out.println("Max Depth: "+ tree.maxDepth());
		System.out.println("Min Value: "+ tree.minValue());
		tree.printTree();
		System.out.println("\nisBST ?? "+tree.isBST());
		tree.delete("E");
		tree.printTree();
		
	}
}
