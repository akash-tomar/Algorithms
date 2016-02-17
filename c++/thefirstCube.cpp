#include<iostream>
#include<sstream>
#include<set>
#include<vector>
#include<list>
#include<algorithm>
#include<cmath>
using namespace std;
#define ll long long int


bool cuberoot(ll s)
{

        double d=cbrt(s);
        double d1=floor(d);
        if(d/d1==1.0)
            return true;
        else
            return false;

}


int main()
{
    int t;
    cin>>t;
    for(int i=0;i<t;i++)
    {
        ll n;
        cin>>n;
        int arr;
        ll s=1;
        for(int j=0;j<n;j++)
        {
            cin>>arr;
            s*=arr;
        }

        int k=1;
        ll sos=s;
        while(true)
        {
            sos=s*k;
            if(cuberoot(sos))
            {
                cout<<sos<<endl;
                break;
            }
            k++;



        }

    }
//    delete[] d;

    return 0;
}


