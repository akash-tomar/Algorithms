n,k=[int(i) for i in raw_input().split(' ')]
price=[]
price=[int(i) for i in raw_input().split(' ')]
price=sorted(price)
count=0
for item in price:
    if item<k:
       k-=item
       count+=1
print(count) 