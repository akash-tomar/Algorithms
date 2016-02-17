#include<iostream>
#include<cstdio>
using namespace std;
#include <cmath>

long printPowerSet(int *set, int set_size)
{
    /*set_size of power set of a set with set_size
      n is (2**n -1)*/
    unsigned int pow_set_size = pow(2, set_size);
    int counter, j;
    long sum=0,sumsum=0;

    /*Run from counter 000..0 to 111..1*/
    for(counter = 0; counter < pow_set_size; counter++)
    {
      for(j = 0; j < set_size; j++)
       {
          /* Check if jth bit in the counter is set
             If set then pront jth element from set */
          if(counter & (1<<j))
            sumsum+=set[j];
       }
       if(sum<sumsum)
        sum=sumsum;
    }
    return sum;
}

/*Driver program to test printPowerSet*/
/*int main()
{
    char set[] = {'a','b','c'};
    printPowerSet(set, 3);

    getchar();
    return 0;
}*/












int main()
{
    int t;
    cin>>t;
    for(int i=0;i<t;i++)
    {
        int n,m;//,sumsum=0,sum=0,counts=0;
        cin>>n>>m;
        int *arr = new int[n];
        for(int i=0;i<n;i++)
        {
            cin>>arr[i];
        }
        long sum=(printPowerSet(arr,n))%m;
        /*for(int j=0;j<n;j++)
        {
            sumsum=0;
            for(int k=0;k<=j;k++)
            {
                sumsum+=arr[k];
                sumsum=sumsum%m;
                if(sum<sumsum)
                    sum=sumsum;
                counts++;
            }
        }*/

        cout<<sum<<endl;//<<counts<<endl;






    }
    return 0;
}

