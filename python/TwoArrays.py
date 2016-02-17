t =int(raw_input())
for test in range(t):
    n,k=[int(i) for i in raw_input().split(' ')]
    arr1=[int(i) for i in raw_input().split(' ')]
    arr2=[int(i) for i in raw_input().split(' ')]
    no=False;
    arr1=sorted(arr1)
    arr2=sorted(arr2)
    arr2.reverse()
    for i in range(n):
        if not arr1[i]+arr2[i]>=k:
            print "NO"
            no=True
            break;
    if not no:
        print "YES"
    