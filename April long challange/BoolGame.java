package april2021LongChallenge;


import java.util.*;

public class BoolGame {
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
			int uvd[][] = new int[m][3];
			for(int i=0; i<m; i++) {
				uvd[i][0] = sc.nextInt();
				uvd[i][1] = sc.nextInt();
				uvd[i][2] = sc.nextInt();
			}
			
			long tpn = 1<<n;
			int res[] = new int[(int)tpn];
			//List<Integer> res = new ArrayList<Integer>();
			
			List<List<Integer>> al = new ArrayList<>();
			int a[] = new int[n];
			
			generateBinaryString(al, a, n, 0);
		
			for(List<Integer> x : al) {
				System.out.println(x);
			}
			
			
			for(int i=0; i<tpn; i++) {
				int score = 0;
				for(int j=0; j<n; j++) {
					score = score+g[j]*al.get(i).get(j);
					
				}
				int sum2 = 0;
				for(int j=0; j<m; j++) {
					int u = uvd[j][0];
					int v = uvd[j][1];
					int d = uvd[j][2];
					int mul = 1;
					for(int p=u-1; p<=v-1; p++)
						mul = mul*al.get(i).get(p);
					sum2 = sum2 + d*mul;
				}
				score = score+sum2;
				res[i] = score;
				
				
			}
			
			//Arrays.sort(res);
			for(int x: res) {
				System.out.print(x+" ");
			}
			System.out.println();
			Arrays.sort(res);
			
			int cnt = 1;
			for(int i=(int) (tpn-1); i>=0&&cnt<=k; i--, cnt++) {
				System.out.print(res[i]+" ");
			}
			System.out.println();
			
			
			
		}
	}

	private static void generateBinaryString(List<List<Integer>> al, int[] a, int n, int i) {
		// TODO Auto-generated method stub
		if(i==n) {
			List<Integer> row = new ArrayList<>();
			for(int j=0; j<n; j++) {
				row.add(a[j]);
			}
			al.add(row);
			return;
		}
		a[i] = 0;
		generateBinaryString(al, a, n, i+1);
		a[i] = 1;
		generateBinaryString(al, a, n, i+1);
		
	}
	
	
}
