package codeChef;

import java.util.Scanner;

public class SmallestKMP {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int a[] = new int[26];
			int b[] = new int[26];
			String s = sc.next();
			String p = sc.next();
			
			for(int i=0; i<s.length(); i++) {
				char ch = s.charAt(i);
				int index = (int)ch;
				a[index-97]++;
			}
			for(int i=0; i<p.length(); i++) {
				char ch = p.charAt(i);
				int index = (int)ch;
				a[index-97]--;
				b[index-97]++;
			}
			char ch = p.charAt(0);
			int ind = (int)ch - 97;
			String result = "";
			for(int i=0; i<=ind; i++) {
				int cnt = a[i];
				for(int j=0; j<cnt; j++) {
					result = result+(char)(i+97);
				}
			}
			result = result+p;
			for(int i=ind+1; i<a.length; i++) {
				int cnt = a[i];
				for(int j=0; j<cnt; j++) {
					result = result+(char)(i+97);
				}
			}
			System.out.println(result);
		}

	}

}
