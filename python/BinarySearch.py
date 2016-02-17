key=int(raw_input())
n=int(raw_input())
arr=[int(i) for i in raw_input().split(' ')]

def binSearch(begin,end):
    if begin>end:
        return -1
    mid=(begin+end)/2
    if arr[mid]==key:
        return mid
    if key>arr[mid]:
        return binSearch(mid+1, end)
    else:
        return binSearch(begin, mid-1)
print binSearch(0, len(arr))