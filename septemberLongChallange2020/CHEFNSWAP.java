package septemberLongChallange2020;

import java.util.*;
public class CHEFNSWAP {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0) {
			int n = sc.nextInt();
			int sum = n*(n+1)/2;
			if(sum%2 != 0) {
				System.out.println(0);
			}else {
				int h = sum/2;
				int swap = 0;
				int s = 0;
				for(int i=n; s<h; i--) {
					s= s+i;
					swap++;
				}
				System.out.println(swap);
			}
		}
		
	}
}
