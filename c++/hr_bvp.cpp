#include <iostream>

#include<string>
using namespace std;


int main()
{
    int i;
    char name[100000];
    char arr[100000];
    cin.getline(name,1000);


    for(i=0;i<1000;i++)
    {

       name[i]=tolower(name[i]);

    }

    for(i=0;i<100000;i++)
    {
        if(isalpha(name[i]) || name[i]==' ')
        {
            arr[i]=name[i];
        }
        else if(!(isalpha(name[i])))
        {
            arr[i]='%';
        }
    }

    cout<<"#";
    for(i=0;i<arr[i]!='\0';i++)
    {
        if(arr[i]==' ')
        {
            cout<<" #";

        }
        else if(arr[i]=='%')
        cout<<"";
        else
        cout<<arr[i];

    }
    return 0;
}
