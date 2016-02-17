
#include <iostream>
#include<cmath>
#include<iomanip>
//#include<stdio>
using namespace std;


int main()
{
    int t,i;  long double x=4,y=pow(3,0.5);
    cin>>t;
    long double r[20];
    for(i=0;i<t;i++)
    {
        cin>>r[i];
    }
    for(i=0;i<t;i++)
    {

      std::cout << std::setprecision(9) << ((3*y)/4)*(r[i]*r[i]) << '\n';


    }

    return 0;
}




