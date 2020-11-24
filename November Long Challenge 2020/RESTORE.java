package NovLongChallange;

import java.util.*;

public class RESTORE {
	public static void main (String args[]) {
		
		int sieve[] = new int[4000001];
		int primes[] = new int[4000001];
		primeSieve(sieve);
		int k=0;
		for(int i=0; i<sieve.length; i++) {
			if(sieve[i] == 1)
				primes[k++] = i;
		}
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0) {
			int n = sc.nextInt();
			int b[] = new int[n];
			int a[] = new int[n];
			for(int i=0; i<b.length; i++)
				b[i] = sc.nextInt();
			
			for(int i=0; i<b.length; i++) {
				int index = b[i] - 1;
				a[i] = primes[index];
			}
			
			for(int x:a)
				System.out.print(x+" ");
			
		}
	}
	
	private static void primeSieve(int a[]) {
		a[0] = a[1] = 0;
		a[2] = 1;
		for(int i=3; i<a.length; i=i+2) {
			a[i] = 1;
		}
		for(int i=3; i <2000; i=i+2) {
			if(a[i] == 1) {
				for(int j=i*i; j<a.length; j=j+i)
					a[j] = 0;
			}
		}
	}
}
