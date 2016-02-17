#include<iostream.h>
void clockwise(int* A,int size,int* m,int s,int z)
{
        int temp=0;
        for(int j=0;j<z;j++)
        {
            temp=A[0];
            for(int k=0;k<size-1;k++)
            {
                A[k]=A[k+1];

            }
            A[size-1]=temp;
        }

}
void anticlockwise(int* A,int size,int *m,int s,int z)
{
    int temp=0;
    for(int j=0;j<z;j++)
    {
        temp=A[size-1];
        for(int k=(size-1);k>0;k--)
        {
            A[k]=A[k-1];
        }
        A[0]=temp;
    }
}

int main()
{
    int N,M,z;
    cin>>N>>M;
    int A[N];
    for(int i=0;i<N;i++)
    {
        cin>>A[i];
    }
    int m[M][2];
    for(int j=0;j<M;j++)x
    {
        for(int n=0;n<2;n++)
        {
            cin>>m[j][n];
        }
    }
    for(int x=0;x<M;x++)
    {
        if(m[x][0]=='C')
        {
            z=m[x][1]	;
            clockwise(A,N,m,2,z);
        }
        else if(m[x][0]=='A')
        {
            z=m[x][1];
            anticlockwise(A,N,m,2,z);
        }
        else if(m[x][0]=='R')
        cout<<A[(m[x][1])];
    }
}


