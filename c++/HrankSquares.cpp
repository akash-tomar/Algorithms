    #include<iostream>
    using namespace std;
    int main()
    {
        int t,i;
		int l[1000];
		int b[1000];
		int nos[1000];
		int max=0;
        cin>>t;
		for (i = 0; i < t; i++) {
			cin>>l[i];
			cin>>b[i];

		}
		for(i=0;i<t;i++)
		{
			int n=2;
			while(n<=l[i])
			{
				if(l[i]%n==0)
				{
					if(b[i]%n==0)
					{

						if(max<n){
							max=n;
							nos[i]=((l[i]/n)*(b[i]/n));
						}


					}
				}
				n++;
			}
			cout<<endl<<nos[i];

		}
		return 0;
    }


