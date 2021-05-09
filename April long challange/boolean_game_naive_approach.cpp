#include<iostream>
#include<bits/stdc++.h>

#define ll long long int
using namespace std;

void solve(){
    int n,m,k;
    cin>>n>>m>>k;
    int g[n];
    for(int i=0; i<n; i++){
        cin>>g[i];
    }
    int u[m];
    int v[m];
    int d[m];
    for(int i=0; i<m; i++){
        cin>>u[i];
        cin>>v[i];
        cin>>d[i];
    }

    ll tot = 1<<n;
    vector<ll> vec;
    for(ll mask=0; mask<tot; mask++){
        ll score = 0;
        for(int i=0; i<n; i++){
            int f = 1<<i;
            if((mask&f)!=0){
                score = score+g[i];
            }
        }

        for(int i=0; i<m; i++){
            bool allOne = true;
            for(int j=u[i]-1; j<v[i]; j++){
                ll f = 1<<j;
                if((mask&f)==0){
                    allOne = false;
                    break;
                }
            }
            if(allOne){
                score=score+d[i];
            }
        }
        vec.push_back(score);

    }

    sort(vec.begin(), vec.end(), greater<ll>());
    for(int i=0; i<k; i++){
        cout<<vec[i]<<" ";
    }
    cout<<"\n";
    
}

int main(){
    ios_base::sync_with_stdio(false);
	cin.tie(NULL);
    cout.tie(NULL);

    int t;
    cin>>t;
    while(t--){
        solve();
        
    }
    return 0;
}