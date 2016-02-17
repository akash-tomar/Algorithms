#include <iostream>
#include <map>
using namespace std;
int main()
{
    multimap<int,int> arr ;
    int n,x;
    cin>>n;
    for(int i=0;i<n;i++)
    {
        cin>>x;
        arr.insert({x,i+1});
    }
    for(auto it=arr.begin();it!=arr.end();it++)
    {
        cout<<it->first<<" "<<it->second<<endl;
    }
    return 0;
}
