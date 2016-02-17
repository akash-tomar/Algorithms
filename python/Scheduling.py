n=int(raw_input('Enter the number of processes :'))
name=[int(i) for i in raw_input('Enter the name :').split(' ')]
time=[int(i) for i in raw_input('Enter the time :').split(' ')]
priority=[int(i) for i in raw_input('Enter the priority :').split(' ')]
list=[]
for i in range(n):
    list.append( (name[i],time[i],priority[i]) )
list.sort(key=lambda z: z[2])
t=0
print "Process Number" +" "+"Started at"+" "+"Ended at"
for i in range(n):
    print list[i][0],t,t+list[i][1]
    t=t+list[i][1]