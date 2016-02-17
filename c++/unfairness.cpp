#include<iostream>
#include<set>
#include<algorithm>
#include<vector>
using namespace std;
int main()
{
    int n,x,min=10000000000,max=0,z=0;
    cin>>n;
    int k;
    cin>>k;
    multiset<int> arr;
    for(int i=0;i<n;i++)
    {
         cin>>x;
         arr.insert(x);
    }
    auto it=arr.begin();
    while(z<k)
    {
        if(*it<min)
            min=*it;
        else if(*it>max)
            max=*it;
        it++;
        z++;
    }
    cout<<max-min<<endl;
    return 0;

}
