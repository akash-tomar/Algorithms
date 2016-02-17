#include<iostream>
#include<vector>
#define max 50
using namespace std;
int main()
{
    /*string s01,s02;
    int i;
    cin>>s01>>s02;*/
    int n,i;
    cin>>n;
    vector<string> comb;//=new vector[n];
    char s1[3][n];
    char s2[3][n];
    char s3[3][n];
    for(i=0;i<n;i++)
    {
        cin>>s1[i]>>s2[i]>>s3[i];
    }
    for(i=0;i<n;i++)
    {
        cout<<s1[i]<<s2[i]<<s3[i];
    }

}
