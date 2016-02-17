n,m=raw_input().split(' ')
n,m=[int(n),int(m)]
A=[int(i) for i in raw_input().split(' ')]
B=[int(i) for i in raw_input().split(' ')]
#print A,B
dict={}
def LCS(i,j):
    if i<0 or j<0:
        return []
    if dict.has_key((i,j)):
        return dict[(i,j)]
    ans=[]
    if A[i]==B[j]:
        ans.append(A[i])
        temp=LCS(i-1, j-1)
        ans=temp+ans
    else:
        temp1=LCS(i-1, j)
        temp2=LCS(i,j-1)
        if len(temp1) > len(temp2):
            ans=temp1+ans
        else:
            ans=temp2+ans
    dict[(i,j)]=ans
    return ans

    
        
ans= LCS(len(A)-1, len(B)-1)
for i in ans:
    print i,
    

