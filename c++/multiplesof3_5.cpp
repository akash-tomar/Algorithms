#include<iostream>
using namespace std;
int main()
{
    int t;
    cin>>t;
    for(int i=0;i<t;i++)
    {
        int n;
        cin>>n;
        int sum=0;
        for(int i=1;i<n;i++)
        {
            if(i%3==0 or i%5==0)
                sum+=i;

        }
        cout<<sum<<endl;

    }
    return 0;
}
