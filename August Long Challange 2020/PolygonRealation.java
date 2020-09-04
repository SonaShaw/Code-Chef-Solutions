package codeChef;

import java.util.*;


public class PolygonRealation {
	public static void main(String srgs[]) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0) {
			int n =sc.nextInt();
			int a[][] = new int[n][2];
			try {
				for(int i=0; i<a.length; i++) {
					a[i][0] = sc.nextInt();
					a[i][1] = sc.nextInt();
				}
				int sides = n;
				int sum = 0;
				while(sides>=6) {
					sum = sum + sides/2;
					sides = sides/2;
				}
				System.out.println(n+sum);
			}catch(Exception e) {
				return;
			}
			
		}
	}
}
