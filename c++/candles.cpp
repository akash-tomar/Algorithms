
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
    int t;
    cin>>t;
    for(int i=0;i<t;i++) {
        ll n;
        cin>>n;
        ll temp;
        ll sum=0;
        ll x;
        //temp=n;
        //int *arr=new int[n];
        for(int pos=0;pos<n;pos++) {
            cin>>x;
            sum+=x;
        }
        if(sum%n==0) {
            cout<<"YES"<<endl;
            cout<<sum/n<<" "<<"0";
        }
        else {
            cout<<"NO"<<endl;
            cout<<sum/n<<" "<<sum%n;

        }


    }





    return 0;
}

