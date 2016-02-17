#include<iostream>
#include<sstream>
#include<set>
#include<vector>
#include<list>
#include<algorithm>
#define ll long long int
using namespace std;





int main()
{
    int t;//=s.nextInt();
    cin>>t;
    for(int i=0;i<t;i++) {
        int x;//=s.nextInt();
        cin>>x;
        int deg=x/30;
        cout<<((int)pow(2, 1+deg))<<endl;

    }




    return 0;
}


