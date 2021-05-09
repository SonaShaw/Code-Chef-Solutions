#include <iostream>
#include<bits/stdc++.h>

using namespace std;

# define ll long long int


void solve(){
    ll n, m, k;
    cin>>n>>m>>k;
    vector<ll>g(n+1);
    for(int i=0; i<n; i++){
        cin>>g[i+1];
    }
    vector<vector<pair<ll, ll>>> a(n+1), dp(n+1);
    for(int i=0; i<m; i++){
        ll u, v, d;
        cin>>u>>v>>d;
        a[u].push_back(make_pair(i,d));
        a[v].push_back(make_pair(i,d));
    }
    dp[0].push_back(make_pair(0,0));
    for(ll i=1; i<=n; i++){
        vector<pair<ll, ll>>tmp;
        tmp.insert(tmp.end(), dp[i-1].begin(), dp[i-1].end());
        ll curr = 0;
        ll mask = 0;
        set<ll> open;
        for(ll j=i; j>=1; j--){
            curr = curr+g[j];
            mask ^=1LL<<j;
            for(auto x: a[j]){
                if(open.count(x.first))
                    curr = curr + x.second;
                        
                else
                    open.insert(x.first);
            }    
            if(j>1){
               for(auto xy:dp[j-2]){
                    tmp.push_back(make_pair(xy.first+curr, mask^xy.second));
                }
            }else{
                tmp.push_back(make_pair(curr, mask));
            }
                
            
        }
        sort(tmp.begin(), tmp.end());
        reverse(tmp.begin(), tmp.end());
        set<ll> hs2;
        ll cnt =0;
        for(ll j=0; j<tmp.size()&&cnt<k; j++){
            if(hs2.count(tmp[j].second))
                continue;
            dp[i].push_back(tmp[j]);
            cnt++;
            hs2.insert(tmp[j].second);
        }
    }
    for(ll i=0; i<k; i++){
        cout<<dp[n][i].first<<" ";
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
    return 0;

}

