#include<iostream>
#include<sstream>
#include<set>
#include<vector>
#include<list>
#include<algorithm>
using namespace std;
#define ll long long int


// not working properly

int main()
{
    string str;
    cin>>str;
    for(int i=1;i<=str.length();i++)
		{
			for(int j=0;j<str.length();j++)
			{
				cout<<endl;
				if(i==(str.length()-1))
                {
                    cout<<str;
                    return 0;
                }
				for(int k=0;k<i;k++)
					cout<<(str[ (j+k)%(str.length() ) ]);
			}
		}





    return 0;
}


