t=int(raw_input())

def maxIndex(arr,index):
    maxx=index
    for i in range(index,len(arr)):
        if arr[i]>arr[maxx]:
            maxx=i
    return maxx

for test in range(t):
    n=int(raw_input())
    arr=[int(i) for i in raw_input().split(' ')]
    index=0
    prev=0
    profit=0
    while(True):
        i=maxIndex(arr, index)
        if i < len(arr):
            for j in range(prev,i):
                profit-=arr[j]
            profit+=(i-prev)*arr[i]
            prev=i+1
            index=i+1
        else:
            break
    print profit