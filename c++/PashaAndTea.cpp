#include<iostream>
#include<sstream>
#include<set>
#include<vector>
#include<list>
#include<algorithm>
#define ll long long int
using namespace std;

ll quick_sort(ll*,ll,ll);
    void quick(ll *A,ll p,ll r)
    {
        if(p<r)
        {
            ll q=quick_sort(A,p,r);
            quick(A,p,q-1);
            quick(A,q+1,r);
        }
    }

    ll quick_sort(ll A[],ll p,ll r)
    {
        ll x=A[r];
        ll i,j;
        i=p-1;
        for(j=p;j<r;j++)
        {
            if(A[j]<x)
            {
                i++;
                ll temp=A[i];
                A[i]=A[j];
                A[j]=temp;
            }
        }
        ll temp1=A[i+1];
        A[i+1]=A[r];
        A[r]=temp1;
        return (i+1);
    }



int main()
{
    ll n,w;
    cin>>n>>w;
    ll *A=new ll[2*n];
    for(ll i=0;i<2*n;i++) {
        cin>>A[i];
    }
    quick(A,0,2*n-1);

    double girl=A[0];
    double boy=A[n];
    //cout<<girl<<" "<<boy<<endl;
    if((girl*2)<=boy) {
        if(((n*girl)+(n*girl*2))<=w)) {
            cout<<((n*girl)+(n*girl*2));
            return;     }
    } else {
        if((((n*(boy/2))+(n*boy)))<=w) {

        cout<< (((n*(boy/2))+(n*boy)));
        return;}
    }






    return 0;
}


