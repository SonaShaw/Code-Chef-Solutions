package sepLunchTime2020;

import java.util.*;
public class WATMELON {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0) {
			int n = sc.nextInt();
			int a[] = new int[n+1];
			for(int i=1;i<a.length; i++) {
				a[i] = sc.nextInt();
			}
			int s = 0;
			for(int x:a) {
				s=s+x;
			}
			
				if(s>=0)
					System.out.println("YES");
				else
					System.out.println("NO");
					
		}
	}
}
