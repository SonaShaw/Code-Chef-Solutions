package codeChef;

import java.util.*;

public class SubseqFreqCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int n = sc.nextInt();
			int arr[] = new int[n];
			int res[] = new int[n];
			int freq[] = new int[(int) Math.pow(2, arr.length) - 1];
			for(int i=0; i<arr.length; i++) 
				arr[i] = sc.nextInt();
			
			
			ArrayList<ArrayList<Integer>> powerSet = new ArrayList<>();
			ArrayList<Integer> subset = new ArrayList<Integer>();
			findAllSubsets(arr, powerSet, subset, 0);
			
			for(ArrayList<Integer> sub : powerSet) {
				int temp[] = new int[arr.length];
				for(int i=0; i<arr.length; i++) {
					for(int x : sub) {
						if(x == arr[i]) {
							temp[i]++;
						}
					}
				}
			}
			
			System.out.println(powerSet);
			
		}
	}

	private static void findAllSubsets(int[] arr, ArrayList<ArrayList<Integer>> powerSet, ArrayList<Integer> subset,
			int startIndex) {
		if(!subset.isEmpty()) {
			powerSet.add(new ArrayList<>(subset));
		}
		for(int i=startIndex; i<arr.length; i++) {
			subset.add(arr[i]);
			findAllSubsets(arr, powerSet, subset, i+1);
			subset.remove(subset.size()-1);
		}
		
	}

}
