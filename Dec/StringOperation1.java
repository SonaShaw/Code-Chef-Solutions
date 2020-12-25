package DecLongChallenge;

import java.util.*;

public class StringOperation1 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String args[]) {
		
		int t = sc.nextInt();
		while(t-- > 0) {
			solution();
			
		}
	}

	private static void solution() {
		// TODO Auto-generated method stub
		String s = sc.next();
		ArrayList<String> sub = new ArrayList<String>();
		findSubString(s,sub);
		int cnt =0;
		Set<String> hs = new HashSet<String>();
		for(int i=0; i<sub.size()-1; i++) {
			for(int j=i+1; j<sub.size(); j++) {
				if(check(sub.get(i),sub.get(j))) {
					hs.add(sub.get(j));
					hs.add(sub.get(i));
				}
					cnt++;
			}
		}
		System.out.println(hs.size());
		
	}

	private static boolean check(String a, String b) {
		// TODO Auto-generated method stub
		boolean res = false;
		if((a.length()==b.length()) && isEvenOne(a) && isEvenOne(b)){
			if(uponReverseSame(a,b));
				return true;
		}
		return res;
	}

	private static boolean uponReverseSame(String a, String b) {
		// TODO Auto-generated method stub
		boolean res = false;
		
		
		for(int i=0; i<a.length(); i++) {
			for(int j=i; j<a.length();j++) {
				if(b.equals(reverse(a,i,j)))
					return true;
			}
		}
		return res;
	}

	private static String reverse(String a, int i, int j) {
		// TODO Auto-generated method stub
		char ar[] = a.toCharArray();
		for(;i<j;i++,j--) {
			char t = ar[j];
			ar[j] = ar[i];
			ar[i] = t;
			
		}
		String res = new String(ar);
		return res;
	}

	private static boolean isEvenOne(String a) {
		// TODO Auto-generated method stub
		int cnt =0 ;
		for(int i=0; i<a.length(); i++) {
			if(a.charAt(i)=='1') {
				cnt++;
			}
		}
		//System.out.println(cnt);
		return (cnt%2==0)?true:false;
	}

	private static void findSubString(String s, ArrayList<String> sub) {
		// TODO Auto-generated method stub
		for(int i=0; i<s.length(); i++) {
			for(int j=i; j<s.length(); j++) {
				sub.add(s.substring(i,j+1));
			}
		}
		
	}
}
