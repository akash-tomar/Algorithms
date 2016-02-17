#include<iostream>
using namespace std;
int main()
{
    unsigned int m,n,i,j,idi,attri,vali,priorityi;
    unsigned int id[10000],attr[10000],val[10000],priority[10000],ID[10000],ATTR[10000];

    cin>>m>>n;
    for(i=1;i<=m;i++)
    {
        cin>>idi>>attri>>vali>>priorityi;
        if(  ((id[idi]==idi)||(id[idi]==0)) && ((attr[idi]==attri)||(attr[idi]==0)) && ((priority[idi]<=priorityi)||priority[idi]==0))
        {
           id[idi]=idi;
           attr[idi]=attri;
           val[idi]=vali;
           priority[idi]=priorityi;
        }
    }
    for(i=1;i<=n;i++)
    {
        cin>>ID[i]>>ATTR[i];
    }
    for(i=1;i<=n;i++)
    {


            if(ID[i]==id[ ID[i] ] && ATTR[i]==attr[ ID[i] ])
            {
                cout<<val[ ID[i] ]<<endl;
            }

    }

    return 0;
}
