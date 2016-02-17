a,b,n = [int(i) for i in raw_input().split(' ')]
arr=[-1]*n
arr[0]=a
arr[1]=b
for i in range(2,n):
    arr[i]=pow(arr[i-1],2)+arr[i-2]
print arr[n-1]
