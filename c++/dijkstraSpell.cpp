#include<iostream>
#include<fstream>
#include<sstream>
#include<set>
#include<vector>
#include<list>
#include<algorithm>
#define ll long long int
using namespace std;


string retChar(char ch1,char ch2) {
    if(ch1=='1') {
        if(ch2=='1')
            return "1";
        else if(ch2=='i')
            return "i";
        else if(ch2=='j')
            return "j";
        else if(ch2=='k')
            return "k";
    }
    else if(ch1=='i') {
        if(ch2=='1')
            return "i";
        else if(ch2=='i')
            return "-1";
        else if(ch2=='j')
            return "k";
        else if(ch2=='k')
            return "-j";
    }
    else if(ch1=='j') {
        if(ch2=='1')
            return "j";
        else if(ch2=='i')
            return "-k";
        else if(ch2=='j')
            return "-1";
        else if(ch2=='k')
            return "i";
    }
    else if(ch1=='k') {
        if(ch2=='1')
            return "k";
        else if(ch2=='i')
            return "j";
        else if(ch2=='j')
            return "-i";
        else if(ch2=='k')
            return "-1";
    }


}


int main()
{
    freopen("C:\\Users\\Rakesh\\Documents\\codeblocks\\C-small-attempt1.in","r",stdin);
    freopen("output.txt","w",stdout);
    int t;
    cin>>t;

    //cout<<"1*i : "<<retChar('1','i')<<endl;

    //ofstream myfile;
   //myfile.open ("google.txt");
    for(int testCase=1;testCase<=t;testCase++) {

        ll l,x;
        cin>>l>>x;
        char *arr=new char[l*x];
        char *temp=new char[l];
        int i;
        for(i=0;i<l;i++) {
            cin>>arr[i];
            temp[i]=arr[i];
        }
        int pos=0;
        for(int i=l;i<l*x;i++) {
           arr[i]=temp[pos];
           pos++;
           if(pos==l)
                pos=0;
        }

//        for(i=0;arr[i]!=NULL;i++)
//            cout<<arr[i];




//        string temp=arr;
        bool first=true;
        //int i;
//        for(i=0;i<x;i++) {
//            if(first) {
//                first=false;
//            }else {
//                arr+=temp;
//            }
//        }
        bool istr=false,jstr=false,kstr=false;
        char prevChar='1';
        int prevSign=1;
        //cout<<arr<<endl;
        //first=true;
        for(i=0;arr[i]!=NULL;i++) {
                string str=retChar(prevChar,arr[i]);
//                cout<<"returned string for "<<prevChar<<" & "<<arr[i]<<" : "<<str<<endl;
                if(str.size()==2) {
                    prevSign=prevSign*-1;
                    prevChar=str[1];
                }
                else {
                    prevChar=str[0];
                }

            if(prevChar=='i' && prevSign==1 && istr==false) {
                if(jstr==false && kstr==false ) {
                    istr=true;
                    prevChar='1';
                    prevSign=1;
                }
            } else if(prevChar=='j' && prevSign==1 && jstr==false) {
                if(istr==true && kstr==false) {
                    jstr=true;
                    prevChar='1';
                    prevSign=1;
                }
            } else if(prevChar=='k' && prevSign==1) {
                if(istr==true && jstr==true) {
                    kstr=true;
                    break;
                }
            }

        }


//        if(istr)
//            cout<<"istr true"<<endl;
//            else
//                cout<<"istr not true"<<endl;
//        if(jstr)
//            cout<<"jstr true"<<endl;
//            else
//                cout<<"jstr not true"<<endl;
//        if(kstr)
//            cout<<"kstr true"<<endl;
//            else
//                cout<<"kstr not true"<<endl;


       // cout<<"i   &&    l  : "<<i<<" "<<l<<endl;
        if(istr==true && jstr==true && kstr==true) {
            if(i+1==l*x) {
                cout<<"Case #"<<testCase<<": "<<"YES"<<endl;
            }
            else
                cout<<"Case #"<<testCase<<": "<<"NO"<<endl;
        }
        else
            cout<<"Case #"<<testCase<<": "<<"NO"<<endl;


    }
//    myfile.close();





    return 0;
}


