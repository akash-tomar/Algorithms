t=int(raw_input())
for test in range(t):
    n=int(raw_input())
    arr=[int(i) for i in raw_input().split(' ')]
    
    non_contig_sum=0
    
    
    best_sum=0
    best_start_index=-1
    best_end_index=-1
    
    current_sum=0
    current_index=-1
    negative=False
    for i in range(len(arr)):
        if arr[i]>=0:
            break
        if i==len(arr)-1:
            print max(arr),max(arr)
            negative=True
            break
    if negative:
        continue
    for i in xrange(n):
        if arr[i]>0:
            non_contig_sum+=arr[i]
        val=current_sum+arr[i]
        if val>0:
            if current_sum==0:
                current_index=i
            current_sum=val
        else:
            current_sum=0
        
        if current_sum>best_sum:
            best_sum=current_sum
            best_start_index=current_index
            best_end_index=i
    #for i in range(best_start_index,best_end_index+1):
    print best_sum,non_contig_sum   
