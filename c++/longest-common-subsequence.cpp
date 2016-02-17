#include<iostream>
#include<sstream>
#include<set>
#include<vector>
#include<list>
#include<algorithm>
using namespace std;
#define ll long long int
string x,y;
int LCS(int i, int j)
{
    if( i==0 or j==0)
        return 0;
    else if( x[i]==y[j] )
        return (1+LCS(i-1,j-1));
    else
    {
        int a=LCS(i-1,j);
        int b=LCS(i,j-1);
        return (a>b?a:b);
    }

}


int main()
{

    cin>>x>>y;
    cout<<"Longest common subsequence is : "<<LCS(x.size(),y.size());
    return 0;
}


