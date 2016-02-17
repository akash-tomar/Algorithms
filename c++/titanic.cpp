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
    int n;
    cin>>n;
    list <int> titanic;
    for(int i=1;i<=n;i++)
    {
        titanic.push_back(i);
    }

    auto it1=titanic.begin();
    titanic.erase(it1);
    for(auto it=titanic.begin();it!=titanic.end();it++)
        cout<<(*it)<<endl;

    //cout<<titanic.size()<<endl;
    while(titanic.size()!=1)
    {
        cout<<endl;
        cout<<"fuck yeah";
        bool odd=true;
        for(auto it=titanic.begin();it!=titanic.end();it++)
        {
            if(odd)
            {
                cout<<"erasing : "<<*it<<endl;
                titanic.erase(it);
                odd=false;
            }
            else
                odd=true;
        }
        for(auto it2=titanic.begin();it2!=titanic.end();it2++)
        cout<<(*it2)<<" ";
    }
    cout<<titanic.front()<<endl;





    return 0;
}


