from sys import setrecursionlimit
test=int(raw_input())
setrecursionlimit(10000)
dict={}
def maxWays(gridDimension,gridPos,m):
    if m==0:
        return 1
    ways=0
    if dict.has_key((''.join(str(x) for x in gridPos),str(m))):
        return dict[(''.join(str(x) for x in gridPos),str(m))]
    for i in range(len(gridPos)):
        pos=gridPos[i]
        if pos+1<=gridDimension[i] and pos+1 > 0:
            temp=[]
            temp=[]+gridPos
            temp[i]+=1
            ways+=maxWays(gridDimension, temp,m-1)
            ways%=1000000007
        if pos-1<=gridDimension[i] and pos-1 > 0:
            temp=[]
            temp=[]+gridPos
            temp[i]-=1
            ways+=maxWays(gridDimension, temp,m-1)
            ways%=1000000007
    dict[(''.join(str(x) for x in gridPos),str(m))]=(ways%1000000007)
    return (ways%1000000007)
        
for t in range(test):
    n,m=raw_input().split(' ')
    n,m=[int(n),int(m)]
    dict={}
    currentPos=[int(i) for i in raw_input().split(' ')]
    gridDimension=[int(i) for i in raw_input().split(' ')]
    
    print maxWays(gridDimension, currentPos,m)
    
    