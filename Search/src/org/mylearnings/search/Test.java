package org.mylearnings.search;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] a = {1, 4, 67, 8, 9 ,0 ,1, 34};
		System.out.println(Search.binarySearch(a, 8));
		System.out.println(Search.sequentialSearch(a, 8));
		System.out.println(Search.binarySearch(a, 45));
		System.out.println(Search.sequentialSearch(a, -20));

	}

}
