#include<iostream>
using namespace std;
long calculate(int x)
{
    x=x-2;
    long y=(7+6+5+4+3+2+1)+x*(6+5+4+3+2+1)+x*(5+4+3+2+1)+x*(4+3+2+1)+x*(3+2+1)+x*(2+1)+x;
    return y;
}
int main()
{
  long N;
  int x=0;
  cin>>N;
  if(N<=13)
  {
      cout<<"1";
  }
  else
  {
      N=N-13;
      if(N%2==0)
      {

         x=N/2;
         long y=calculate(x);
         cout<<y;
      }
      else
      {
         N=N-1;
         x=(N/2);
         long y=calculate(x);
         cout<<y;
      }
  }
  return 0;
}
