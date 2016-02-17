x,y=raw_input().split(' ')
x,y=[int(x),int(y)]
arr=[]
arr = [[i for i in raw_input()] for i in range(x)]
dict={}

# pre processing down means how many moves can we go down without getting a marsh.
down=[[0 for i in range(len(arr[0]))] for i in range(len(arr))]
for j in range(len(arr[0])):
    count=0
    for i in range(len(arr)-1,-1,-1):
        if arr[i][j]=='.':
            down[i][j]=count
            count+=1
        else:
            down[i][j]=-1
            count=0
right=[[0 for i in range(len(arr[0]))] for i in range(len(arr))]
for i in range(len(arr)):
    count=0
    for j in range(len(arr[i])-1,-1,-1):
        if arr[i][j]=='.':
            right[i][j]=count
            count+=1
        else:
            right[i][j]=-1
            count=0

def maxPerimeter(leftX,upperY,rightX,bottomY):
    if dict.has_key((leftX,upperY,rightX,bottomY)):
        return dict[(leftX,upperY,rightX,bottomY)]
    if leftX>=y or upperY>=x or rightX<0 or bottomY<0:
        return -1
    
    if leftX==rightX or upperY==bottomY:
        return -1
    
    p=0
    
    #upper row
    if right[upperY][leftX]>=rightX-leftX:
        p+=rightX-leftX
    else:
        p=-1
    
    #right column
    if p!=-1:
        if down[upperY][rightX]>=bottomY-upperY:
            p+=(bottomY-(upperY))
        else:
            p=-1
    
    #bottom row
    if p!=-1:
        if right[bottomY][leftX]>=rightX-leftX:
            p+=(rightX)-leftX
        else:
            p=-1
        
    #left column
    if p!=-1:
        if down[upperY][leftX]>=bottomY-upperY:
            p+=(bottomY)-(upperY)
        else:
            p=-1
    
    if p==-1:
        p1=maxPerimeter(leftX+1, upperY, rightX, bottomY)
        p2=maxPerimeter(leftX, upperY+1, rightX, bottomY)
        p3=maxPerimeter(leftX, upperY, rightX-1, bottomY)
        p4=maxPerimeter(leftX, upperY, rightX, bottomY-1)
        p=max(p1,p2,p3,p4)
    dict[(leftX,upperY,rightX,bottomY)]=p
    return p


            

p= maxPerimeter(0, 0, y-1, x-1)
if p==-1:
    print "impossible"
else:
    print p