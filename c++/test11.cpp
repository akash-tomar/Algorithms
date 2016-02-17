#include <iostream>
#include <map>
#include<vector>
using namespace std;
int main()
{
    multimap<int,int> arr ; // error free
    int n,k,i,x,sum=0,j=0,count=0;
    vector<int> pos ;
    cin>>n;
    cin>>k;
    for(i=0;i<n;i++) // error free
    {
        cin>>x;
        arr.insert( {x,i+1} );
    }
    j=0;

    for(auto it = arr.begin();it!=arr.end();it++)
    {
        if( (sum+(it->first)) <= k )
        {
            sum+=it->first;
            //pos[j]=it->second;
            pos.insert(pos.begin()+j,it->second);

            //z=j;
            j++;
            count++;
        }
        else
            break;
    }
    cout<<count<<endl;
    if(count!=0)
    {
        for(auto it=pos.begin();it!=pos.end();it++)
        {
            cout<<*it<<" ";

        }
    }
    return 0;
}



