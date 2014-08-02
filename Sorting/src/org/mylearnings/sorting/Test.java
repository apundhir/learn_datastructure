package org.mylearnings.sorting;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*Integer[] list = {3, 6, 9, 12, 1};
		Insertion.sort(list);
		System.out.println(Insertion.isSorted(list));*/
		
		
		
		Integer[] list2 = {3, 6, 9, 12, 1};
		/*try {
			is.sort(list2);
		} catch (MyException e) {
			e.getMessage();
		}
		
		for(int i = 0; i< list2.length; i++)
			System.out.println(list2[i]);
*/
		
		
		//int[] list3 = {1, 3, 6, 9 ,2, 7, 12};
		/*String[] list3 = {"vijay", "amit"};
		Selection.sort(list3);
		for(String item: list3){
			System.out.println(item);
		}
		*/
		
		MergeSortAlgo.sort(list2);
		System.out.println(MergeSortAlgo.isSorted(list2));
		System.out.println(list2.length);
		for(Integer i : list2){
			System.out.println(i);
		}
		
		/*QuickSort.sort(list2);
		for (int i=0; i<list2.length; i++)
	        System.out.print(list2[i] + "  "); */
	      //System.out.println("");   
	}

}
