#include<iostream>
#include<sstream>
#include<set>
#include<vector>
#include<list>
#include<algorithm>
using namespace std;
#define ll long long int
ll fact=1;
ll factorial(ll n)
{
    if(n==0)
        return 1;
    else
    {
        return n*factorial(n-1);
    }
}

int main()
{
    int x=25;

    cout<<"Fact is : "<<factorial(x);





    return 0;
}
