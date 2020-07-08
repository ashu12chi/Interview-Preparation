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
	ll n;
	cin >> n;
	priority_queue<ll> left;
	priority_queue<ll,vector<ll>,greater<ll>> right;
	for(int i=0;i<n;i++)
	{
	    ll temp;
	    cin >> temp;
	    if(left.size() == right.size())
	    {
	        if(right.size() == 0)
	            left.push(temp);
	        else
	        {
	            if(temp <= right.top())
	                left.push(temp);
	            else
	            {
	                left.push(right.top());
	                right.pop();
	                right.push(temp);
	            }
	        }
	    }
	    else
	    {
	        if(temp >= left.top())
	        {
	            right.push(temp);
	        }
	        else
	        {
	            right.push(left.top());
	            left.pop();
	            left.push(temp);
	        }
	    }
	    if(i%2 == 0)
	        cout << left.top() << "\n";
	    else
	        cout << (left.top() + right.top())/2 << "\n";
	}
	return 0;
}
