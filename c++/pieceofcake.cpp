#include<iostream>
#include<map>
using namespace std;
int main()
{
    int t,i;
    cin>>t;
    for(i=0;i<t;i++)
    {
        multimap<char,int> name;
        char c,maxchar;
        int z=0;
        string s;
        cin>>s;
        for(int j=0;j<s.length();j++)
        {
            name.insert({s[j],0});
        }





        for(auto it=name.begin();it!=name.end();it++)
        {
            if(it->second!=1){
            char ch=it->first;
            it->second=1;
            int counting=1;
            for(auto it1=name.begin();it1!=name.end();it1++)
            {
                if(ch==it1->first and it1->second==0)
                {
                   it1->second=1;
                   counting++;


                }
            }
            if(z==0)
            {
                z=counting;
                maxchar=ch;
            }
            else
            {
                if(z<counting)
                {
                    z=counting;
                    maxchar=ch;
                }
            }
            }
        }
        int length=name.size();
        //cout<<length;
        //cout<<z;
        if(z==length-z)
            cout<<"YES";
        else
            cout<<"NO";
    }
    return 0;
}
