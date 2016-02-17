t=int(raw_input())

dict={}

def maxProfit(arr,index,stocks,profits):
    if index==(len(arr)-1):
        p_sell=profits+stocks*arr[index];
        p_nothing=profits;
        dict[(index,stocks,profits)] = max(p_sell, p_nothing);
        return dict.get((index,stocks,profits))
    
    if dict.has_key((index,stocks,profits)):
        return dict.get((index,stocks,profits))    
    s=stocks+1
    p=profits-arr[index]    
    p_buy = maxProfit(arr, index+1,s,p)
    
    s=0
    p=profits+stocks*arr[index]
    p_sell=maxProfit(arr, index+1,s,p )
    
    p_nothing=maxProfit(arr, index+1, stocks, profits)
    
    dict[(index,stocks,profits)]=max(p_buy,p_sell, p_nothing)
    return dict.get((index,stocks,profits))
        
for test in range(t):
    n=int(raw_input())
    dict={}
    arr=[int(i) for i in raw_input().split(' ')]
    #print arr
    print maxProfit(arr, 0, 0, 0)
    

