package org.mylearnings.queue;
/*
 *  List based Queue(FIFO) implementation
 *  new Item is added at the tail
 *  items are popped from head
 */
public class QueueWithList {
	/*
	 *  Inner class to represent node of the list
	 */
	private class Node{
		String item;
		Node next;
	}

	// Add the new item to the tail
	public void enque(String item){
		Node node = new Node();
		node.item = item;
		node.next = null;
		if(isEmpty()){
			head = node;
			tail = head;
		}
		else{
			tail.next = node;
			tail = node;
		}
	}
	
	// remove item from front
	public String deque(){
		String item = head.item;
		head = head.next;
		if(isEmpty()){
			tail = null;
		}
		return item;
	}
	
	//
	public boolean isEmpty(){
		return head == null;
	}
	
	private Node head = null;
	private Node tail = null;
}
