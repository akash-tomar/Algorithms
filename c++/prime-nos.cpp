




//                                                                 SIEVE OF ERATOSTHENES





#include<iostream>
#include<sstream>
#include<set>
#include<vector>
#include<list>
#include<algorithm>
using namespace std;
#define ll long long int

ll prime[10000];


bool prime_checker(ll n)
{
    if(n==2)
        return true;
    else if(n>2)
    {
        for(int j=2;j<=n/2;j++)
        {
            if(n%j==0)
            {
                return false;
            }
        }
        return true;
    }
}

void prime_no(ll n)
{
    int j=2;
    //cout<<j<<endl;
    prime[j]=1;
    while(j<=n)
    {
        if(prime[j]==1)
        {
            cout<<j<<endl;
            int k=2;
            while(j*(k-1)<=n)
            {
                prime[j*k]=0;
                k++;
            }
        }
        else
        {
            if(prime_checker(j))
            {
                prime[j]=1;
                cout<<j<<endl;
                int k=2;
                while(j*(k-1)<=n)
                {
                    prime[j*k]=0;
                    k++;
                }

            }

        }
        j++;

    }

}

int main()
{
    ll n;
    for(int i=0;i<10000;i++)
        prime[i]=-1;
    cout<<"Enter the no upto which prime has to be printed : ";
//    if(prime_checker(4))
//        cout<<"true"<<endl;
//    else
//        cout<<"false"<<endl;
    cin>>n;
    prime_no(n);






    return 0;
}


