#include<iostream>
using namespace std;
int main()
{
    int t,i,hack;
    cin>>t;
    char str[100][1000];
    for(i=0;i<t;i++)
    {
        cin>>str[i];
    }
    for(i=0;i<t;i++)
    {
        cout<<str[i];
        cout<<endl;

    }
    cin>>hack;
    cout<<hack;
    return 0;
}
