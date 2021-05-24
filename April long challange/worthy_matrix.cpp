#include <iostream>
using namespace std;

#define ll long long int


int main(){
    ios_base::sync_with_stdio(false);
	cin.tie(NULL);
    int t;
    cin>>t;
    while(t--){
        int n,m,k;
        cin>>n>>m>>k;
        ll a[n][m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                cin>>a[i][j];
            }
        }

        ll prefix[n][m];
		prefix[0][0] = a[0][0];
        for(int i=1; i<m; i++)
			prefix[0][i] = prefix[0][i-1]+ a[0][i];
		for(int i=1; i<n; i++)
			prefix[i][0] = prefix[i-1][0] +a[i][0];
		for(int i=1; i<n; i++) {
			for(int j=1; j<m; j++) {
				prefix[i][j] = prefix[i][j-1]+prefix[i-1][j]-prefix[i-1][j-1]+a[i][j];
			}
		}
        ll cnt =0;
		//int mi = (n<m)?n:m;
        for(int size=1; size<=min(n,m); size++) {
			for(int i=0; i+size-1<n; i++) {
				for(int j=0; j+size-1<m; j++) {
					ll p = prefix[i+size-1][j+size-1];
					ll  q = ((i-1)<0)?0:prefix[i-1][j+size-1];
					ll r = ((i-1)<0 || (j-1)<0)?0:prefix[i-1][j-1];
					ll s = ((j-1)<0)?0:prefix[i+size-1][j-1];
					double sum = (p+r)-(q+s);
					if((sum/(size*size))>=k)
						cnt++;
				}
			}
		}
        cout<<cnt<<"\n";
    }
}