package codeChef;

import java.io.*; 
import java.util.*; 
  
class Stripe { 
  
      // function to find the length of longest 
      // subarray having sum k 
      static int sol(int[] arr, int n, int k) 
      { 
             // HashMap to store (sum, index) tuples 
             HashMap<Integer, Integer> map = new HashMap<>(); 
             int sum = 0, maxLen = 0; 
  
             // traverse the given array 
             for (int i = 0; i < n; i++) { 
                  
                  // accumulate sum 
                  sum += arr[i]; 
                  
                  // when subarray starts from index '0' 
                  if (sum == k) 
                      maxLen = i + 1; 
  
                  // make an entry for 'sum' if it is 
                  // not present in 'map' 
                  if (!map.containsKey(sum)) { 
                      map.put(sum, i); 
                  } 
  
                  // check if 'sum-k' is present in 'map' 
                  // or not 
                  if (map.containsKey(sum - k)) { 
                        
                      // update maxLength 
                      if (maxLen < (i - map.get(sum - k))) 
                          maxLen = i - map.get(sum - k); 
                  } 
             } 
               
             return maxLen;              
      } 
  
      // Driver code 
      public static void main(String args[]) 
      { 
             
             Scanner sc = new Scanner(System.in);
     		 int t= sc.nextInt();
     		while(t-->0) {
     			int n = sc.nextInt();
     			int a[] = new int[n];
     			for(int i=0; i<a.length; i++)
     				a[i] = sc.nextInt();
     			int res = sol(a, a.length, 0);
     			if(res == 1) {
     				int cnt =0;
     				for(int i=0; i<a.length; i++) {
     					if(a[i] == 0)
     						cnt++;
     				}
     				if(cnt%2!=0) {
     					System.out.println("Yes");
     					continue;
     				}
     				
     			}
     			if(res%2!=0 && res>=3) {
         			System.out.println("Yes");
         		}else
         			System.out.println("No");
     			
     		}
     		
            // System.out.println("Length = " +  lenOfLongSubarr(arr, n, k)); 
      } 
} 
