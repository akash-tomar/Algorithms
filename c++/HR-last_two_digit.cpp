#include<iostream>
#include<cmath>
using namespace std;
long power(int m,int n)
{
    long p=1;
    for(int i=1;i<=n;i++)
    p*=p;
    return p;
}
int main()
{
    int T=0;
    cin>>T;
    long k[T], n[T], sum=0;
    for(int i=0;i<T;i++)
    {
        cin>>k[i]>>n[i];
    }
    for(int j=1;j<=T;j++)
    {
        for(int m=1;m<=k[j];m++)
        {
            sum+=power(m,n[j]);
        }
        cout<<(sum%100);
    }
    return 0;
}
