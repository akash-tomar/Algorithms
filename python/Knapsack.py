t=int(raw_input())

def knapsack(arr,index,sum,k):
    if index>=len(arr) or sum==0:
        return k
    l1=0
    if k-arr[index]>=0:
        l1=knapsack(arr, index, sum-arr[index],k)
        if l1 == k:
            return k
    l2=knapsack(arr, index+1, sum,k)
    if l2==k:
        return k
    if k-l1<k-l2:
        return  
    else:
        return
for test in range(t):
    n,k=raw_input().split(' ')
    n,k=[int(n),int(k)]
    arr=[int(i) for i in raw_input().split(' ')]
    print knapsack(arr, 0, k,k)