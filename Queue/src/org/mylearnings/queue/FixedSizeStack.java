package org.mylearnings.queue;


public class FixedSizeStack {
	// Fixed size array based Stack
	private String[] stack;
	private int size;
	private int index;

	public FixedSizeStack(int size) {
		this.size = size;
		index = -1;
		stack = new String[size];
	}

	public int getSize() {
		return size;
	}
	
	public boolean isFull(){
		return index == size;
	}

	public void push(String arg) throws MyExceptions {
		if (index < size-1) {
			stack[++index] = arg;
		} else {
			System.out.println("Stack already filled!!");
			throw new MyExceptions("Stack already filled!!");
		}
	}

	public boolean isEmpty() {
		return index == -1;
	}

	public String pop() throws MyExceptions{
		if (index != -1) {
			String item = stack[index];
			index--;
			return item;
		} else{
			System.out.println("Empty Stack");
			throw new MyExceptions("Empty Stack");
		}
	}
}
