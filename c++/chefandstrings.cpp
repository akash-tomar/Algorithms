#include<iostream>
#include<cstdio>
using namespace std;
int main()
{
    char str[1000000];
    gets(str);
    int q,i;
    cin>>q;
    //cout<<str<<endl;
    char *a=new char[q];
    char *b=new char[q];
    int *l=new int[q];
    int *r=new int[q];
    for(i=0;i<q;i++)
    {
        //cout<<"first loop 0"<<endl;
        int counts=0;
        cin>>a[i]>>b[i]>>l[i]>>r[i];
        for(int j=l[i]-1;j<=r[i]-1;j++)
        {
           // cout<<"second loop"<<endl;

            if(str[j]==a[i])
            {
             //   cout<<"Second loop inside if "<<endl;


                //int brb[10000];
                int point=0;
                for(int z=j;z<=r[i]-1;z++)
                {
                    if(str[z]==b[i])
                    {
                        //counts++;
                  //      brb[point]=z;
                        point++;
                    }
                }

                counts+=point;


            }



        }
        cout<<counts<<endl;

    }
    delete[] a;
    delete[] b;
    delete[] l;
    delete[] r;
    return 0;
}
