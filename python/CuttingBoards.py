test=int(raw_input())
for t in range(test):
    m,n=[int(i) for i in raw_input().split(' ')]
    cost_y=[int(i) for i in raw_input().split(' ')]
    cost_x=[int(i) for i in raw_input().split(' ')]
    
    
    priority=[]
    for i,cost in enumerate(cost_y):
        priority.append((cost,'y',i+1))
    for i,cost in enumerate(cost_x):
        priority.append((cost,'x',i+1))
        
    
    priority=sorted(priority,key = lambda z:z[0])
    #print(priority)
    cuts_in_x=1
    cuts_in_y=1
    cost=0
    while len(priority)!=0:
        el=priority[(len(priority)-1)]
        del priority[(len(priority)-1)]
        #print el
        if el[1]=='x':
            cuts_in_x+=1
            cost+=cuts_in_y*int(el[0])
            cost=cost%(pow(10, 9)+7)
        elif el[1]=='y':
            cuts_in_y+=1
            cost+=cuts_in_x*int(el[0])
            cost=cost%(pow(10, 9)+7)
            
    print cost%(pow(10, 9)+7)
    
    
    