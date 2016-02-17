#include<iostream>
using namespace std;

bool prime(int x)
{

  bool prime;

  //cout << "Please enter a positive integer" << endl;
  //cin >> num;

  for(int i = 3; i <= x; i++){
    prime = true;
    for(int n = 2; n <= i - 1; n++){
      if(i % n == 0){
        prime = false;
      }
    }

  }
  return prime;
}
int seq[1000];
int p=0;
int counts=0;
int solve(int x)
{

    for(int j=x;j>=2;j--)
        {
            bool tf=prime(j);
            if(tf)
            {
               seq[p]=j;
               p++;
               if(j==x)
                  return 1;

               if(x-seq[p]>=2)
               {
                   solve(x-seq[p]);
                   counts++;
               }
               else if(x-seq[p]==0)
               {
                   return counts;
               }
               else if()
               return;
            }

        }
}
int main()
{
    int t;
    cin>>t;
    for(int i=0;i<t;i++)
    {
        int x;
        cin>>x;
        counts=0;
        int h=solve(x);
        cout<<h<<endl;


    }
}
