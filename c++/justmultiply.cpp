#include<iostream>
#include<algorithm>
#include<cmath>
#include<sstream>
using namespace std;
string individual_digit(int n)
{
    string num;
    std::ostringstream oss;
    oss<<n;
    num=oss.str();
    return num;


}
int main()
{
    int t,i;
    cin>>t;
    for(i=0;i<t;i++)
    {
        long prod=1;
        int m;
        string s;
        cin>>m;
        cin>>s;
    string::iterator search_it;
    do{
    string match = "**";
	search_it = search(s.begin(), s.end(), match.begin(), match.end());
	if(search_it != s.end()) {
		int found=size_t( search_it - s.begin() );
		//cout << "search term found at position " << size_t( search_it - s.begin() )+1 << endl;
		s.erase(found,2);
		s.insert(found,"^");
	}

    }while(search_it!=s.end());
    for(auto it3=s.end();it3!=s.begin();it3-=2)
    {
    do
    {
      string match = "^";
	  search_it = search(s.end(), s.begin(), match.begin(), match.end());
	  if(search_it != s.begin())
      {
		int found1=size_t( search_it - s.begin() );
		//cout << "search term found at position " << size_t( search_it - s.begin() )+1 << endl;
		s.erase(found1,1);
		string prodd=individual_digit(pow( *(search_it-1),*(search_it+1)));
		s.insert(found1,prodd );
	  }

    }while(search_it!=s.begin());













        /*char ch1,ch2,ch3;
        ch1= *it3;
        ch2= *(it3-1);
        ch3= *(it3-2);
        if(ch2=='^')
            s.erase(&ch1,3);
            s.insert((it3-3),pow(ch3,ch1));*/

    }
    for(auto it4=s.end();it4!=s.begin();it4-=2)
    {

    do{
    string match = "*";
	search_it = search(s.begin(), s.begin(), match.begin(), match.end());
	if(search_it != s.begin()) {
		int found2=size_t( search_it - s.begin() );
		//cout << "search term found at position " << size_t( search_it - s.begin() )+1 << endl;
		prod*= ((*(search_it-1))*(*(search_it+1));
	}

    }while(search_it!=s.begin());

    }
    cout<<prod%m<<endl;

    }
}
