package april2021LongChallenge;

import java.util.*;
public class BoolGame1 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int k = sc.nextInt();
			
			long g[] = new long[n+1];
			for(int i=1; i<=n; i++){
				g[i] = sc.nextLong();
			}
			
			long dp[][][] = new long[n+1][n+1][2];
			long a[][][] = new long[n+1][n+1][2];
			
			for(int i=0; i<m; i++) {
				int u = sc.nextInt();
				int v = sc.nextInt();
				int d = sc.nextInt();
				a[u][i][0] = i;
				a[u][i][1] = d;
				a[v][i][0] = i;
				a[v][i][1] = d;
			}
			dp[0][0][0] = dp[0][0][1] = 0;
			
			for(int i=1; i<=n; i++) {
				List<List<Integer>> temp = new ArrayList<>();
				
			}
			
			
		}
	}
}
