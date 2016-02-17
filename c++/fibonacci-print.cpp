#include<iostream>
#include<sstream>
#include<set>
#include<vector>
#include<list>
#include<algorithm>
using namespace std;
#define ll long long int

//ll fibonacci()
//{
//
//}


int main()
{
    ll n;
    cin>>n;
    ll fibo[10000];
    for(int i=0;i<10000;i++)
    {
        fibo[i]=-1;
    }
    fibo[0]=0;
    fibo[1]=1;
    int j=0;
    while(fibo[j-1]<=n)
    {
        if(j==0 or j==1)
            cout<<fibo[j]<<endl;
        else
        {
            fibo[j]=fibo[j-1]+fibo[j-2];
            if(fibo[j]<=n)
            {
                cout<<fibo[j]<<endl;

            }

        }
        j++;
    }







    return 0;
}


