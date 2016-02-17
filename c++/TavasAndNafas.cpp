#include<iostream>
#include<sstream>
#include<set>
#include<vector>
#include<list>
#include<algorithm>
#define ll long long int
using namespace std;

string retNumber(int n) {

    if(n==1)
        return "one";
    else if(n==2)
        return "two";
    else if(n==3)
        return "three";
    else if(n==4)
        return "four";
    else if(n==5)
        return "five";
    else if(n==6)
        return "six";
    else if(n==7)
        return "seven";
    else if(n==8)
        return "eight";
    else if(n==9)
        return "nine";
    else if(n==0)
        return "";
    else if(n==10)
        return "ten";
    else if(n==11)
        return "eleven";
    else if(n==12)
        return "twelve";
    else if(n==13)
        return "thirteen";
    else if(n==14)
        return "fourteen";
    else if(n==15)
        return "fifteen";
    else if(n==16)
        return "sixteen";
    else if(n==17)
        return "seventeen";
    else if(n==18)
        return "eighteen";
    else if(n==19)
        return "nineteen";

}
string retFirst(int n) {
    if(n==2)
        return "twenty";
    else if(n==3)
        return "thirty";
    else if(n==4)
        return "forty";
    else if(n==5)
        return "fifty";
    else if(n==6)
        return "sixty";
    else if(n==7)
        return "seventy";
    else if(n==8)
        return "eighty";
    else if(n==9)
        return "ninety";
    else if(n==10)
        return "hundred";


}

string fun(int n) {
    string str;
    if(n>=20) {
        int first=n/10;
        string firstStr=retFirst(first);
        string str1=retNumber(n%10);

        if(n%10==0) {
            str=firstStr+str1;
        } else {
            str=firstStr+"-"+str1;
        }


    }
    else if(n>=1 and n<10)
    {
        str=retNumber(n);

    }
    else if(n>=10 and n<20) {
        str=retNumber(n);
    }
    return str;

}



int main()
{
    int n;
    cin>>n;
    if(n==0)
        cout<<"zero";
    else{
        string str=fun(n);
        cout<<str<<endl;
    }




    return 0;
}


