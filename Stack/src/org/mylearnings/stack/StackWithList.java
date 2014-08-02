package org.mylearnings.stack;

public class StackWithList {
	
	private Node head = null;
	/*
	 * Inner class as node
	 */
	private class Node{
		String item;
		Node next;
	}
	
	public boolean isEmpty(){
		return head == null;
	}
	
	public void push(String item){
		Node oldHead = head;
		head = new Node();
		head.item = item;
		head.next = oldHead;
	}
	
	public String pull(){
		String item = head.item;
		head = head.next;
		return item;
	}
}
