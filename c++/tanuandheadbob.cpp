#include<iostream>
using namespace std;
int main()
{
    int t,i,j,ch=0,choice=1;
    cin>>t;
    int n[1000];
    char gest[1000][1000];
    for(i=0;i<t;i++)
    {
        cin>>n[i];
        for(j=0;j<n[i];j++)
        {
            cin>>gest[i][j];
        }
    }

    for(i=0;i<t;i++)
    {
        ch=choice=0;
        for(j=0;j<n[i];j++)
        {
            if(gest[i][j]=='I')
            ch=1;
            if(gest[i][j]=='Y')
            choice=1;
        }
        if(ch==1)
        cout<<"INDIAN"<<endl;
        else if(choice==1)
        cout<<"NOT INDIAN"<<endl;
        else
        cout<<"NOT SURE"<<endl;
    }
return 0;
}




