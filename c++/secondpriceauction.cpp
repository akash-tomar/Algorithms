#include<iostream>
using namespace std;
int main()
{
    int n;
    cin>>n;
    double sum=0;
    double *l=new double[n];
    double *r=new double[n];
    for(int i=0;i<n;i++)
    {
        cin>>l[i]>>r[i];
    }

    double max1=0,max2l=0,max2r=0,max3=0;
    for(int i=0;i<n;i++)
    {
        if(max1<r[i])
            max1=r[i];
    }
    for(int i=0;i<n;i++)
    {
        if(max2r<r[i] and r[i]!=max1)
        {
             max2r=r[i];
            max2l=l[i];
        }
    }
    for(int i=0;i<n;i++)
    {
        if(max3<r[i] and r[i]!=max2r and r[i]!=max1)
            max3=r[i];
    }
     //cout<<max1<<" "<<max2l<<" "<<max2r<<" "<<max3<<endl;
    double diff=(max2r-max2l)+1;
    double deg=0;
   // cout<<"Diff is : "<<diff<<endl;
    if(max3>max2l)
    {
        deg=(max3-max2l)+1;
    }

    for(int j=max3;j<=max2r;j++)
    {
        if(j==max3 and max3>max2l)
        {
            sum+=(deg/diff)*j;
     //       cout<<"HEY"<<" "<<sum<<endl;
        }
        else //if(j==max3 and max3<max2l)
        {
            sum+=(1/diff)*j;
       //     cout<<"hey"<<" "<<sum<<endl;
        }
//        else
//        {
//            sum+=(1/diff)*j;
//        }
    }
    cout<<sum<<endl;
    return 0;
}
