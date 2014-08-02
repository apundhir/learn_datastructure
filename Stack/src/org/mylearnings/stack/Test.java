package org.mylearnings.stack;

import java.util.Iterator;
import java.util.Stack;

public class Test {
	public static void main(String[] args) {
		ParameterizedstackWithArray<String> myStack = new ParameterizedstackWithArray<String>(5);
		myStack.push("ajay1");
		myStack.push("ajay2");
		myStack.push("ajay3");
		myStack.push("ajay4");
		Iterator<String> itr = myStack.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}
}
