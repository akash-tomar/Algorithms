#include<iostream>
using namespace std;
int main()
{
    int T,i;
    int p[1000],x[1000],y[1000],u[1000],v[1000];
    cin>>T;
    for(i=0;i<T;i++)
    {
        cin>>p[i]>>x[i]>>y[i]>>u[i]>>v[i];
    }
    for(i=0;i<T;i++)
    {
        if((x[i]+y[i])==5)
        {
            cout<<"fucked up totally!";
        }
}    }

