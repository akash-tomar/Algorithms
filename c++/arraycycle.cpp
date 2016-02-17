#include<iostream>
using namespace std;
int m,n;
char arr[1000][1000];

void adjacent_vert(int x,int y)
{
    if(x==0)
    {
        if(y==0)
        {
            x,y+1;
            x+1,y;
        }
        else if(y==n-1)
        {
            x-1,y;
            x,y+1;
        }
        else
        {
            x-1,y;
            x+1,y;
            x,y+1;
        }
    }
    else if(x==m-1)
    {
        if(y==0)
        {
            x,y+1;
            x-1,y;
        }
        else if(y==n-1)
        {
            x,y-1;
            x,y-1;
        }
        else
        {
            y-1,x;
            y+1,x;
            x-1,y;
        }
    }
    else if(y==0 and x!=0 and x!=(m-1))
    {
        x-1,y
        x+1,y
        x,y+1
    }
    else if(y==n-1 and x!=0 and x!=(m-1))
    {
        x-1,y
        x+1,y
        x,y-1
    }
    else
    {
        x-1,y
        x+1,y
        x,y-1
        x,y+1
    }
}



int main()
{

    cin>>m>>n;

    for(int i=0;i<m;i++)
    {
        for(int j=0;j<n;j++)
        {
            cin>>arr[i][j];
        }
    }

}
