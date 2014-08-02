package org.mylearnings.sorting;

import java.util.Arrays;

/**
 * Insertion Sort: start from 2nd item(jth location) in the array, see if it can
 * fit in sorted order from j-1 to 0, at any point all the elements before j are
 * sorted
 * 
 * Best case: N-1, Worst case: 1/2 N2 compares and almost same order of exchanges
 * runs in linear time for partially sorted arrays
 */

public class Insertion {

	public static void sort(Comparable[] a){
		 int N = a.length;
		 for (int i = 0; i < N; i++)
			 for (int j = i; j > 0; j--)
				 if (less(a[j], a[j-1]))
					 exch(a, j, j-1);
				 else break;
		 }

	private static boolean less(Comparable v, Comparable w) {
		return v.compareTo(w) < 0;
	}

	private static void exch(Comparable[] a, int i, int j) {
		Comparable swap = a[i];
		a[i] = a[j];
		a[j] = swap;
	}

	public static boolean isSorted(Comparable[] a) {
		for (int i = 1; i < a.length; i++)
			if (less(a[i], a[i - 1]))
				return false;
		return true;
	}
}
