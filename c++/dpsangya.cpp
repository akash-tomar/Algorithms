#include<iostream>
//#include<conio>
using namespace std;
int lcslength(char x[10],char y[10],int a,int b)
{
  int l[10][10];
  for(int i=0;i<=a;i++)
  {
    l[i][0]=0;
  }
  for(int j=0;j<=b;j++)
  {
    l[0][j]=0;
  }
  for(int i=0;i<=a;i++)
  {
    for(int j=0;j<=b;j++)
    {
      if(x[i-1]==y[j-1])
      {
       l[i][j]=l[i-1][j-1]+1;
      }
      else
        if(l[i-1][j]>=l[i][j-1])
         {
           l[i][j]=l[i-1][j];
         }
      else
        l[i][j]=l[i][j-1];

    }
  }
  for(int i=0;i<=a;i++)
  {
   for(int j=0;j<=b;j++)
   {
       cout<<" "<<l[i][j];

  }
  cout<<endl;
  }
  return l[a][b];
}


int lcslength2(char m[],char n[], int x, int y) {
    if(x<0 or y<0) {
        return 0;
    }

    if(m[x]==n[y]) {
        return (1+lcslength2(m,n,x--,y--));
    }

    int  temp1 = lcslength2(m,n,x--,y);
    int temp2 = lcslength2(m,n,x,y--);
    if(temp1>temp2)
        return temp1;
    return temp2;

}

int main()
{
  char m[]="abce";
  char n[]="abcde";

  //cout<<lcslength(m,n,4,5);
  cout<<lcslength2(m,n,3,4);
  return 0;
}
