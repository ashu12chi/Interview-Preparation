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
	    ll n,m;
	    cin >> n >> m;
	    ll ar1[n],ar2[m];
	    for(int i=0;i<n;i++)
	        cin >> ar1[i];
	    for(int i=0;i<m;i++)
	        cin >> ar2[i];
	    int i = 0;
	    int j = 0;
	    ll ans = 0ll;
	    ll sum1 = 0ll;
	    ll sum2 = 0ll;
	    while(i<n && j<m)
	    {
	        if(ar1[i] < ar2[j])
	        {
	            sum1 += ar1[i];
	            i++;
	        }
	        else if(ar1[i] > ar2[j])
	        {
	            sum2 += ar2[j];
	            j++;
	        }
	        else
	        {
	            int temp = ar1[i];
	            sum1 += ar1[i];
	            sum2 += ar2[j];
	            i++;
	            j++;
	            ans += max(sum1,sum2);
	            sum1 = 0;
	            sum2 = 0;
	            while(i<n && ar1[i] == temp)
                    ans += ar1[i++];
                while(j<m && ar2[j] == temp)
                    ans += ar2[j++];
	        }
	    }
	    while(i<n)
	    {
	        sum1 += ar1[i];
	        i++;
	    }
	    while(j<m)
	    {
	        sum2 += ar2[j];
	        j++;
	    }
	    ans += max(sum1,sum2);
	    cout << ans << "\n";
	}
	return 0;
}
