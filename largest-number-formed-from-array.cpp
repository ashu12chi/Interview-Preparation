/*author - Ashutosh Chitranshi*/
#include<bits/stdc++.h>
using namespace std;
#define ll long long
bool comp(int a,int b)
{
    string s1 = to_string(a);
    string s2 = to_string(b);
    string num1 = s1+s2;
    string num2 = s2+s1;
    for(int i=0;i<num1.size();i++)
    {
        if(num1[i] > num2[i])
            return true;
        else if(num1[i] < num2[i])
            return false;
    }
    return true;
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
	    ll ar[n];
	    for(int i=0;i<n;i++)
	        cin >> ar[i];
	    sort(ar,ar+n,comp);
	    string ans = "";
	    for(int i=0;i<n;i++)
	        ans += to_string(ar[i]);
	    cout << ans << "\n";
	}
	return 0;
}
