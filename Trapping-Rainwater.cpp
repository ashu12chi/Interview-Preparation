/*author - Ashutosh Chitranshi*/
#include<bits/stdc++.h>
using namespace std;
#define ll long long
int main()
{
	//code
	ll t;
	cin >> t;
	while(t--)
	{
	    ll n;
	    cin >> n;
	    ll ar[n];
	    for(int i=0;i<n;i++)
	        cin >> ar[i];
	    ll ans = 0ll;
	    ll mini = 0;
	    ll sum = 0ll;
	    for(int i=1;i<n;i++)
	    {
	        if(ar[i] >= ar[mini])
	        {
	            ans += (ar[mini]*(i-mini-1)-sum);
	            mini = i;
	            sum = 0;
	        }
	        else
	        {
	            sum += ar[i];
	        }
	    }
	    ll j = mini;
	    mini = n-1;
	    sum = 0ll;
	    for(int i=n-2;i>=j;i--)
	    {
	        if(ar[i] >= ar[mini])
	        {
	            ans += (ar[mini]*(mini-i-1)-sum);
	            mini = i;
	            sum = 0;
	        }
	        else
	        {
	            sum += ar[i];
	        }
	    }
	    cout << ans << "\n";
	}
	return 0;
}
