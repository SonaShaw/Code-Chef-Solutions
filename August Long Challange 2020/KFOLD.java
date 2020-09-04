package codeChef;
import java.util.*;

public class KFOLD {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			String s = sc.next();
			
			int nzero = 0;
			int none = 0;
			for(int i=0; i<s.length(); i++) {
				if(s.charAt(i) == '0')
					nzero++;
				if(s.charAt(i) == '1')
					none++;
			}
			int nSeg = n/k;
			if(nzero%nSeg == 0 && none%nSeg == 0) {
				int zerocnt = nzero/nSeg;
				int onecnt = none/nSeg;
				for(int i=1; i<=nSeg; i++) {
					if(i%2 == 0) {
						for(int j=0; j<onecnt; j++)
							System.out.print("1");
						for(int j=0; j<zerocnt; j++)
							System.out.print("0");
					}else {
						for(int j=0; j<zerocnt; j++)
							System.out.print("0");
						for(int j=0; j<onecnt; j++)
							System.out.print("1");
					}
				}
			}else {
				System.out.println("IMPOSSIBLE");
			}
				
		}
	}
}
