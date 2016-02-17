#include<iostream>
#include<sstream>
#include<set>
#include<vector>
#include<list>
#include<algorithm>
using namespace std;
#define ll long long int

int size;
ll *price=new ll[size+1];
ll *best=new ll[size+1];
ll rod_cut(int n)
{
    if(n==1 or n==0)
        return price[n];
    else
    {
        multiset<ll> temp;
        for(int k=1;k<=n;k++)
        {
            temp.insert(price[k]+rod_cut(n-k));
        }
        best[n]=(*(temp.rbegin()));
//        cout<<"best : "<<n<<" "<<best[n]<<endl;
//        for(auto it=temp.begin();it!=temp.end();it++)
//            cout<<*it<<" ";
//        cout<<endl;
        return best[n];
    }
}


int main()
{
    int n;
    cin>>size;
    price[0]=0;
    for(int i=1;i<=size;i++)
        cin>>price[i];
    cout<<"Index to be computed : ";
    cin>>n;
    cout<<rod_cut(n);



    delete[] price;
    delete[] best;
    return 0;
}


