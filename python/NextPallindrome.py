def isPallindrome(n):
    n=str(n)
    rev=reversed(n)
    if list(n) == list(rev):
        return True
    else:
        return False
def main():
    t=input()
    for test in range(t):
        n=input()
        while(True):
            n=n+1
            if isPallindrome(n):
                break
        print(n)
                
            
if(__name__=="__main__"):
    main()
            