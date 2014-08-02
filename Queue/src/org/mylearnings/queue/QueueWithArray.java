package org.mylearnings.queue;
/**
 *  Array based implementation of Queue, with front and rear referances,
 *  Total number of items queue can accomodate is arraySize - 1
 *
 */
public class QueueWithArray {
	private String[] queue;
	private int arraySize;
	private int front=0, rear=0;
	
	public QueueWithArray(int n) {
		arraySize = n;
		queue = new String[arraySize];
	}

	public boolean isEmpty(){
		return front == rear;
	}
	
	public int size(){
		return ((arraySize - (front - rear)) % arraySize);
	}
	
	public void enque(String val) throws MyExceptions{
		if(size() == arraySize-1){
			throw new MyExceptions("Queue is Full");
		} else{
			queue[rear] = val;
			rear = (rear+1) % arraySize;
		}
	}
	
	public String deque() throws MyExceptions{
		if(isEmpty()){
			throw new MyExceptions("Queue is Empty");
		} else{
			String result = queue[front];
			front = (front+1)% arraySize;
			return result;
		}
	}
}
