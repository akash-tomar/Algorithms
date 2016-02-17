test=int(raw_input())
dict={}
def noOfWays(colStart,colEnd):
    if dict.has_key((colStart,colEnd)):
        return dict[(colStart,colEnd)]
    if colEnd-colStart < 4 and colEnd-colStart > 0:
        return 1
    if colEnd-colStart == 4:
        return 2
    if colStart == colEnd:
        return 0
    
    #vertical log
    n1=noOfWays(colStart+1, colEnd)
    
    #Horizontal log
    n2=noOfWays(colStart+4, colEnd)
    dict[(colStart,colEnd)]=n1+n2
    return n1+n2
            
def primes(n):
    """ Returns  a list of primes < n """
    if n<=2:
        return []
    sieve = [True] * n
    for i in xrange(3,int(n**0.5)+1,2):
        if sieve[i]:
            sieve[i*i::2*i]=[False]*((n-i*i-1)/(2*i)+1)
    return [2] + [i for i in xrange(3,n,2) if sieve[i]]

for i in range(test):
    n=int(raw_input())
    m= noOfWays(0, n)
    print len(primes(m+1))
    
