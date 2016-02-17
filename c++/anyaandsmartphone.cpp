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
    ll n,m,k,gestures=0;
    cin>>n>>m>>k;

    ll *apps=new ll[n];
    ll ops;//=new int[m];
    for(ll i=0;i<n;i++)
        cin>>apps[i];
    for(ll i=0;i<m;i++)
    {
        cin>>ops;
        ll j=0;
        ll screen=0;
        bool found=false;
        while(true)
        {
            for(ll temp=1;temp<=k ;temp++)
            {
                if( apps[j]==ops )
                {
                    apps[j]=apps[j-1];
                    apps[j-1]=ops;
                    found=true;
                    if(screen==0)
                        gestures++;
                    else
                        gestures+=1+screen;
                    break;

                }
                j++;

            }
            screen++;
            if(j>n)
                break;
            if(found)
                break;
        }

    }
    cout<<gestures;










//        ll temp=1;
//        for(ll j=1;j<=n;j++)
//        {
//            if(j>temp)
//            {
//
//            }
//            if( apps[j]==ops )
//            {
//                apps[j]=apps[j-1];
//                apps[j-1]=ops;
//
//            }
//            else
//            {
//                if( (temp+1)<k)
//                {
//                    temp++;
//                }
//
//            }
//
//
//
//
//        }









    return 0;
}


