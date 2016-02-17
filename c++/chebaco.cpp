#include<iostream>
using namespace std;
typedef long long int ll;
int main()
{
    ll *n = new ll[1400];
    int ch=0;
    int i=0;
    while(ch)
    {
        cin>>ch;
        n[i]=ch;
        i++;
    }
    i=0;
    while(n[i])
    {
        if( n[i] < (9-n[i]) )
        {
            n[i] = 9-n[i];
        }
        i++;
    }
    for(int j=0;j<i;j++)
        cout<<n[j];
    return 0;
}
