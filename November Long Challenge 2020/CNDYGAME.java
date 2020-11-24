package NovLongChallange;


import java.util.*;
public class CNDYGAME {
	static int m = 1000000007;
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0) {
			int n = sc.nextInt();
			int a[] = new int[n];
			for(int i=0; i<n; i++) {
				a[i] = sc.nextInt();
			}
			int q = sc.nextInt();
			while(q-- > 0) {
				int r = sc.nextInt();
				int res = candyGame(a, r)%m;
				System.out.println(res);
			}
		}
	}

	private static int candyGame(int[] a, int r) {
		if(a[0]==1)
			return 1;
		int candy = 0;
		int n = a.length;
		for(int i=1; i<=r; i++) {
			int idx = (i-1)%n;
			if(i==r){
		        candy = (candy + a[idx]%m)%m;
			}
			else if(i%n == 0) {
				if(a[idx]%2 != 0) {
					candy = (candy%m + a[idx]%m)%m;
				}else {
					candy = (candy%m + a[idx]%m - 1)%m;
				}
			}else {
				if(a[idx+1] == 1 && (idx+1)!=(a.length-1)) {
					if(a[idx]%2 != 0) {
						candy = (candy%m + a[idx]%m)%m;
					}else {
						candy = (candy%m + a[idx]%m - 1)%m;
					}
				}else {
					if(a[idx]%2 == 0) {
						candy = (candy%m + a[idx]%m)%m;
					}else {
						candy = (candy%m + a[idx]%m - 1)%m;
					}
				}
			}
		}
		return candy;
	}

}
