#include<iostream>
using namespace std;

long power(int a,int b)
{
    long pow=1;
    for(int i=0;i<b;i++)
        pow=pow*a;
    return pow;

}

int main()
{
    unsigned long n[100000];
    unsigned int t;
    int i=0;
    cin>>t;
    for(i=0;i<t;i++)
    {
       cin>>n[i];
    }
    for(i=0;i<t;i++)
    {
        if(n[i]==0)
            cout<<4<<endl;
        else
            cout<<(4+power(2,n[i]))%(power(10,9)+7)<<endl;
    }
    return 0;
}

