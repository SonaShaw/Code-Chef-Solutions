package codeChef;
import java.util.*;

public class ChefSndWork {
	public static void main(String args[]) throws java.lang.Exception{
		try {
			Scanner sc = new Scanner(System.in);
			int t = sc.nextInt();
			while(t-- >0) {
				int n = sc.nextInt();
				int k =sc.nextInt();
				int a[] = new int[n];
				
				for(int i=0; i<a.length; i++)
					a[i] = sc.nextInt();
				
				int mw = 0;
				int cnt = 0;
				int flag = 0;
				for(int i=0; i<a.length; i++) {
					mw = mw+a[i];
					if(mw <= k && i == a.length-1) {
						cnt++;
						break;
					}else if(mw <= k && (mw+ a[i+1]) > k) {
						cnt++;
						mw = 0;
					}
					if(mw > k) {
						flag = 1;
						break;
					}
				}
				if(flag == 0)
					System.out.println(cnt);
				else
					System.out.println(-1);
			}

			
		}catch(Exception e) {
			System.out.println();
		}
	}
}
