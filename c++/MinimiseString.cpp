#include<iostream>
#include<sstream>
#include<set>
#include<vector>
#include<list>
#include<algorithm>
using namespace std;
#define ll long long int




int main()
{
	int t;
	cin>>t;
	for(int i=0;i<t;i++) {
		int n;
		cin>>n;
		string str;
		cin>>str;
		char min='z';
		int pos=-1;
		for(int i=str.length()-1;i>=1;i--) {
            if( str[i]<min ) {
                min=str[i];
                pos=i;
            }
		}
		for(int i=0;i<str.length()-1;i++) {
            if(str[i]>min) {
                char temp=str[pos];
                str[pos]=str[i];
                str[i]=temp;
                break;

            }
		}
		cout<<str<<endl;

	}




    return 0;
}

