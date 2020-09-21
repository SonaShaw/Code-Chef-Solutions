package septCookOff2020;

import java.util.*;
public class Ques1BowlingStrategy {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			int l = sc.nextInt();
			if(n > k*l) {
				System.out.println(-1);
			}else if(k==1 && n>1)
				System.out.println(-1);
			else {
				for(int i=0; i<n; i++) {
					System.out.print((i%k+1) + " ");
				}
			}
		}
		
	}
}
