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
    for(int test=0;test<t;test++) {
        int n;
        cin>>n;
        set<char> s[n];
        int index=0;
        for(int i=0;i<n;i++) {
            string str;
            cin>>str;
            for(int i=0;i<str.length();i++) {
                s[index].insert(str[i]);
            }
            index++;
        }

    }
    return 0;
}


