#include<iostream>
#include<cmath>
using namespace std;
int main()
{

    int t;
    cin>>t;
    for(int z=0;z<t;z++)
    {
        string s,s1;
        cin>>s;
        if(s.length()==1)
        {
            cout<<"0";
            return 0;
        }
        s1=s;
        //cout<<s1<<endl;
        int x=0,y=0,i,j,g=0,h=0;
        //auto it1=s1.begin();
        //auto it2=s1.begin();
        bool first=true;
        j=0;
        for(i=0;s1[i]!=NULL;i++)
        {
            if(!first)
            {
                if(s1[i]==s1[j])
                {
                    if(s1[i]=='+')
                        s1[i]='-';
                    else
                        s1[i]='+';
                    x++;
          //          cout<<"hurrey"<<endl;
                }
                j=i;
            }
            first=false;

        }
        s1=s;
       // cout<<s1<<endl;
        bool exp=false;
        //it1=s1.begin();
        //it2=s1.begin();
        first=true;
        i=j=0;
        for(i=0;s1[i]!=NULL;i++)
        {
            if(!first)
            {
                if(exp==false)
                {
                    if(s1[i]==s1[j])
                    {
                        if(s1[j]=='+')
                            s1[j]='-';
                        else
                            s1[j]='+';
                        y++;
                        exp=true;
         //               cout<<"hurrey"<<endl;
                    }
                    j=i;
                }
                else
                {
                    if(s1[i]==s1[j])
                    {
                        if(s1[i]=='+')
                            s1[i]='-';
                        else
                            s1[i]='+';
                        y++;
           //             cout<<"hurrey"<<endl;
                    }
                    j=i;
                }
            }
            first=false;
        }
        //if(x<=y)
          //  cout<<x<<endl;
        //else
          //  cout<<y<<endl;




        //string s,s1;
        //cin>>s;
        s1=s;
        //cout<<s1<<endl;

        //auto it1=s1.begin();
        //auto it2=s1.begin();
        first=true;
        j=s1.length();
        for(i=s1.length();i>=0;i--)
        {
            if(!first)
            {
                if(s1[i]==s1[j])
                {
                    if(s1[i]=='+')
                        s1[i]='-';
                    else
                        s1[i]='+';
                    g++;
          //          cout<<"hurrey"<<endl;
                }
                j=i;
            }
            first=false;

        }
        s1=s;
       // cout<<s1<<endl;
        exp=false;
        //it1=s1.begin();
        //it2=s1.begin();
        first=true;
        j=s1.length();
        for(i=s1.length();i>=0;i--)
        {
            if(!first)
            {
                if(exp==false)
                {
                    if(s1[i]==s1[j])
                    {
                        if(s1[j]=='+')
                            s1[j]='-';
                        else
                            s1[j]='+';
                        h++;
                        exp=true;
         //               cout<<"hurrey"<<endl;
                    }
                    j=i;
                }
                else
                {
                    if(s1[i]==s1[j])
                    {
                        if(s1[i]=='+')
                            s1[i]='-';
                        else
                            s1[i]='+';
                        h++;
           //             cout<<"hurrey"<<endl;
                    }
                    j=i;
                }
            }
            first=false;
        }

       int min=0;
       min=fmin(x,y);
       min=fmin(min,g);
       min=(fmin(min,h));
       cout<<min<<endl;

    }
}
