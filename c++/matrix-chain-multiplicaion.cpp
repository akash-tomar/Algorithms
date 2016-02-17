#include<iostream>
#include<sstream>
#include<set>
#include<vector>
#include<list>
#include<algorithm>
#include<climits>
using namespace std;
#define ll long long int
int predefined[10000][10000];
//int z=0;
ll min_multi(int *A,int i,int j)
{
//    z++;
//    cout<<z<<endl;
    if(predefined[i][j]!=-1)
    {
        return predefined[i][j];
    }
    else
    {
       if(i==j)
       {
           // cout<<"jhingalala"<<endl;
            return 0;
       }
       else if(j-i==1)
       {
           //cout<<"Hakunama tata "<<endl;
           return A[i-1]*A[i]*A[i+1];
       }
       else
       {
           int minimum=INT_MAX;
           for(int k=i;k<j;k++)
           {
               ll x=min_multi(A,i,k)+min_multi(A,k+1,j)+A[i-1]*A[k]*A[j];
             //  cout<<"x is : "<<x<<endl;
               if(x<minimum)
               {
                   minimum=x;
               }


           }
           predefined[i][j]=minimum;
           return predefined[i][j];
       }
    }


}


int main()
{
    int n;

    cout<<"Enter the no of matrices : " ;
    cin>>n;

    for(int i=1;i<=n;i++)
        for(int j=1;j<=n;j++)
            predefined[i][j]=-1;

    int *A=new int[n+1];
    cout<<"Enter the indices of sizes : ";
    for( int i=0;i<n;i++)
        cin>>A[i];
    cout<<"Min no of multiplications needed are : " << min_multi(A,1,n-1);



    return 0;
}


