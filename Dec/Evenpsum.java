package DecLongChallenge;

import java.util.*;

public class Evenpsum {
	
	public static void main (String args[] ) {
		Scanner sc= new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			long even1 = 0;
			long odd1 = 0;
			long even2 = 0;
			long odd2 = 0;
			
			even1 = a/2;
			even2 = b/2;
			
			if(a%2==0) {
				odd1 = a/2; 
			}else {
				odd1 = a/2+1;
			}
			if(b%2==0) {
				odd2 = b/2; 
			}else {
				odd2 = b/2+1;
			}
			
			System.out.println((even1*even2)+(odd1*odd2));
		}
	}
	
	
}
