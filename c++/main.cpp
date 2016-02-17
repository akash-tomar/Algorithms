#include <iostream>

using namespace std;
long quick_sort(int*,long,long);
void quick(int *A,long p,long r)
{
    if(p<r)
    {
        long q=quick_sort(A,p,r);
        quick(A,p,q-1);
        quick(A,q+1,r);
    }
}

long quick_sort(int *A,long p,long r)
{
    int x=A[r];
    int i,j;
    i=p-1;
    for(j=p;j<r;j++)
    {
        if(A[j]<x)
        {
            i++;
            int temp=A[i];
            A[i]=A[j];
            A[j]=temp;
        }
    }
    int temp1=A[i+1];
    A[i+1]=A[r];
    A[r]=temp1;
    return (i+1);
}


int main()
{
    long t;
    cin>>t;
    for(int i=0;i<t;i++)
    {
        long n;
        cin>>n;

        int *arr = new int[n];
        for(long j=0;j<n;j++)
        {
            cin>>arr[j];
        }
        long f=-1,e=n;
        int x=arr[n-1];
        for(long k=n-2;k>=0;k--)
        {
            if(arr[k]>=x)
            {
                x=arr[k];
                e=k;
            }
            else if(arr[k]<x)
            {
                f=k;
                break;
            }

        }
        if(f==-1)
        {
            for(long j=0;j<n;j++)
            {
               cout<<arr[j];
            }
            cout<<endl<<"NO NXTBIG"<<endl;
        }

        else
        {
            for(long j=0;j<n;j++)
            {
               cout<<arr[j];
            }
            cout<<endl;
            int temp=arr[f];
            arr[f]=arr[n-1];
            arr[n-1]=temp;
            quick(arr,f+1,n-1);

            for(long d=0;d<n;d++)
            {
               cout<<arr[d];
            }
             cout<<endl;
        }
    }
    return 0;

}
