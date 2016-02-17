#include<iostream>
#include<set>
#include<algorithm>
#include<utility>
using namespace std;
int main()
{
    int t;
    cin>>t;
    for(int i=0;i<t;i++)
    {
        int n,x,max=0;
        cin>>n;
        multiset<int> pile;
        pair<int,int> p[100000];

        for(int j=0;j<n;j++)
        {
            cin>>x;
            int z=0;
            pile.insert(x);
            bool found=false;
            while(p[z].first)
            {
                if(x!=p[z].first)
                {
                    z++;
                }
                else if(x==p[z].first)
                {
                    p[z]=make_pair(x,p[z].second++);
                    found=true;
                    break;
                }

            }
            if(found==false)
            {
                //z++;
                p[z]=make_pair(x,1);
                z++;
            }
        }
       int pos=0;
        for(int h=0;h<n;h++)
        {
            if(pos<p[h].second)
            {
                pos=p[h].second;
                max=p[h].first;
            }
        }
       // cout<<max<<endl;



        cout <<(n- (count_if(pile.begin(), pile.end(),
                                              [=](int  s)->bool
                                              {
                                                  if(s==max)
                                                  {
                                                      return true;
                                                  }
                                                  else
                                                    return false;

                                              }  ))) << endl;

       /*for(auto it1=pile.begin();it1!=pile.end();it1++)
        cout<<*it1<<" ";
       cout<<endl<<max<<endl;*/


    }
    return 0;

}
