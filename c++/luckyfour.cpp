#include<iostream>
#include<sstream>
#include<set>
#include<vector>
#include<list>
#include<algorithm>
#include<cstdio>
using namespace std;
#define ll long long int




int main()
{

    ll t;
    cin>>t;
    for(int i=0;i<t;i++)
    {
        char *arr=new char[101];

        char c;
        ll counts=0;
        /*int k=0;
        while(k<25-1)
        {
             //scanf("%[^'\n']s",mycharBuffer);
            cin>>c;
            if(c=='4')
                counts++;

            else if(c=='\n')
                break;


            k++;
        }*/







        cin>>arr;
       // ll counts=0;
        for(int j=0;arr[j]!=NULL;j++)
        {
            if(arr[j]=='4')
                counts++;
        }
        cout<<counts<<endl;
    delete[] arr;
    }





//    delete[] arr;
    return 0;
}
