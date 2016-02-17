#include<iostream>
#include<set>
using namespace std;
typedef long long int ll;
ll fun(ll &z,ll &s,int &f)
{
    if(z!=1 and s>f)
    {
        z--;
        s-=f;

        return f;
    }
    else if( s<=f )  // s==0 and z!=0
    {
        return -1;

    }
    else
        return s;
}

int main()
{
    int t;
    cin>>t;
    for(int h=0;h<t;h++)
    {
        ll n=0,s=0,counts=0,answer=0;
        cin>>n>>s;
        multiset<ll> set_s;
        ll i=1;
        while(s>0)    // making the set
        {
            if(i<s and counts<n)
            {
                set_s.insert(i);
                s-=i;
                i++;
                counts++;
            }
            else
            {
                ll y=n-counts;
                ll z=y;
                int f=1;
                int b=1;
                for(int j=0;j<y;j++)
                {
                    int a= fun(z,s,f);

                    if(a==-1)
                    {
                        set_s.insert(1);
                        auto it6=set_s.lower_bound(b+1);
                        set_s.erase(it6);
                        set_s.insert(it6,b);

                    }
                    else
                    {
                        set_s.insert( a );
                    }
                    f++;
                }
                break;
            }
        }
        for(auto it5=set_s.begin();it5!=set_s.end();it5++)
        {
            cout<<*it5<<" ";
        }

        auto it3=set_s.rbegin();
        ll maxima=*it3;
        auto it2=set_s.begin();
        auto it1=it2;
        bool first=true;
        for(it2;it2!=set_s.end();it2++)
        {
            if(!first)
            {
                //cout<<endl<<*it1<<" "<<*it2<<endl;

                if(*it1==*it2)
                {
                    maxima++;
                    set_s.erase(it2);
                    set_s.insert(maxima);
                    it2=(it1);
                  //  cout<<endl<<*it1<<" "<<*it2<<endl;
                    //*it2=maxima;
                    //it2--;
                    answer++;
                    //for(auto it4=set_s.begin();it4!=set_s.end();it4++)
                      //  cout<<*it4<<" ";
                    //cout<<endl<<*it1<<" "<<*it2;
                    //cout<<"hey"<<endl;


                }
                else
                {
                    it1=it2;
                }
            }
            else
                first=false;
        }
        cout<<endl<<answer<<endl;


    }
    return 0;
}
