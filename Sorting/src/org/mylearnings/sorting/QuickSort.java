package org.mylearnings.sorting;

public class QuickSort {
	public static void sort(int[] a){
		sort(a, 0, a.length -1);
	}
	private static void sort(int[] a, int p, int r){
		if(p < r){
			int q = partition(a, p, r);
			sort(a, p, q);
			sort(a, q+1, r);
		}
	}
	
	private static int partition(int[] a, int p, int r ){
		int x = a[r];	// pivot element
		int i = p-1;
		int j = r+1;
		while(true){
			do { j--;} while (a[j] > x);
	        do { i++;} while (a[i] < x);
	        if( i < j){
	        	swap(a,i,j);
	        }
	        else{
	        	return j;
	        }
		}
	}
	private static void swap(int[] a, int i, int j){
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
}
