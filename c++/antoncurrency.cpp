#include<iostream>
#include<sstream>
#include<vector>
using namespace std;
int main()
{
    int n;int z=1;
    cin>>n;
    string num;
    std::ostringstream oss;
    oss<<n;
    num=oss.str();
    //char max= -1;
    //cout<<num<<endl;
    //cout<<"max: "<<max<<endl;
    int it1=-1;int max=0;

    for(int c=0;c<num.size();c++)
    {
        if( num[c]%2==0)
        {
            max++;
        }
            //max++;
    }

    if(max>1)
    {
        for(int c=0;num[c]!=NULL;c++)
        {
        //cout<<"ding"<<endl;


            if( (num[c]%2==0) and num[c]<num.back() )
            {
            //max=num[c];
            //it1=c;
            //cout<<"yes"<<endl;

               char temp=num.back();
               num.back()=num[c];
               num[c]=temp;
            cout<<num;z=0;
               //it1=0;
               break;
            }
        }
        if(z==1){for(int c=num.size()-1;c>=0;c--)
        {
            if( (num[c]%2==0)  )
            {
            //max=num[c];
            //it1=c;
            //cout<<"yes"<<endl;

               char temp=num.back();
               num.back()=num[c];
               num[c]=temp;
            cout<<num;
               //it1=0;
               break;
            }
        }}
    }
    else if(max==1)
    {
        for(int c=0;c<num.size();c++)
        {
        //cout<<"ding"<<endl;


            if( (num[c]%2==0)  )
            {
            //max=num[c];
            //it1=c;
            //cout<<"yes"<<endl;

               char temp=num.back();
               num.back()=num[c];
               num[c]=temp;
               for(char c: num)
                  cout<<c;
              // it1=0;
               break;
            }
         }
    }
   else if(max==0)
    {
        cout<<"-1";
    }

    /*char temp=num.back();
    num.back()=max;
    num[it1]=temp;
    for(char c: num)
        cout<<c;

    }
    else if( (num[0]%2==0) )
    {
        char temp=num.back();
    num.back()=num[0];
    num[0]=temp;
    for(char c: num)
        cout<<c;
    }
    else*/
        //cout<<"-1";









    return 0;
}
