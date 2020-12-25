package DecLongChallenge;

import java.util.*;

public class Vaccine2 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- >0) {
			int n = sc.nextInt();
			int d = sc.nextInt();
			int a[] = new int[n];
			int r = 0;
			int nr = 0;
			for(int i =0 ; i<n; i++) {
				a[i] = sc.nextInt();
				
			}
			for(int i=0;i<n;i++) {
				if(a[i]>=80||a[i]<=9)
					r++;
				else
					nr++;
			}
			System.out.println(r+" "+nr);
			//nr = n-r;
			int ans = 0;
			if(r%d==0)
				ans=ans+r/d;
			else
				ans = ans+r/d+1;
			
			if(nr%d==0)
				ans=ans+nr/d;
			else
				ans = ans+nr/d+1;
			
			System.out.println(ans + " "+r+" "+nr);
		}
	}

}
