import sys
n,m = raw_input().strip().split(' ')
n,m = [int(n),int(m)]
arr = map(int,raw_input().strip().split(' '))

dicts={}
for i in arr:
    dicts[(i)]=True
    
maxx=0
for i in range(n):
    j=i
    temp1=sys.maxint
    temp2=sys.maxint
    while(j>=0):
        if dicts.has_key(j):
            temp1=abs(i-j)
            break;
        j-=1
    j=i
    while j<n:
        if dicts.has_key(j):
            temp2=abs(i-j)
            break;
        j+=1
    maxx=max(min(temp1,temp2),maxx)
print maxx
        