
#include<iostream>
using namespace std;
int main()
{
    int n,m,k,l;
    int c=0;
    cin>>n>>m>>k;
    int arr = new int [k][k];
    for(int s=0;s<k;s++)
        for(int t=o;t<k;t++)
            arr[s][t]=1;
    int i=new int[k];
    int j=new int[k];
    for(l=0;l<k;l++)
    {
        cin>>i[l]>>j[l];
        arr[i[l]][j[l]]=0;
        c++;
        if(c>=4)
        {
            if((i[l]-1) >=0 and (j[l]-1)>=0)
            {
                if( (arr[i[l]+1][j[l]) == 0)
                {

                }
            }
        }
    }



}
