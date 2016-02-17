#include<iostream>
#include<sstream>
#include<set>
#include<vector>
#include<list>
#include<algorithm>
#include<cmath>
using namespace std;
#define ll long long int




int main()
{
    ll L,s1,s2;
    cin>>L>>s1>>s2;
    int q;
    cin>>q;
    for(int i=0;i<q;i++)
    {
        ll query;
        cin>>query;
        if(sqrt(query)==L)
        {
            cout<<"0.0000";
        }
        else
        {
           float ans=( (sqrt(2)*L)-sqrt(2*query) )/ fabs(s2-s1) ;
           cout<<fixed;
           cout.precision(4);
           cout<<ans<<endl;
        }

    }




    return 0;
}


