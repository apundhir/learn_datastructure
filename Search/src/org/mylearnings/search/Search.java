package org.mylearnings.search;

public class Search {

	/**
	 * 
	 * @param a		input array
	 * @param key	key to be searched
	 * @return	index of the key if found, else -1
	 */
	public static int sequentialSearch(int[] a, int key){
		for(int i=0; i< a.length; i++){
			if(a[i] == key){
				return i;
			}
		}
		return -1;
	}
	/**
	 * 
	 * @param a		input array, must be sorted
	 * @param key	key to be searched
	 * @return	index of the key if found else -1
	 * 
	 */
	public static int binarySearch(int[] a, int key){
		return binarySearch(a, key, 0, a.length -1);
	}
	private static int binarySearch(int[] a, int key, int low, int high){
		if(low > high)
			return -1;
		else{
			int mid = (low+high)/2;
			if(key == a[mid]){
				return mid;
			}
			else if(key > a[mid]){
				return binarySearch(a, key, mid+1, high);
			} else{
				return binarySearch(a, key, low, mid-1);
			}
		}
	}
}
