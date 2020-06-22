/*author - Ashutosh Chitranshi*/
#include<bits/stdc++.h>
using namespace std;
#define ll long long
#define eb emplace_back
#define mp make_pair
#define ff first
#define ss second
int main()
{
	//code
	ll t;
	cin >> t;
	while(t--)
	{
	    ll n;
	    cin >> n;
	    vector<pair<ll,char>> v;
	    for(int i=0;i<n;i++)
	    {
	        ll temp;
	        cin >> temp;
	        v.eb(mp(temp,'a'));
	    }
	    for(int i=0;i<n;i++)
	    {
	        ll temp;
	        cin >> temp;
	        v.eb(mp(temp,'d'));
	    }
	    sort(v.begin(),v.end());
	    ll curr = 0ll;
	    ll ans = 0ll;
	    for(int i=0;i<2*n;i++)
	    {
	        if(v[i].ss=='a')
	            curr++;
	        else
	            curr--;
	        ans = max(ans,curr);
	    }
	    cout << ans << "\n";
	}
	return 0;
}
