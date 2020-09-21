package septemberLongChallange2020;

import java.util.*;
public class CoronaVirus2 {
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0) {
			int n = sc.nextInt();
			int v[] = new int[n];
			for(int i=0; i<v.length; i++)
				v[i] = sc.nextInt();
			int d[] = new int[n];
			d[0] = 0;
			for(int i=1; i<v.length; i++) {
				d[i] = v[i-1] - v[i];
			}
			int min = 5;
			int max = -1;
			int cnt = 1;
			for(int i=1; i<v.length; i++) {
				if(d[i] == 1) {
					cnt++;
				}else {
					if(cnt<min)
						min = cnt;
					if(cnt>max)
						max = cnt;
					cnt = 1;
				}
			}
			if(cnt<min)
				min = cnt;
			if(cnt>max)
				max = cnt;
			System.out.println(min+" "+max);
		}
	}
	
}
