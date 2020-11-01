package augLongChallenge2020;

import java.util.*;

public class SmallestKMP {
    public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T>0) {
            String s=sc.next();
            String p=sc.next();
            int countS[]=new int[26];
            for(int i=0; i<s.length(); i++)
                countS[s.charAt(i)-'a']++;
            for(int i=0; i<p.length(); i++)
                countS[p.charAt(i)-'a']--;
                                   
            char iniChar='a';
            ArrayList<Character>ans=new ArrayList<>();
            for(int i=0; i<26; i++, iniChar++) {
                if(countS[i]>0) {
                    if(iniChar<p.charAt(0)) {
                        for(int j=0; j<countS[i]; j++)
                            ans.add(iniChar);
                    } 
                    else if(iniChar==p.charAt(0)) {
                        String curr="";
                        for(int j=0; j<countS[i]; j++)
                            curr+=iniChar;
                        if((curr+p).compareTo(p+curr)<0) {
                            for(int j=0; j<curr.length(); j++)
                                ans.add(curr.charAt(j));
                            for(int j=0; j<p.length(); j++)
                                ans.add(p.charAt(j));
                        } 
                        else {
                            for(int j=0; j<p.length(); j++)
                                ans.add(p.charAt(j));
                            for(int j=0; j<curr.length(); j++)
                                ans.add(curr.charAt(j));
                        }
                    }
                    else {
                        for(int j=0; j<countS[i]; j++)
                            ans.add(iniChar);
                    }
                }
                else if(iniChar==p.charAt(0)) {
                    for(int j=0; j<p.length(); j++) {
                        ans.add(p.charAt(j));
                    }
                }
            }
            
            for(int x=0; x<ans.size(); x++)
                System.out.print(ans.get(x));
            System.out.println();
            
            T--;
        }
    }
}
