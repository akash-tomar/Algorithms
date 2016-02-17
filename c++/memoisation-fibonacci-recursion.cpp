#include<iostream>
#include<sstream>
#include<set>
#include<vector>
#include<list>
#include<algorithm>
using namespace std;
#define ll long long int

ll fibo[100000];

ll fibonacci(ll n)
{
    if(fibo[n]!=-1)
        return fibo[n];
    else
    {
        if(n==1 or n==2)
        {
            fibo[n]=1;
            return 1;
        }

        else
        {
           fibo[n]=fibonacci(n-1)+fibonacci(n-2);
           return fibo[n];
        }

    }



}

int main()
{
    int x=70;
    for(int i=0;i<=x;i++)
        fibo[i]=-1;
    cout<<fibonacci(x);




    return 0;
}


