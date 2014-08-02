package org.mylearnings.sorting;

/*
 * Shuffle the array.
 Partition so that, for some j
 – entry a[j] is in place
 – no larger entry to the left of j
 – no smaller entry to the right of j

 Sort
 each piece recursively.
 *
 * in-place sorting algorithm
 * It is not stable Algo
 */
public class QuickSortAlgo {

	public static void sort(Comparable[] a) {
		//StdRandom.shuffle(a);
		sort(a, 0, a.length - 1);
	}

	private static void sort(Comparable[] a, int lo, int hi) {
		if (hi <= lo)
			return;
		int j = partition(a, lo, hi);
		sort(a, lo, j - 1);
		sort(a, j + 1, hi);
	}

	private static int partition(Comparable[] a, int lo, int hi) {
		int i = lo, j = hi + 1;
		while (true) {
			// find item on left to swap
			while (less(a[++i], a[lo]))
				if (i == hi)
					break;
			// find item on right to swap
			while (less(a[lo], a[--j]))
				if (j == lo)
					break;
			// check if pointers cross
			if (i >= j)
				break;
			exch(a, i, j);
		}
		// swap with partitioning item
		exch(a, lo, j);
		// return index of item now known to be in place
		return j;
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
