/*author - Ashutosh Chitranshi*/
#include<bits/stdc++.h>
using namespace std;
#define ll long long
ll dp[76];
ll solve(ll n)
{
    if(n < 7)
        return n;
    if(dp[n] != -1ll)
        return dp[n];
    ll maxe = 0ll;
    for(ll b=n-3;b>=1;b--)
    {
        ll curr = (n-b-1)*solve(b);
        maxe = max(curr,maxe);
    }
    return dp[n] = maxe;
}
int main()
{
	//code
	ios_base::sync_with_stdio(false);
	cin.tie(0);
	cout.tie(0);
	ll t;
	cin >> t;
	while(t--)
	{
	    ll n;
	    cin >> n;
	    memset(dp,-1ll,sizeof(dp));
	    cout << solve(n) << "\n";
	}
	return 0;
}
