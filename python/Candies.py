#input
n=int(raw_input())
rating=[]
for i in range(n):
    rating.append(raw_input())

candies=[1]*n

def Merge(begin,mid,end):
    if rating[begin]==rating[mid] and rating[mid]==rating[end]:
        if candies[begin]==candies[end]:
            candies[mid]=candies[begin]
            '''if candies[mid]<=candies[end]:
                candies[mid]=candies[begin]
            else:
                diff=candies[mid]-candies[end]
                for i in range(0,mid):
                    candies[i]+=diff
                for i in range(mid+1,n):
                    candies[i]+=diff'''
        elif candies[begin]>candies[end]:
            pass
            
            
        

def divConq(begin,end):
    if begin>=end:
        return 
    mid=(begin+end)/2
    divConq(begin, mid-1)
    divConq(mid+1, end)
    Merge(begin,mid,end)