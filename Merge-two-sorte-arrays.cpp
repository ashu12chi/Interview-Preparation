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
	    ll n,m;
	    cin >> n >> m;
	    ll ar1[n],ar2[m];
	    for(int i=0;i<n;i++)
	        cin >> ar1[i];
	    for(int i=0;i<m;i++)
	        cin >> ar2[i];
	    int i = 0;
	    int j = n-1;
	    while(j>=0 && i<m)
	    {
	        if(ar2[i] < ar1[j])
	        {
	            swap(ar2[i],ar1[j]);
	            i++;
	            j--;
	        }
	        else
	            break;
	    }
	    sort(ar1,ar1+n);
	    sort(ar2,ar2+m);
	    for(int i=0;i<n;i++)
	        cout << ar1[i] << " ";
	    for(int i=0;i<m;i++)
	        cout << ar2[i] << " ";
	    cout << "\n";
	}
	return 0;
}
