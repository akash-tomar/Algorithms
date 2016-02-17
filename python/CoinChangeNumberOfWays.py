n,m = [int(i) for i in raw_input().split(' ')]
coins = [int(i) for i in raw_input().split(' ')]
coins.sort()

dict={}
def CoinChangeRecursive(A,i):
    #print i
    
    if A==0:
        return 1
    if A<0:
        return 0
    if i<0:
        return 0
    if dict.has_key((A,i))!=-1:
        return dict.get((A,i))
    dict[(A,i)]=int(CoinChangeRecursive(A, i-1))+ int(CoinChangeRecursive(A-coins[i],i) )
    return dict[(A,i)]
print CoinChangeRecursive(n,m-1)
    