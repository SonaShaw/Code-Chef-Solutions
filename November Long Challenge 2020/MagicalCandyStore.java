package NovLongChallange;

import java.util.*;



public class MagicalCandyStore {
	
	final static int m = 1000000007;
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0) {
			int n = sc.nextInt();
			int a[] = new int[n];
			int len = 0;
			int test = -1;
			for(int i=0; i<a.length; i++) {
				a[i] = sc.nextInt();
				if(a[i] == 1) {
					if(i==0)
						len = 1;
					else if(i!=n-1) {
						len =2;
						test = i;
					}
				}
			}
			if(len == 1) {
				int q = sc.nextInt();
				while(q-- > 0) {
					int r = sc.nextInt();
					int res;
					if(r%n == 0)
						res = (r/n)%m;
					else {
						if(r%n == 1 && r>n)
							res = (r/n)%m;
						else
							res = (r/n+1)%m;
					}
					System.out.println(res);
					
				}
			}else if(len == 2) {
				int sum = 0;
				int ar[] = new int[100000];
				for(int i=0; i<a.length-1; i++) {
					if(i==test-1) {
						if(isEven(a[i])) {
							sum = sum +a[i]-1;
							ar[i] = sum;
						}else {
							sum = sum+a[i];
							ar[i] = sum;
						}
					}else {
						if(isEven(a[i])) {
							sum=sum+a[i];
							ar[i] = sum;
						}else {
							sum = sum + a[i] -1;
							ar[i] = sum;
						}
					}
				}
				if(isEven(a[a.length-1]))
					sum = sum + a[a.length-1]-1;
				else 
					sum = sum+a[a.length-1];
				int q = sc.nextInt();
				while(q-- > 0) {
					int r = sc.nextInt();
					if(r%n==0) {
						if(isEven(a[a.length-1])) 
							System.out.println(((r/n)*sum + 1)%m);
						else
							System.out.println(((r/n)*sum)%m);
					}else {
						if(test==r%n-1) {
							if(isEven(a[test-1]))
								System.out.println(((r/n)*sum+2+ar[r%n-1])%m);
							else
								System.out.println(((r/n)*sum+ar[r%n-1])%m);
								
						}else if(test-1==r%n-1) {
							if(a[test-1]%2==0){
								System.out.println(((r/n)*sum+ar[r%n-1]+1) % m);

							}
							else{
								System.out.println(((r/n)*sum+ar[r%n-1]) % m);
							}
						}else {
							if(!isEven(a[r%n-1]))
								System.out.println(((r/n)*sum+ar[r%n-1]+1) % m);
							else
								System.out.println(((r/n)*sum+ar[r%n-1]) % m);
							
						}
					}
					
				}
			
			}else {
				int sum = 0;
				int ar[] = new int[100000];
				for(int i=0;i<a.length-1;i++){
					if(isEven(a[i])){
						sum+=a[i];
						ar[i]=sum;
					}
					else{
						sum+=a[i]-1;
						ar[i]=sum;
					}
				}
				if(isEven(a[a.length-1])){
					sum+=a[a.length-1]-1;
				}
				else{
					sum=sum+a[a.length-1];
				}
				int q = sc.nextInt();
				while(q-- > 0) {
					int r = sc.nextInt();
					if(r%n==0) {
						if(isEven(a[a.length-1]))
							System.out.println(((r/n)*sum+1) % m);
						else
							System.out.println(((r/n)*sum) % m);
					
					}else {
						if(!isEven(a[r%n-1]))
							System.out.println(((r/n)*sum+ar[r%n-1]+1) % m);
						else
							System.out.println((((r/n)*sum+ar[r%n-1]) % m)+1-1);
					
					}
				}
			}
		}
	}
	private static boolean isEven(int n) {
		return (n%2==0)?true:false;
	}
}
