package april2021LongChallenge;

import java.util.*;

public class WorthyMatrix {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int k = sc.nextInt();
			
			long a[][] = new long[n][m];
			
			for(int i=0 ;i<n; i++) {
				for(int j=0; j<m; j++) {
					a[i][j] = sc.nextLong();
				}
			}
			
			int res  = sol(a, n, m, k);
			System.out.println(res);
		}
				
	}

	private static int sol(long[][] a, int n, int m, int k) {
		// TODO Auto-generated method stub
		long prefix[][] = new long[n][m];
		prefix[0][0] = a[0][0];
		for(int i=1; i<m; i++)
			prefix[0][i] = prefix[0][i-1]+ a[0][i];
		for(int i=1; i<n; i++)
			prefix[i][0] = prefix[i-1][0] +a[i][0];
		for(int i=1; i<n; i++) {
			for(int j=1; j<m; j++) {
				prefix[i][j] = prefix[i][j-1]+prefix[i-1][j]-prefix[i-1][j-1]+a[i][j];
			}
		}
		
		int cnt = 0;
		for(int size=1; size<=Math.min(n, m); size++) {
			for(int i=0; i+size-1<n; i++) {
				for(int j=0; j+size-1<m; j++) {
					long p = prefix[i+size-1][j+size-1];
					long q = ((i-1)<0)?0:prefix[i-1][j+size-1];
					long r = ((i-1)<0 || (j-1)<0)?0:prefix[i-1][j-1];
					long s = ((j-1)<0)?0:prefix[i+size-1][j-1];
					double sum = (p+r)-(q+s);
					if((sum/(size*size))>=k)
						cnt++;
				}
			}
		}
		
		return cnt;
		/*
		System.out.println("cnt  "+cnt);
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				System.out.print(prefix[i][j]+ " ");
			}
			System.out.println();
		}
		return 0;
		*/
	}
}
