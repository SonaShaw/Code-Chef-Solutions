package sepLunchTime2020;


import java.util.*;
public class GCDOPS {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0) {
			int n = sc.nextInt();
			int b[] = new int[n+1];
			for(int i=1; i<b.length; i++)
				b[i] = sc.nextInt();
			boolean res = true;
			for(int i=1; i<b.length; i++) {
				if(b[i]!=i) {
					int a = i;
					int c = b[i];
					if(b[i] == gcd(a,c)) {
						res = true;	
					}else {
						res = false;
					}
				}
				if(res == false)
					break;
			}
			if(res == true)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}
	private static int gcd(int a, int b) {
		if(a<=0)
			return b;
		else 
			return gcd(b%a,a);	
	}
}
