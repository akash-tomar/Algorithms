#include<iostream>
#include<sstream>
#include<set>
#include<vector>
#include<list>
#include<algorithm>
#define ll long long int
using namespace std;

string individual_digit(unsigned long n)
{
    string num;
    std::ostringstream oss;
    oss<<n;
    num=oss.str();
    return num;


}


public static string* indexOfLuckyNumber(string* out,string n) {
//		if(str=="") {
//			String[] output=new String[2];
//			output[0]="4";
//			output[1]="7";
//			return output;
//		}
		string *outputSoFar=str;
		string *output=new string[2*outputSoFar.length];
		for(int i=0;i<outputSoFar.length;i++) {
			output[i]="4"+outputSoFar[i];
			if(output[i]==n)
                return output;
		}
		for(int i=0;i<outputSoFar.length;i++) {
			output[outputSoFar.length+i]="7"+outputSoFar[i];
			if(output[i]==n)
                return output;
		}
		return indexOfLuckyNumber(outputSoFar,n);





}




int main()
{

    int n;
    cin>>n;
		if(n==4)
			System.out.println("1");
		else if(n==7)
			System.out.println("2");
		else {
			string str=individual_digit(n);
			string *output=new String[2];
			output[0]="4";
			output[1]="7";
			string[] arr=indexOfLuckyNumber(output,str);
			cout<<arr.length();
		}



    return 0;
}


