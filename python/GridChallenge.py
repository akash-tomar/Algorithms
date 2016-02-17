t=int(raw_input())
for test in  range(t):
    n=int(raw_input())
    str=[]
    no=False
    for i in range(n):
        str.append(raw_input())
    for i in range(n):
        str[i]=sorted(str[i])
    for j in range(n):
        prev=str[0][j]
        for i in range(1,n):
            if prev<=str[i][j]:
                prev=str[i][j]
            else:
                print("NO")
                no=True
                break
        if no:
            break
    if not no:
        print("YES")
            