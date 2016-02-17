
t=int(raw_input())
for test in range(t):
    n,x,m=[int(i) for i in raw_input().split(' ')]
    arr=[int(i) for i in raw_input().split(' ')]
    #print arr
    for j in range(m):
        for i in range(1,x):
            arr[i]=arr[i]+arr[i-1]
    print arr[x-1]