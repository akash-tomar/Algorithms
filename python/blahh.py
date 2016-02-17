w,h,d,n=[int(i) for i in raw_input().split(' ')]
list=[]
for i in range(n):
    list.append([int(i) for i in raw_input().split(' ')])
left=[0,d]
right=[2*d,d]
bottom=[d,0]
