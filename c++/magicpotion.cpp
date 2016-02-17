#include<iostream>
using namespace std;
int main()
{
    int t,i=0,j=0,k=0,l=0,m=0,max[1001],z=0,y=0;
    cin>>t;
    int R[1001],G[1001],B[1001],M[1001];
    unsigned int r[1001][101],g[1001][101],b[1001][101];
    for(i=0;i<t;i++)
    {
        cin>>R[i]>>G[i]>>B[i]>>M[i];
        for(j=0;j<R[i];j++)
            cin>>r[i][j];
        for(k=0;k<G[i];k++)
            cin>>g[i][k];
        for(l=0;l<B[i];l++)
            cin>>b[i][l];
    }

    for(i=0;i<t;i++)
    {
        for(m=0;m<M[i];m++)
        {
            max[i]=0;
            for(j=0;j<R[i];j++)
            {
                if(max[i]<r[i][j])
                {
                    max[i]=r[i][j];
                    z=1;
                    y=R[i];
                }
            }

            for(k=0;k<G[i];k++)
            {
                if(max[i]<g[i][k])
                {
                    max[i]=g[i][k];
                    z=2;
                    y=G[i];
                }
            }

            for(l=0;l<B[i];l++)
            {
                if(max[i]<b[i][l])
                {
                    max[i]=b[i][l];
                    z=3;
                    y=B[i];
                }
            }

            if(z==1)
            {
                for(j=0;j<y;j++)
                {
                    r[i][j]/=2;
                }
            }

            if(z==2)
            {
                for(j=0;j<y;j++)
                {
                    g[i][j]/=2;
                }
            }

            if(z==1)
            {
                for(j=0;j<y;j++)
                {
                    b[i][j]/=2;
                }
            }


        }

    }
    for(i=0;i<t;i++)
    {
        max[i]=0;
        for(j=0;j<R[i];j++)
            {
                if(max[i]<r[i][j])
                {
                    max[i]=r[i][j];
                    //z=1;
                    //y=R[i];
                }
            }

            for(k=0;k<G[i];k++)
            {
                if(max[i]<g[i][k])
                {
                    max[i]=g[i][k];
                    //z=2;
                    //y=G[i];
                }
            }

            for(l=0;l<B[i];l++)
            {
                if(max[i]<b[i][l])
                {
                    max[i]=b[i][l];
                    //z=3;
                    //y=B[i];
                }
            }
    }
    for(i=0;i<t;i++)
    cout<<max[i]<<endl;

    return 0;


}
