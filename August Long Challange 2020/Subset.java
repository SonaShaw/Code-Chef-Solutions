package codeChef;

import java.util.*;

public class Subset {

	public static void main(String[] args) {
		
		ArrayList<ArrayList<Integer>> result = new ArrayList<>();
		ArrayList<Integer> subset = new ArrayList<Integer>();		
		int arr[] = {1,2,3};
		//int freq[] = new int[(int) (Math.pow(2, arr.length)-1)];
		if(arr == null || arr.length == 0) {
			System.out.print("Emplty Set");
			return;
		}
		
		findAllSubsets(arr, result, subset, 0);
		
		System.out.println(result);
		
	}

	private static  void findAllSubsets(int[] arr, ArrayList<ArrayList<Integer>> result,
			ArrayList<Integer> subset, int startIndex) {
		//if(!subset.isEmpty()) {
			
		//}
		for(int i=startIndex; i<arr.length; i++) {
			subset.add(arr[i]);
			findAllSubsets(arr, result, subset, i+1);
			subset.remove(subset.size()-1);
			
		}
		result.add(new ArrayList<>(subset));
	}
}
