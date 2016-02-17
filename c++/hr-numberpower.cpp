
#include <iostream>
#include<cmath>
#include<sstream>
using namespace std;

int no_of_digits(int n)
{
    for(int i=1;i<=18;i++)
    {
        if(n < pow(10,i))
        {
            return i;
            break;
        }
    }
}
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
    int n,c,n1,sum=0;
    cin>>n>>c;


    int digits=no_of_digits(n);

    if(n%3!=0)
    {

        if( no_of_digits(n-(n%3)) == digits )
        {
            n1=n-(n%3);
        }
        else
        {
           n1=n+( 3-(n%3) );
        }
    }


    if(n%3==0)
    {
        int z=n;
        while( no_of_digits(z+=3)==no_of_digits(n) )
        {
            string numz,numn;
            numz=individual_digit(z);
            numn=individual_digit(n);
            int coin=0;
            for(int i=0;i<digits;i++)
            {
                if(numn[i]-numz[i]>=0)
                    coin+=( numn[i]-numz[i] );
                else
                    coin+=( numz[i]-numn[i] );
            }
            if(coin<=c)
                sum++;
        }
        z=n;
        while( no_of_digits(z-=3)==no_of_digits(n))
        {
            string numz,numn;
            numz=individual_digit(z);
            numn=individual_digit(n);
            int coin=0;
            for(int i=0;i<digits;i++)
            {
                if(numn[i]-numz[i]>=0)
                    coin+=( numn[i]-numz[i] );
                else
                    coin+=( numz[i]-numn[i] );
            }
            if(coin<=c)
                sum++;
        }
    }
    else
    {
        int z=n1;
        while( no_of_digits(z+=3)==no_of_digits(n) )
        {
            string numz,numn;
            numz=individual_digit(z);
            numn=individual_digit(n);
            int coin=0;
            for(int i=0;i<digits;i++)
            {
                if(numn[i]-numz[i]>=0)
                    coin+=( numn[i]-numz[i] );
                else
                    coin+=( numz[i]-numn[i] );
            }
            if(coin<=c)
                sum++;
        }
        z=n1;
        while( no_of_digits(z-=3)==no_of_digits(n))
        {
            string numz,numn;
            numz=individual_digit(z);
            numn=individual_digit(n);
            int coin=0;
            for(int i=0;i<digits;i++)
            {
                if(numn[i]-numz[i]>=0)
                    coin+=( numn[i]-numz[i] );
                else
                    coin+=( numz[i]-numn[i] );
            }
            if(coin<=c)
                sum++;
        }

    }
    cout<<sum+1<<endl;

}




