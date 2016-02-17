#include<iostream>
#include<sstream>
#include<set>
#include<vector>
#include<list>
#include<algorithm>
using namespace std;
#define ll long long int

void GCD(int D,int d)
{
    int r=D%d;
    if(r==0)
    {
        cout<<"GCD is : "<<d;
        return;
    }
    else
        GCD(d,r);
}


int main()
{
    int a,b;
    cin>>a>>b;
    GCD(a,b);





    return 0;
}


