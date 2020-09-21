package septemberLongChallange2020;
import java.util.*;
public class FindXor {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int a[] = new int[21];
		a[0] = 1;
		for(int i=1; i<a.length; i++) {
			a[i] = 2*a[i-1];
		}
		
		while(t-- > 0) {
			int n = sc.nextInt();
			System.out.println(1+" "+a[20]);
			int sum = sc.nextInt();
			sum = sum-(a[20]*n);
			
			int x = 0;
			if(sum%2 !=0) {
				x=x+1;
			}
			for(int i=1; i<20; i++){
				int us = sum+(a[i]*n);
				System.out.println(1+" "+a[i]);
				
				int js = sc.nextInt();
				if(((us-js)/(a[i]*2))%2 != 0) {
					x = x+a[i];
				}
			}
			System.out.println(2+" "+x);
			System.out.println();
			int o = sc.nextInt();
			
		}
	}
}
