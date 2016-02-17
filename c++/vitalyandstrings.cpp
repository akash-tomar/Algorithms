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
    string s,t;
    cin>>s>>t;
    bool found=false;
    for(int i=0;s[i]!=NULL;i++)
    {
        if(t[i]-s[i]>=2)
            found=true;

        if(s[i]<=t[i])
            continue;
        else
        {
            cout<<"No such string"<<endl;
            return 0;
        }

    }

    if(found==false)
    {
        cout<<"No such string"<<endl;
        return 0;
    }

    for(int i=0;s[i]!=NULL;i++)
    {
        if(t[i]-s[i]>=2)
            cout<<char(s[i]+1);
        else
            cout<<s[i];
    }





    return 0;
}



