package codeChef;

import java.util.*;
public class ModeOfFreq {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int t= sc.nextInt();
		while(t-->0) {
			int n = sc.nextInt();
			int a[] = new int[n];
			for(int i=0; i<a.length; i++)
				a[i] = sc.nextInt();
			int res = sol(a);
			System.out.println(res);
			
		}
	}

	private static int sol(int[] a) {
		int b[] = new int[11];
		int c[] = new int[11];
		for(int i=0; i<a.length; i++) {
			b[a[i]]++;
		}
		for(int i=0; i<b.length; i++) {
			c[b[i]]++;
		}
		int max = 1;
		for(int i=1; i<c.length; i++) {
			if(c[i] > c[max]) {
				max = i;
			}
		}
		return max;
	}
}
