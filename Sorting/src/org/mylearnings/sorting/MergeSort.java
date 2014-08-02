package org.mylearnings.sorting;

public class MergeSort {

	public static void sort(int[] a){
		sort(a, 0, a.length -1);
	}
	/**
	 * 
	 * @param a input array to be sorted
	 * @param p lower bound of the array
	 * @param r upper bound of the array
	 */
	private static void sort(int[] a, int p, int r){
		int q = 0;
		if(p < r){
			q = p + (r - p)/2;
		
		System.out.println("----------------"+p+"----"+q+"---------"+r);
		sort(a, p, q);
		
		sort(a, q+1, r);
		merge(a, p , q, r);
		}
	}
	
	private static void merge(int[] a, int p, int q, int r){
		System.out.println("----------------"+p+"----"+q+"---------"+r);
		// size of the first sub array
		int n1 = q - p + 1;
		// size of the second sub array
		int n2 = r - q;
		// create auxiliary arrays of size n1 and n2
		int[] L = new int[n1+1];
		int[] R = new int[n2+1];
		// copy the elements to auxiliary arrays
		for(int i =0; i<n1; i++){
			L[i] = a[p+i];
		}
		for(int i =0; i<n2; i++){
			R[i] = a[q+i+1];
		}

		L[n1] = Integer.MAX_VALUE;
		R[n2] = Integer.MAX_VALUE;
		
		int i = 0, j = 0;
		for(int k = p; k<= r; k++){
			if(L[i] <= R[j]){
				a[k] = L[i];
				i++;
			} else{
				a[k] = R[j];
				j++;
			}
		}
	}
}
