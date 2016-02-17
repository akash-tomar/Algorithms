#include<iostream>
#include<sstream>
#include<set>
#include<vector>
#include<list>
#include<algorithm>
using namespace std;
#define ll long long int
ll x;
ll *fact=new ll[x];

ll factorial(ll n)
{
    if(n==0)
        return 1;
    else
    {
        fact[n]=n*factorial(n-1);
        return fact[n] ;
    }
}


int main()
{
    int t;
    cin>>t;
    for(int i=0;i<t;i++)
    {
        ll r,m;
        cin>>x>>r>>m;
        cout<< (factorial(x)/ (factorial(r)*factorial(x-r) ))%m<<endl;





    }





    return 0;
}


