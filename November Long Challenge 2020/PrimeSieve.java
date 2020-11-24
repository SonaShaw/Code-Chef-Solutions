package NovLongChallange;

public class PrimeSieve {
	public static void main(String args[]) {
		int sieve[] = new int[1000000];
		primeSieve(sieve);
		for(int i=0; i<100; i++) {
			if(sieve[i] == 1)
				System.out.print(i + " ");
		}
	}
	private static void primeSieve(int a[]) {
		a[0] = a[1] = 0;
		a[2] = 1;
		for(int i=3; i<a.length; i=i+2)
			a[i] = 1;  
		for(int i=3; i<=1000; i=i+2) {
			// if i is prime(assumed)
			if(a[i] == 1) {
				for(int j=i*i; j<a.length; j=j+i)
					a[j] = 0;
			}
		}
	}
}
