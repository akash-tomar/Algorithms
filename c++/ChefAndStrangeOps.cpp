#include<iostream>
#include<stdio.h>
using namespace std;
int main()
{


        int t;
        cin>>t;
		for(int test=0;test<t;test++) {
			int n,x,m;
			scanf("%d",&n);
			scanf("%d",&x);
			scanf("%d",&m);

			long sum=0;
			int* arr=new int[n];
			long ans;
			for(int i=0;i<n;i++) {
				scanf("%d",&arr[i]);
			}


			long* result=new long[x];
            for(int j=0;j<x;j++){
                result[j]=1;
            }
            if(m==1){
            int l=0;
             for(int j=x-1;j>=0;j-- ){
                 sum+=result[l]*arr[j];
                 l++;
            }
                ans=(int) (sum%1000000007);
            }  else {
                for(long j=2;j<=m;j++){
                    for(int a=0;a<x;a++){
                        if(a==0){
                            result[a]=1;
                        }else{
                            result[a]=result[a]+result[a-1];
                        }
                    }
                }
                int l=0;
               for(int j=x-1;j>=0;j-- ){
                    sum+=result[l]*arr[j];
                    l++;
               }
               ans=(int) (sum%1000000007);

            }


			printf("%d",ans);

		}

    return 0;
}


