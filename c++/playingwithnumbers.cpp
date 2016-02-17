#include<iostream>
using namespace std;
int main()
{
    int n,i,sum=0;
    cin>>n;
    int *arr=new int[n];
    for(i=0;i<n;i++)
    {
        cin>>arr[i];
    }
    int q,j;
    cin>>q;
    int *query=new int[q];
    for(j=0;j<q;j++)
    {
        sum=0;
        cin>>query[j];
        for(i=0;i<n;i++)
        {
            arr[i]+=query[j];
            if(arr[i]<0)
                sum+=(-1)*arr[i];
            else
                sum+=arr[i];
        }
        /*for(i=0;i<n;i++)
        {
            if(arr[i]<0)
                sum+=(-1)*arr[i];
            else
                sum+=arr[i];
        }*/
        cout<<sum<<endl;


    }




    delete[] query;
    delete[] arr;
    return 0;
}
