#include<iostream>
using namespace std;
int main()
{
    int t,i=0,j=0;
    cin>>t;
    int n[100],m[10000],max[100];
    int a[100][100];
    for(i=0;i<t;i++)
    {
        cin>>n[i]>>m[i];
        for(j=0;j<n[i];j++)
        {
            cin>>a[i][j];
        }
    }

    for(i=0;i<t;i++)
    {

        max[i]=a[i][0];
        for(j=0;j<n[i];j++)
        {
            if(a[i][j]>max[i])
            {
                max[i]=a[i][j];
            }
        }
    }

    for(i=0;i<t;i++)
    {
        for(j=0;j<n[i];j++)
        {
            m[i]=m[i]-(max[i]-a[i][j]);
        }
    }

    for(i=0;i<t;i++)
    {

            if(m[i]%n[i]==0)
            cout<<"Yes"<<endl;
            else
            cout<<"No"<<endl;

    }
return 0;
}
