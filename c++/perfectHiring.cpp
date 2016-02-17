#include<iostream>
#include<sstream>
#include<set>
#include<vector>
#include<list>
#include<algorithm>
#define ll long long int
using namespace std;





int main()
{
        ll n,p,x;
        cin>>n>>p>>x;
		ll max=-1;
		ll maxID=-1;

		for(ll i=0;i<n;i++) {
			ll arr;//=s.nextInt();
			cin>>arr;
			ll score=p*arr;
			if(max<score) {
				max=score;
				maxID=i+1;
			}
			p-=x;
		}
		cout<<maxID;
    return 0;
}


