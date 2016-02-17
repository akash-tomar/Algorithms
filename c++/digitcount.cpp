#include<iostream>
#include<sstream>
#include<cmath>
using namespace std;
string individual_digit(unsigned long n)
{
    string num;
    std::ostringstream oss;
    oss<<n;
    num=oss.str();
    return num;


}
int main()
{
    unsigned long digits;
    cin>>digits;
    unsigned long i=1;
    string digit;
    while(true)
    {
        digit=individual_digit( pow(i,digits) );
        if( digit.size()==digits )
        {
            cout<<pow(i,digits)<<endl;
            //cout<<"NO";
        }
        else if( digit.size()>digits )
        {
            break;
        }
        i++;

    }
    return 0;
}
