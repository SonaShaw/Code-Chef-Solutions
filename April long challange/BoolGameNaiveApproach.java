package april2021LongChallenge;


import java.util.*;
public class BoolGameNaiveApproach {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0) {
			
			int n = sc.nextInt();
			int m = sc.nextInt();
			int k = sc.nextInt();
			
			int g[] = new int[n];
			for(int i=0; i<n; i++) {
				g[i] = sc.nextInt();
				
			}
			int u[] = new int[m];
			int v[] = new int[m];
			int d[] = new int[m];
			for(int i=0; i<m;i++) {
				u[i] = sc.nextInt();
				v[i] = sc.nextInt();
				d[i] = sc.nextInt();
				
			}
			
			long tot = (long)(1<<n);
			List<Long> al = new ArrayList<>();
			for(long mask=0; mask<tot; mask++) {
				long score = 0;
				for(int i=0; i<n; i++) {
					long f = (long)(1<<i);
					if((mask & f)!=0) {
						score = score +g[i];
					}
				}
				
				for(int i=0; i<m; i++) {
					boolean allOne = true;
					for(int j=u[i]-1; j<v[i]; j++) {
						long f = (long)(1<<j);
						if((mask&f)==0) {
							allOne = false;
							break;
						}
					}
					if(allOne) {
						score = score+d[i];
					}
				}
				al.add(score);
			}
			Collections.sort(al, Collections.reverseOrder());
			for(int i=0; i<k; i++) {
				System.out.print(al.get(i));
			}
			System.out.println();
		}
	}
}
