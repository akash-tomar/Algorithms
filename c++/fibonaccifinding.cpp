#include<iostream>
#include<sstream>
#include<set>
#include<vector>
#include<list>
#include<algorithm>
using namespace std;
#define ll long long int


ll x;
ll *fibo=new ll[x];


ll fibonacci(ll n)
{
    if(fibo[n]!=-1)
        return fibo[n];
    else
    {
//        if(n==1 or n==2)
//        {
//            fibo[n]=1;
//            return 1;
//        }

        //else
        //
           fibo[n]=fibonacci(n-1)+fibonacci(n-2);
           return fibo[n];
        //}

    }



}

int main()
{
    int t;
    cin>>t;
    //cout<<"hdkjd";

    for(int i=0;i<t;i++)
    {
        ll a,b;//,n;
        cin>>a>>b>>x;
        for(int j=2;j<=x;j++)
            fibo[j]=-1;


        fibo[0]=a;
        fibo[1]=b;
        cout<<( fibonacci(x) ) % (1000000007)<<endl;





    }





    return 0;
}


