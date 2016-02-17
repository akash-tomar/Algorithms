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
        ll n;
        cin>>n;
		//int n=s.nextInt();
		string str;
		cin>>str;//=s.nextLine();
		ll len=str.length();

		ll i=0;
		while(i<str.length()-1) {
			if(str[i]!=str[i+1]) {
				len-=2;
				i+=2;
			} else {
				i++;
			}
		}
		cout<<len;
    return 0;
}

