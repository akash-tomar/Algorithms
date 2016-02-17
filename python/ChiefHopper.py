from math import ceil
n=int(raw_input())
height=[int(i) for i in raw_input().split(' ')]
height=[0]+height
print height
x=0
#print height
for i in range(n-1,-1,-1):
    #print(str(i)+" "+str(height[i+1]))
    x= ceil((x+height[i+1])/2)
    #print i
print int(x)
