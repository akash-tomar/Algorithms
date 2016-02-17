//multisets are similar to sets except that we can insert duplicate elements in it.

// set.cpp by Bill Weinman <http://bw.org/>
#include <iostream>
#include <set>

using namespace std;


int min(int *arr)
{
    int x=arr[o];
    for(int i=1;i<n;i++)
    {
        if(x<arr[i])
            min=arr[i];
    }
    return min;
}



int main( int argc, char ** argv ) {
int n,k,i,x;
cin>>n;
cin>>k;
int arr = new int[n];
for(i=0;i<n;i++)
{
    cin>>arr[i];
}



/*multiset<int> strset ;
for(i=0;i<n;i++)
{
    cin>>x;
    strset.insert(x);
}*/



return 0;
}
