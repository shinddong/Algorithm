weights=[]
N=int(input())
for i in range (0,N):
    w,h=map(int,input().split())
    weights.append((w,h))
for i in weights:
    rank=1
    for j in weights:
        if i[0]<j[0] and i[1]<j[1]:
            rank+=1  
    print(rank, end= " ")  