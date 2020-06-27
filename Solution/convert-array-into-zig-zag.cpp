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
	    bool flag = true;
        for(int i=0; i<=n-2; i++) 
        { 
            if(flag)
            {
                if(ar[i] > ar[i+1]) 
                    swap(ar[i],ar[i+1]); 
            } 
            else 
            { 
                if(ar[i] < ar[i+1])
                    swap(ar[i],ar[i+1]); 
            } 
            flag = !flag;
        }
        for(int i=0;i<n;i++)
            cout << ar[i] << " ";
	    cout << "\n";
	}
	return 0;
}
