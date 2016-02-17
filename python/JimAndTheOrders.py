n = int(raw_input())
list=[]
for i in range(n):
    list.append(raw_input().split(' '))
ans=[]
for i,l in enumerate(list):
    ans.append((int(l[0])+int(l[1]),i+1))
list=sorted(ans,key = lambda z:z[0])
for l in list:
    print l[1],
