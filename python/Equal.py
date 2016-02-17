from sys import maxint
t=int(raw_input())

def maxOps(arr,count):
    if len(arr)==0:
        return 0
    temp=arr[0]
    equal=True
    for i in range(1,len(arr)):
        if arr[i]!=temp:
            equal=False
            break
    if equal:
        return count
    min=maxint
    for i in range(len(arr)):
        onearr=[]+arr
        twoarr=[]+arr
        fivearr=[]+arr
        for j in range(len(arr)):
            if j!=i:
                onearr[j]=arr[j]+1
                twoarr[j]=arr[j]+2
                fivearr[j]=arr[j]+5
            else:
                onearr[j]=arr[j]
                twoarr[j]=arr[j]
                fivearr[j]=arr[j]
        one=maxOps(onearr,count+1)
        two=maxOps(twoarr,count+1)
        five=maxOps(fivearr,count+1)
        min=min(one,two,five,min)
    return min
    
        
for test in range(t):
    n=int(raw_input())
    arr=[int(i) for i in raw_input().split(' ')]
    print maxOps(arr, 0)