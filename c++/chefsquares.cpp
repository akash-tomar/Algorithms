#include<iostream>
#include<cmath>
//#include<conio>
using namespace std;

int distance(int x1,int y1,int x2,int y2)
{
//long dist=0;
return sqrt( (x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
}
int angle(int x1,int y1,int x2,int y2,int x3,int y3)
{
try{
int m1=(y2-y1)/(x2-x1);
int m2=(y3-y1)/(x3-x1);
return (m1*m2);
}catch(exception dividebyzero)
{
cout<<"here";
}
}



int main()
{
//clrscr();
int n,i=0,z=10;
cin>>n;
int x[2000],y[2000];
for(i=0;i<n;i++)
{
cin>>x[i]>>y[i];
}
for(i=0;i<n;i++)
{
for(int j=0;j<n;j++)
{
int a=distance(x[i],y[i],x[j],y[j]);

for(int k=0;k<n;k++)
{
if(a==distance(x[i],y[i],x[k],y[k]) && a!=0)
{
if( (x[j]-x[i])!=0 && (x[k]-x[i])!=0)
{
if((angle(x[i],y[i],x[j],y[j],x[k],y[k])==-1) )
{

for(int l=0;l<n;l++)
{
if(distance(x[j],y[j],x[l],y[l])==distance(x[k],y[k],x[l],y[l]) && a==distance(x[k],y[k],x[l],y[l]))
{
z=0;
//cout<<z;
//break;
}
}
if(z!=0)
z=1;

}
}
}

}
if(z!=0 && z!=1)
z=2;


}

}
cout<<z;
//getch();
return 0;

}
