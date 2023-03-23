result=0
x=int(input())

if x<100:
    result=x
else:
    result+=99
    for i in range(100,x+1):
        a=i//100
        b=(i%100)//10
        c=i%10
        if a-b==b-c:
            result+=1
print(result)