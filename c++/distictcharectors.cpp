#include<iostream>
using namespace std;
int main()
{
    int t1,i1,j1,k1;
    bool a=false;
    bool b=false;
    bool c=false;
    bool d=false;
    bool e=false;
    bool f=false;
    bool g=false;
    bool h=false;
    bool i=false;
    bool j=false;
    bool k=false;
    bool l=false;
    bool m=false;
    bool n=false;
    bool o=false;
    bool p=false;
    bool q=false;
    bool r=false;
    bool s=false;
    bool t=false;
    bool u=false;
    bool v=false;
    bool w=false;
    bool x=false;
    bool y=false;
    bool z=false;
    //bool value[26];
    cin>>t;
    int count[10];
    char str[10][100000];
    for(i1=0;i1<t1;i1++)
    {
        cin>>str[i1];
        //count[i1]=0;
    }

    for(i1=0;i1<t1;i1++)
    {
        a=false;b=false;c=false;d=false;e=false;f=false;g=false;h=false;i=false;j=false;k=false;l=false;m=false;n=false;o=false;p=false;q=false;r=false;s=false;t=false;u=false;v=false;w=false;x=false;y=false;z=false;
        /*for(k=0;k<26;k++)
        {
            value[k]=false;
        }*/

        for(j1=0;str[i1][j1]!='\0';j1++)
        {
            if(str[i1][j1]=='a')
            {
                if(a==false)
                {
                    count[i1]++;
                    a=true;
                }
            }


            else
            if(str[i1][j1]=='b')
            {
                if(b==false)
                {
                    count[i1]++;
                    b=true;
                }
            }


            else
            if(str[i1][j1]=='c')
            {
                if(c==false)
                {
                    count[i1]++;
                    c=true;
                }
            }

            else
            if(str[i1][j1]=='d')
            {
                if(d==false)
                {
                    count[i1]++;
                    d=true;
                }
            }

            else
            if(str[i1][j1]=='e')
            {
                if(e==false)
                {
                    count[i1]++;
                    e=true;
                }
            }

            else
            if(str[i1][j1]=='f')
            {
                if(f==false)
                {
                    count[i1]++;
                    f=true;
                }
            }

            else
            if(str[i1][j1]=='g')
            {
                if(g==false)
                {
                    count[i1]++;
                    g=true;
                }
            }

            else
            if(str[i1][j1]=='h')
            {
                if(h==false)
                {
                    count[i1]++;
                    h=true;
                }
            }

            else
            if(str[i1][j1]=='i')
            {
                if(i==false)
                {
                    count[i1]++;
                    i=true;
                }
            }

            else
            if(str[i1][j1]=='j')
            {
                if(j==false)
                {
                    count[i1]++;
                    j=true;
                }
            }

            else
            if(str[i1][j1]=='k')
            {
                if(k==false)
                {
                    count[i1]++;
                    k=true;
                }
            }

            else
            if(str[i1][j1]=='l')
            {
                if(l==false)
                {
                    count[i1]++;
                    l=true;
                }
            }

            else
            if(str[i1][j1]=='m')
            {
                if(m==false)
                {
                    count[i1]++;
                    m=true;
                }
            }

            else
            if(str[i1][j1]=='n')
            {
                if(n==false)
                {
                    count[i1]++;
                    n=true;
                }
            }

            else
            if(str[i1][j1]=='o')
            {
                if(o==false)
                {
                    count[i1]++;
                    o=true;
                }
            }

            else
            if(str[i1][j1]=='p')
            {
                if(p==false)
                {
                    count[i1]++;
                    p=true;
                }
            }

            else
            if(str[i1][j1]=='q')
            {
                if(q==false)
                {
                    count[i1]++;
                    q=true;
                }
            }

            else
            if(str[i1][j1]=='r')
            {
                if(r==false)
                {
                    count[i1]++;
                    r=true;
                }
            }

            else
            if(str[i1][j1]=='s')
            {
                if(s==false)
                {
                    count[i1]++;
                    s=true;
                }
            }

            else
            if(str[i1][j1]=='t')
            {
                if(t==false)
                {
                    count[i1]++;
                    t=true;
                }
            }

            else
            if(str[i1][j1]=='u')
            {
                if(u==false)
                {
                    count[i1]++;
                    u=true;
                }
            }

            else
            if(str[i1][j1]=='v')
            {
                if(v==false)
                {
                    count[i1]++;
                    v=true;
                }
            }

            else
            if(str[i1][j1]=='w')
            {
                if(w==false)
                {
                    count[i1]++;
                    w=true;
                }
            }

            else
            if(str[i1][j1]=='x')
            {
                if(x==false)
                {
                    count[i1]++;
                    x=true;
                }
            }

            else
            if(str[i1][j1]=='y')
            {
                if(y==false)
                {
                    count[i1]++;
                    y=true;
                }
            }

            else
            if(str[i1][j1]=='z')
            {
                if(z==false)
                {
                    count[i1]++;
                    z=true;
                }
            }

        }
    }
    for(i1=0;i1<t1;i1++)
    {
        cout<<count[i1]<<endl;
    }
}
