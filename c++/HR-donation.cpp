#include<iostream>
using namespace std;
#define max 10000
int main()
{
    int T=0;
    cin>>T;
    long x[max];
    for(int i=0;i<T;i++)
    cin>>x[i];
    for(int j=0;j<T;j++)
    {
        long sum=0; int n=0;
        for(int i=1;i<=x[i]/2;i++)
        {
           sum+=i*i;
           if(sum<=x[i])
              n++;
        }
        cout<<n<<endl;
    }
    return 0;
}
