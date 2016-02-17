#include <iostream>
#include<cmath>
using namespace std;

int recursion(int number,int degree,long long power)
{
	bool c=true;
	int arr[degree];
	int count=1;
	int trans=pow(10,(degree-1)),temp;
	temp=trans;
	while(c==true)
	{
	    if(temp-power<=0 && temp-power>=(temp-1))
	    {
            c=false;
            arr[]
	    } 
	    temp+=trans;
	    count++;
	    
	    
	}
	
int main()
{
	int t,i,z=10;
	cin>>t;
	bool cond=true;
	int a[36000],b[36000],recorded[36000],degree[36000],ans[36000];
	long long power[36000];
	for(i=0;i<t;i++)
	{
		cin>>a[i]>>b[i];
		power[i]=pow(a[i],b[i]);
	}
	for(i=0;i<t;i++)
	{
		z=10;
		j=1;
		while(cond==true)
		{
			if(z-power[i]>=0)
			{
				cond=false;
				recorded[i]=z;
				degree[i]=j;
				break;
			}
			j++;
			z=pow(z,j);
		}
	}
	
	
	
	for(i=0;i<t;i++)
	{
		ans[i]=recursion(recorded[i],degree[i],power[i]);
	}