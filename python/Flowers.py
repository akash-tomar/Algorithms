n,k = [int(i) for i in raw_input().split(' ')]
arr = [int(i) for i in raw_input().split(' ')]
arr.sort()
summ=0
for i in range(len(arr)):
        summ+=arr[i]
        del arr[i]
if k>=n:
    print summ
    return
n=n-k
while(True):
    
