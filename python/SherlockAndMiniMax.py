from sys import maxint
n=int(raw_input())
arr=[int(i) for i in raw_input().split(' ')]
p,q=[int(i) for i in raw_input().split(' ')]
ans=[]
arr.sort()
maxx=0
for i in range(p,q+1,1):
    m=i
    minn=maxint
    for elem in arr:
        temp=abs(m-elem)
        minn=min(temp,minn)
    if minn>maxx:
        maxx=minn
        ans=[m,]
    elif minn==maxx:
        ans.append(m)
print min(ans)