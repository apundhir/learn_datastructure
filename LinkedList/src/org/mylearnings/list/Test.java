package org.mylearnings.list;

public class Test {

	public static void main(String[] args) {
		LinkedList<Integer> myList = new LinkedList<Integer>();
		System.out.println(myList.size());
		myList.appendWithStack(1);
		myList.appendWithStack(2);
		System.out.println(myList.size());
		try {
			System.out.println(myList.getNth(4));
		} catch (MyException e) {
			System.out.println(e.getMessage());
		}
	}

}
