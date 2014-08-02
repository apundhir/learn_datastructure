package org.mylearnings.queue;


public class QueueWithTwoStacks {
	@SuppressWarnings("unused")
	private int size;
	// This stack will be used for enque purpose
	private FixedSizeStack stack1;
	// this stack will be used for deque purpose
	private FixedSizeStack stack2;
	
	public QueueWithTwoStacks(int size){
		this.size = size;
		stack1 = new FixedSizeStack(size);
		stack2 = new FixedSizeStack(size);
	}
	
	
	
	public boolean isEmpty(){
		return stack1.isEmpty() && stack2.isEmpty();
	}
	
	public void enque(String item){
		// Push the item on stack 1 if it is not full
		if(!stack1.isFull())
			try {
				stack1.push(item);
				return;
			} catch (MyExceptions e) {
				// TODO Auto-generated catch block
				e.getMessage();
			}
		// if stack1 is full and stack 2 is empty then push all the stack 1 items to stack 2 and then add item on stack1
		else if(stack2.isEmpty()){
			while(!stack1.isEmpty()){
				try {
					stack2.push(stack1.pop());
				} catch (MyExceptions e) {
					// TODO Auto-generated catch block
					e.getMessage();
				}
			}
			try {
				stack1.push(item);
				return;
			} catch (MyExceptions e) {
				// TODO Auto-generated catch block
				e.getMessage();
			}
		}
		else{
			System.out.println("Queue is full");
		}
	}
	
	public String deque(){
		if(!stack2.isEmpty()){
			try {
				return stack2.pop();
			} catch (MyExceptions e) {
				// TODO Auto-generated catch block
				e.getMessage();
			}
		}
		else if(!stack1.isEmpty()){
			while(!stack1.isEmpty()){
				try {
					stack2.push(stack1.pop());
				} catch (MyExceptions e) {
					// TODO Auto-generated catch block
					e.getMessage();
				}
			}
			try {
				return stack2.pop();
			} catch (MyExceptions e) {
				// TODO Auto-generated catch block
				e.getMessage();
			}
		}
		else{
			System.out.println("Queue is empty");
		}
		return null;
	}
}
