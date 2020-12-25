package DecLongChallenge;

import java.util.*;

public class StringOperations {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> sub = new ArrayList<String>();
		String s = sc.next();
		findSubString(s, sub);
		for(String x:sub)
			System.out.println(x);
	}

	private static void findSubString(String s, ArrayList<String> sub) {
		// TODO Auto-generated method stub
		for(int i=0 ;i<s.length(); i++) {
			for(int j=i; j<s.length(); j++) {
				sub.add(s.substring(i, j+1));
			}
		}
		
	}
}
