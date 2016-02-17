#include<iostream>
#include<sstream>
using namespace std;

string individual_digit(long long int n)
{
    string num;
    std::ostringstream oss;
    oss<<n;
    num=oss.str();
    return num;


}


int main()
{
    long long int n;
    cin>>n;
    int x=9;
    char ch=(char)x;
    string num=individual_digit(n);
    cout<<num<<endl;
    int ch1=(int) num[0];
    cout<<num[0]<<endl;
    cout<<ch1<<endl;
    for(int i=0;num[i]!=NULL;i++)
    {
        if( ((ch-num[i])< num[i] ) )
        {
            num[i]= (int)(ch-num[i]);
        }
    }
    cout<<num;
    return 0;
}
