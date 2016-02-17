#include<iostream.h>
#define max 50
int main()
{
   cout<<"Enter M : ";
   cin>>M;
   int m[max][2];
   for(int j=0;j<M;j++)
   {
       for(int n=0;n<2;n++)
       {
           cin>>m[j][n];
       }
   }
   for(int x=0;x<M;x++)
     for(int y=0;y<2;y++)
       cout<<m[x][y];
    return 0;
}
