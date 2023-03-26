import sys
N,Z,M=map(int,input().split())
Obstacles=list(map(int,input().split()))
for K in range(1,N):
    arr=[1+(K*x)%N for x in range(N)]
    for check in arr:
        if check in Obstacles:
            break
        if check==Z:
              print(K)
              sys.exit()