#include <iostream>
#include<bits/stdc++.h>

using namespace std;

# define ll long long


void solve(){
    ll m, n, k;
    cin>>n>>m>>k;
    vector<ll>vt(n);
    for(int i=0; i<n; i++){
        cin>>vt[i];
    }
    vector<ll>u(m),v(m),d(m);
    for(ll i=0; i<m; i++){
        cin>>u[i]>>v[i]>>d[i];
        u[i]--;
        v[i]--;
    }
    vector<ll> cst;
    for(ll i=0; i<(1ll<<n); i++){
        ll arr[n] = {0LL};
        ll costop=0LL;
        for(ll j=0; j<n; j++){
            if(i&(1LL<<j)){
                arr[j] = 1LL;
                costop = costop+vt[j];
            }
        }
        for(ll j=0; j<m; j++){
            bool stat = true;
            for(ll k=u[j]; k<=v[j]; k++){
                if(arr[k] != 1){
                    stat = false;
                    break;
                }
            }
            if(stat){
                costop = costop+d[j];
            }
        }
        cst.push_back(costop);
    }
    sort(cst.begin(), cst.end());
    long long curr = cst.size()-1;
    long long ct = 0;
    while(ct!=k){
        cout<<cst[curr]<<" ";
        curr--;
        ct++;
    }
    cout<<"\n";
}

int main(){
    ios::sync_with_stdio(false);
    cin.tie(NULL);
    int t;
    cin >>t;
    while(t--){
        solve();
    }
    

}

