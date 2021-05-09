#include <bits/stdc++.h>
#define ll long long int
#define M 1e9
using namespace std;
vector<string>dp[10000][10000];
int main ()
{
    int t;
    cin>>t;
    while(t--)
    {
        int n, m, k;
        cin>>n>>m>>k;
        vector<ll>arr(n);
        for(int i=0; i<n; i++)
        {
            cin>>arr[i];
        }
        vector<ll> u(m), v(m), d(m);
        for(int i=0; i<m; i++)
        {
            cin>>u[i]>>v[i]>>d[i];
        }
      int siz = pow(2, n);
      vector<ll>ans(siz);
     string str = "";
     for(ll i=0; i<=n; i++)
      {
          dp[i][0].push_back(str);
          str = str + "0";
      }
      for(ll i=1; i<=n; i++)
      {
          for(ll j=0; j<=i; j++)
          {
              for(string s:dp[i-1][j])
               dp[i][j].push_back("0"+s);
             for(string st:dp[i-1][j-1])
              dp[i][j].push_back("1"+st);
          }
      }
      ll count = 0;
      bool flag = true;
      for(ll i=1; i<=n; i++)
        {
            for(string strr: dp[n][i])
            {
                for(int r=0; r<strr.size(); r++)
                {
                    if(strr[r] == 1)
                       count += arr[r]; 
                }
                for(ll l=0; l<m; l++)
                {
                    for(ll dr=u[l]-1; dr<v[l]; dr++)
                    {
                        if(strr[dr] != 1)
                        {
                            flag = false;
                            break;
                        }
                    }
                    if(flag == true)
                    {
                        count +=d[l];
                    }
                }
                ans.push_back(count);
            }
        }
        sort(ans.begin(), ans.end(), greater<>());
        for(int ir=0; ir<k; ir++)
          cout<<ans[ir]<<" ";
          cout<<endl;
    }
    return 0;
}