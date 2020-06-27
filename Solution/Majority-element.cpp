/*author - Ashutosh Chitranshi*/
#include<bits/stdc++.h>
using namespace std;
#define ll long long
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
	    ll ar[n];
	    for(int i=0;i<n;i++)
	        cin >> ar[i];
	    ll maxe = ar[0];
	    ll count = 1ll;
	    for(int i=1;i<n;i++)
	    {
	        if(ar[i] == maxe)
	        {
	            count++;
	        }
	        else
	        {
	            count--;
	            if(count == 0)
	            {
	                maxe = ar[i];
	                count = 1;
	            }
	        }
	    }
	    count = 0ll;
	    for(int i=0;i<n;i++)
	    {
	        if(ar[i] == maxe)
	            count++;
	    }
	    if(count > n/2)
	        cout << maxe << "\n";
	    else
	        cout << -1 << "\n";
	}
	return 0;
}
