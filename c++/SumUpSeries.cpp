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
    int t;
    cin>>t;
    for(int i=0;i<t;i++) {
        int n;
        cin>>n;
        set<int> series;
        for(int j=0;j<n;j++) {
            int x;
            cin>>x;
            series.insert(x);

        }
        int m;
        cin>>m;
        for(int j=0;j<m;j++) {
            int x;
            cin>>x;
            series.insert(x);
        }
        for(auto it=series.begin();it!=series.end();it++) {
            cout<<*it<<" ";
        }
        cout<<endl;


    }





    return 0;
}


