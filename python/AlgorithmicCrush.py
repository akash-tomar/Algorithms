n,m=[int(i) for i in raw_input().split(' ')]
list=[]
for i in range(m):
    list.append([int(j) for j in raw_input().split(' ')])
arr=[0]*n
print("yee")
for l in list:
    for i in range(l[0]-1,l[1],1):
        arr[i]+=l[2]
print max(arr)
    