#include<iostream>
#include<string>
using namespace std;
int main()
{
    int T=0,N=1;
    char *S1,*S2,*S3,*S4,*S5;
    cin>>T;
    for(int m=0;m<T;m++)
    {
        if(N==1)
        {
        cin>>S1; N++;}
        else if(N==2)
        {cin>>S2;N++;}
        else if(N==3)
        {cin>>S3;N++;}
        else if(N==4)
        {cin>>S4;N++;}
        else if(N==5)
        {cin>>S5;N++;}
    }

    for(int z=1;z<=T;z++)
    {
      if(z==1)
      {
         int n=1;
         for(int i1=0;S1[i1]!='\0';i1++)
         {

            if(i1%2==0)
            {
               if(S1[i1]=='l')
               {
                  n*=2;
               }
               else if(S1[i1]=='r')
               {
                  n=n*2+2;
               }
            }
            else
            {
               if(S1[i1]=='l')
               {
                  n=n*2-1;
               }
               else if(S1[i1]=='r')
               {
                  n=n*2+1;
               }
            }
         }

         cout<<endl<<n;
      }
      if(z==2)
      {
         int n=1;
         for(int i2=0;S2[i2]!='\0';i2++)
         {

            if(i2%2==0)
            {
               if(S2[i2]=='l')
               {
                  n*=2;
               }
               else if(S2[i2]=='r')
               {
                  n=n*2+2;
               }
            }
            else
            {
               if(S2[i2]=='l')
               {
                  n=n*2-1;
               }
               else if(S2[i2]=='r')
               {
                  n=n*2+1;
               }
            }
         }

         cout<<endl<<n;
      }

      if(z==3)
      {
         int n=1;
         for(int i3=0;S3[i3]!='\0';i3++)
         {

            if(i3%2==0)
            {
               if(S3[i3]=='l')
               {
                  n*=2;
               }
               else if(S3[i3]=='r')
               {
                  n=n*2+2;
               }
            }
            else
            {
               if(S3[i3]=='l')
               {
                  n=n*2-1;
               }
               else if(S3[i3]=='r')
               {
                  n=n*2+1;
               }
            }
         }

         cout<<endl<<n;
      }
      if(z==4)
      {
         int n=1;
         for(int i4=0;S4[i4]!='\0';i4++)
         {

            if(i4%2==0)
            {
               if(S4[i4]=='l')
               {
                  n*=2;
               }
               else if(S4[i4]=='r')
               {
                  n=n*2+2;
               }
            }
            else
            {
               if(S4[i4]=='l')
               {
                  n=n*2-1;
               }
               else if(S4[i4]=='r')
               {
                  n=n*2+1;
               }
            }
         }

         cout<<endl<<n;
      }
      if(z==5)
      {
         int n=1;
         for(int i5=0;S5[i5]!='\0';i5++)
         {

            if(i5%2==0)
            {
               if(S5[i5]=='l')
               {
                  n*=2;
               }
               else if(S5[i5]=='r')
               {
                  n=n*2+2;
               }
            }
            else
            {
               if(S5[i5]=='l')
               {
                  n=n*2-1;
               }
               else if(S5[i5]=='r')
               {
                  n=n*2+1;
               }
            }
         }

         cout<<endl<<n;
      }
    }
    return 0;
}
