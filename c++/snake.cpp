#include<iostream>
using namespace std;
int main()
{
    int m,n;
    cin>>m>>n;
    static int z=1;
    char arr[100000][50];
    for(int i=0;i<m;i++)
    {
        for(int j=0;j<n;j++)
        {
            if(i%2==0)
            {
                arr[i][j]='#';
            }
            else if(i%2!=0)
            {
               if(z==1)
               {
                   if(j!=n-1)
                   {arr[i][j]='.';}
                   else
                   {
                        arr[i][j]='#';
                        z=0;
                        //cout<<"hurray";
                   }


               }
               else
               {
                   if(j==0)
                   {
                        arr[i][j]='#';

                   }
                   else
                    {
                        arr[i][j]='.';
                    }

                    if(j==n-1)
                    {
                        z=1;
                    }

               }

            }


        }

    }
    for(int i=0;i<m;i++)
    {
        for(int j=0;j<n;j++)
        {
            cout<<arr[i][j];
        }
        cout<<endl;
    }
    return 0;
}
