#include<iostream>
#include<sstream>
#include<set>
#include<vector>
#include<list>
#include<algorithm>
#include<math.h>
#define ll long long int
using namespace std;





	ll *arr=new ll[20];
	ll fibonnaciModified(int a,int b,int n) {
		if(n==1) {
			return a;
		}
		if(n==2) {
			return b;
		}

		if(arr[n]!=-1) {
			return arr[n];
		}

		arr[n]= (ll) ( pow ( fibonnaciModified ( a, b, n-1 ) , 2 ) + fibonnaciModified ( a, b, n-2 ) );
		return arr[n];

	}

	int main() {
		ll g=84266613096281243382112;
        cout<<g;
		for(int i=0;i<20;i++) {
			arr[i]=-1;
		}
		//Scanner s =new Scanner(System.in);
        int a,b,n;
        cin>>a>>b>>n;
        cout<<fibonnaciModified(a,b,n);


	}
