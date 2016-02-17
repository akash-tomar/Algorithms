#include<sstream>
#include<iostream>
using namespace std;
string individual_digit(int n)
{
    string num;
    std::ostringstream oss;
    oss<<n;
    num=oss.str();
    return num;


}

int main()
{
    int n;
    cin>>n;
    string num=individual_digit(n);
    cout<<num[0]<<" "<<num[1]<< " "<<num[2]<<" "<<num.size();

    return 0;
}
