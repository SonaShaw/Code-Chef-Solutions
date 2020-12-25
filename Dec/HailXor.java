package DecLongChallenge;

import java.util.*;

public class HailXor {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0) {
			int n = sc.nextInt();
			long x = sc.nextLong();
			long a[] = new long[(int)n];
			for(int i=0; i<n; i++)
				a[i] = sc.nextLong();
			int i=0;
			long z=0, k, p, r;
			int j;
			//int z =0;
			for( k=x; k>0&&i<n-1; k--) {
				boolean flag = false;
				p = (long)(Math.log(a[i])/Math.log(2));
				r = (long)Math.pow(2, p);
				a[i] = a[i]^r;
				for(j=i+1; j<n; j++) {
					if((a[j]^r)<a[j]) {
						a[j]=a[j]^r;
						flag=true;
						break;
					}
				}
				if(flag == false) {
					a[n-1]=a[n-1]^r;
				}
				while(a[i]<=0) {
					i++;
				}
				z = k+1;
			}
				if(z>=0) {
					if(n<3 && z%2==1) {
						a[n-1]=a[n-1]^1;
						a[n-2]=a[n-2]^1;
					}
				}
			
			for(int m=0; m<n; i++) {
				System.out.print(a[m]+" ");
			}
			System.out.println();
		}
		
	}
}
