package DecLongChallenge;

import java.util.*;

public class Vaccine1 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int d1 = sc.nextInt();
		int v1= sc.nextInt();
		int d2 = sc.nextInt();
		int v2 = sc.nextInt();
		int p = sc.nextInt();
		
		int ans = 0;
		
		if(d1 == d2) {
			ans  = d1-1;
			if(p%(v1+v2)!=0)
				ans = ans+p/(v1+v2)+1;
			else
				ans = ans+p/(v1+v2);
		}else if(d1<d2) {
			ans = d1-1;
			for(int i=d1; i<d2&&p>0; i++) {
				p = p-v1;
				ans++;
			}
			if(p>0) {
				if(p%(v1+v2)!=0)
					ans = ans+p/(v1+v2)+1;
				else
					ans = ans+p/(v1+v2);
			}
		}else {
			ans = d2-1;
			for(int i=d2; i<d1&&p>0; i++) {
				p=p-v2;
				ans++;
			}
			if(p>0) {
				if(p%(v1+v2)!=0)
					ans = ans+p/(v1+v2)+1;
				else
					ans = ans+p/(v1+v2);
					
			}
		}
		System.out.println(ans);

	}

}
