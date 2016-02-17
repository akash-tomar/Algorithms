#include<iostream>
#include<sstream>
#include<set>
#include<vector>
#include<list>
#include<algorithm>
#include<iomanip>
#define ll long long int
using namespace std;





int main()
{
    int t=1;
    //cin>>t;
    for(int i=0;i<t;i++) {
        int n=100;
        //cin>>n;
        //vector<int>s1;
        //vector<int>s2;
        double num=1;
        double den1=1,den2=1;

        for(int j=1;j<=2*n;j++) {
            if( j%2==0 ) {
                num*=j;
            }
            else if(j%2!=0) {
                den1*=j;
                //den2*=j;
            }

        }
        den2=den1;
        for(int j=2*n;j<=2*(n+1);j++) {
            if(j%2!=0) {
                den2*=j;
            }
        }
        double x=(num*num)/(den1*den2);
        cout<<fixed<<setprecision(2)<<x<<endl;


    }




    return 0;
}


