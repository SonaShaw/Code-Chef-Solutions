package septemberLongChallange2020;

import java.util.*;
public class CHFNSWARP {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0) {
			int n = sc.nextInt();
			int a[] = new int[n];
			int sum = 0;
			int cnt = 0;
			for(int i=1; i<=n; i++) {
				a[i-1] = i;
				sum+=i;
			}
			if(sum%2 == 0) {
				for(int i=0; i<n; i++) {
					for(int j=i+1; j<n; j++) {
						swap(a,i,j);
						if(isNiceSwap(a, sum))
							cnt++;
						swap(a,i,j);
					}
				}
			}else {
				cnt = 0;
			}
			System.out.println(cnt);
			
		}
	}

	private static boolean isNiceSwap(int[] a, int sum) {
		int s = sum;
		boolean res = false;
		
		for(int i=a.length-1; i>=0; i--) {
			int d = s-a[i];
			int half = sum/2;
			if(d == half) {
				res = true;
				break;
			}
			if(d<half)
				break;
			s = d;
		}
		return res;
	}

	

	private static void swap(int[] a, int i, int j) {
		int temp = a[j];
		a[j] = a[i];
		a[i] = temp;	
	}
}
