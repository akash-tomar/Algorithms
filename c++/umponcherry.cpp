#include<iostream>
#include<sstream>
#include<set>
#include<vector>
#include<list>
#include<algorithm>
#define ll long long int
using namespace std;





int main()
{
    int t;
    cin>>t;
    for(int i=0;i<t;i++) {

        ll x,y;
        ll pos=0;
        ll var=1;
        ll counts=0;
        cin>>x>>y;
        //int *cherry=new int[10000];
        vector<int> cherry;
        bool found=false;
        while(true) {

            pos+=x;
            counts++;
            cherry.push_back((pos+y*var));
            //cherry[pos+y*var]=1;
           // auto it=cherry.begin();
            //it=cherry.find(pos+y*var);
            for(auto it=cherry.begin();it!=cherry.end();it++) {
                if(*it==(pos+y*var)){
                    cout<<counts<<endl;
                    found=true;
                    break;
                }
                if(found)
                    break;

            }

//            if(it!=cherry.end()){
//                cout<<counts<<endl;
//                break;
//            }
            var++;
        }


    }





    return 0;
}


