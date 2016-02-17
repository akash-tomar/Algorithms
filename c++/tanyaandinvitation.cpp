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
    multiset<char> s_l;
    multiset<char> t_l;
    multiset<char> s_u;
    multiset<char> t_u;
    char *s1=new char[2000000];
    char *t1=new char[2000000];
   //tring t1;
    cin>>s1>>t1;
    ll whoops=0,yay=0;
    for(int i=0;s1[i]!=NULL;i++)
    {
        if(isupper(s1[i]))
            s_u.insert(s1[i]);
        else
            s_l.insert(s1[i]);

        //s.insert(s1[i]);
    }

    for(int i=0;t1[i]!=NULL;i++)
    {
        if(isupper(t1[i]))
            t_u.insert(t1[i]);
        else
            t_l.insert(t1[i]);
    }
        //t.insert(t1[i]);

    for(auto it=s_l.begin();it!=s_l.end();it++)
    {
        bool found=false;
        auto it1=t_l.begin();
        if( *it==*it1 )
        {
            found=true;
            t_l.erase(it1);
            yay++;
            //break;
        }
        if(!found)
        {
            t_l.erase(it1);
            whoops++;
        }
    }
    for(auto it=s_u.begin();it!=s_u.end();it++)
    {
        bool found=false;
        auto it1=t_u.begin();
        if( *it==*it1 )
        {
            found=true;
            t_u.erase(it1);
            yay++;
            //break;
        }
        if(!found)
        {
            whoops++;
            t_u.erase(it1);
        }
    }
    cout<<yay<<" "<<whoops<<endl;





    delete[] s1;
    delete[] t1;
    return 0;
}


