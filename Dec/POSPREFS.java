package DecLongChallenge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class POSPREFS {
	
	
	
	static class FastReader 
    { 
        BufferedReader br; 
        StringTokenizer st; 
  
        public FastReader() 
        { 
            br = new BufferedReader(new
                     InputStreamReader(System.in)); 
        } 
  
        String next() 
        { 
            while (st == null || !st.hasMoreElements()) 
            { 
                try
                { 
                    st = new StringTokenizer(br.readLine()); 
                } 
                catch (IOException  e) 
                { 
                    e.printStackTrace(); 
                } 
            } 
            return st.nextToken(); 
        } 
  
        int nextInt() 
        { 
            return Integer.parseInt(next()); 
        } 
  
        long nextLong() 
        { 
            return Long.parseLong(next()); 
        } 
  
        double nextDouble() 
        { 
            return Double.parseDouble(next()); 
        } 
  
        String nextLine() 
        { 
            String str = ""; 
            try
            { 
                str = br.readLine(); 
            } 
            catch (IOException e) 
            { 
                e.printStackTrace(); 
            } 
            return str; 
        } 
    } 
	
	
	public static void main(String arhs[]) {
		FastReader sc = new FastReader();
		int t = sc.nextInt();
		while(t-- > 0) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			if(k==n) {
				for(int i=0; i<n; i++) {
					System.out.print((i+1)+" ");
				}
				System.out.println();
				continue;
			}
			if(k==0) {
				for(int i=0; i<n; i++) {
					System.out.print((-1)*(i+1)+" ");
				}
				System.out.println();
				continue;
			}
			int a[] = new int[n];
			for(int i=0; i<n; i++) {
				a[i]=-(i+1);
			}
//			for(int x:a) {
//				System.out.println(x+" ");
//			}
			if(2*k>n) {
				int it1 = n/2;
				int it2 = k-it1;
				
				int cnt=1;
				int i=1;
				while(cnt<=it1 && i<n) {
					a[i]=(-1)*a[i];
					i = i+2;
					cnt++;
				}
				if(n%2==0) {
					int bcnt = 1;
					int j = n-2;
					while(bcnt<=it2 && j>=0) {
						a[j]=(-1)*a[j];
						j = j-2;
						bcnt++;
					}
				}else {
					int bcnt = 1;
					int j = n-1;
					while(bcnt<=it2 && j>=0) {
						a[j]=(-1)*a[j];
						j = j-2;
						bcnt++;
					}
				}
				
			}else {
				int it1 = k;
				int cnt=1;
				int i=1;
				while(cnt<=it1 &&i<n) {
					a[i]=(-1)*a[i];
					i = i+2;
					cnt++;
				}
			}
			for(int x:a) {
				System.out.print(x+" ");
			}
			System.out.println();
		}
	}
}
