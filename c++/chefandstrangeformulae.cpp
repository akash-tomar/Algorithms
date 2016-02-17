#include<iostream>
using namespace std;
typedef long long int ll;
ll facts[100000];
ll psum[100000];
ll fact(const ll &n,const ll &m)
{
    if(facts[n]==-1)
    {
        ll factorial=1;
        for(ll i=1;i<=n;i++)
            factorial*=i;
        facts[n]=factorial%m;
        return facts[n];
    }
    else
        return facts[n];

}


ll solve(const ll &x,const ll &m)
{
    if( psum[x]==-1 )
    {
        ll sum=0;
        for(ll i=1;i<=x;i++)
        {
            sum+=( (i%m)*( ( fact(i,m) + x%m )%m ) )%m;

        }
        psum[x]=sum;
        return psum[x];

    }
    else
        return psum[x];

}


int main()
{
    ll n,m,i,sum=0;
    cin>>n>>m;
    ll *p=new ll[n];
    for(i=0;i<=n;i++)
    {
        facts[i]=-1;
        psum[i]=-1;
    }
    //ll *sum=new ll[n];
    for(i=0;i<n;i++)
    {
        cin>>p[i];
        sum+=(solve(p[i],m));
    }
    cout<<sum%m<<endl;
    //cout<<facts[1]<<" "<<facts[2]<<" "<<facts[3]<<" "<<facts[4]<<" "<<facts[5]<<" ";
    return 0;
}
