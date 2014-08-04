package org.mylearnings.list;

import java.util.Stack;

public class LinkedList<Item extends Comparable<Item>> {
	private Node head;

	private class Node {
		Item item;
		Node next;

		Node(Item item) {
			this.item = item;
		}
	}

	public int size() {
		Node curr = head;
		int count = 0;
		if (curr != null) {
			while (curr != null) {
				count++;
				curr = curr.next;
			}
		}
		return count;
	}

	public void append(Item item) {
		Node temp = new Node(item);
		Node curr = head;
		if (curr == null) {
			head = temp;
		} else {
			while (curr.next != null) {
				curr = curr.next;
			}
			curr.next = temp;
		}
	}

	public void appendWithStack(Item item) {
		Node curr = head;
		Node temp = new Node(item);
		if (curr == null) {
			head = temp;
		} else {
			Stack<Node> stack = new Stack<Node>();
			while (curr.next != null) {
				stack.push(curr);
				curr = curr.next;
			}
			curr.next = temp;
		}
	}

	public Item getNth(int index) throws MyException{
		Node curr = head;
		int count = 0;
		if(index > size()){
			throw new MyException("Index is more than list size");
		}
		while (curr != null) {
			if (count == index)
				return curr.item;
			count++;
			curr = curr.next;
		}
		return null;
	}

	public void deleteFromHead() {
		if (head != null)
			head = head.next;
	}
	
	public void deleteNth(int index){
		
	}

}
