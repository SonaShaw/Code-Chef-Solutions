package NovLongChallange;

import java.util.*;

public class FEMA2 {
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			String s = sc.next();
			int res = fema(s.toCharArray(), n, k);
			System.out.println(res);
			
		}
	}

	private static int fema(char[] c, int n, int k) {
		int i=0, j=0,cnt =0;
		//int con = 0;
		while(i<c.length && j<c.length) {
			if(c[i] == 'M') {
				
				if(c[j] == 'I') {
					int p = k+1-Math.abs(i-j)-con(c, i,j);
					
					if(p>0) {
						cnt++;
						i++;
						j++;
					}else if(i>j) 
						j++;
					else 
						i++;
				}else if(c[j] == 'X') {
					i=j;
					i++;
					j++;
				}else
					j++;
				
			}else if(c[i] == 'X') {
				j=i;
				i++;
				j++;
			}else
				i++;
		}
		return cnt;
	}
	private static int con(char[] c, int i, int j) {
		int k = (i<j)?i:j;
		int cnt = 0;
		int l = k+Math.abs(i-j);
		for(int a=k; a<=l; a++) {
			if(c[a] == ':') {
				cnt++;
			}
		}
		return cnt;
	}

}
