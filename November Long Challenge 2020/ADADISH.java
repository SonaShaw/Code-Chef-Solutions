package NovLongChallange;

import java.util.*;

public class ADADISH {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int t  = sc.nextInt();
		/*
		while(t-- > 0) {
			int n = sc.nextInt();
			int a[] = new int[n];
			for(int i=0; i<n; i++)
				a[i] = sc.nextInt();
			Arrays.sort(a);
			int sa = a[a.length-1];
			int sb = a[a.length-2];
			for(int i=a.length-3; i>=0; i--) {
				if(a[i]+sa < a[i] + sb)
					sa = sa+a[i];
				else
					sb = sb + a[i];
			}
			if(sa>sb)
				System.out.println(sa);
			else
				System.out.println(sb);
			
		}
		*/
		
		
		while(t-- > 0) {
			int n = sc.nextInt();
			int a[] = new int[n];
			for(int i=0; i<n; i++)
				a[i] = sc.nextInt();
			Arrays.sort(a);
			int sa = a[a.length-1];
			int sb = 0;
			for(int i=a.length-2; i>=0; i--) {
				if(a[i]+sa < a[i] + sb)
					sa = sa+a[i];
				else
					sb = sb + a[i];
			}
			if(sa>sb)
				System.out.println(sa);
			else
				System.out.println(sb);
		}
	}
}
