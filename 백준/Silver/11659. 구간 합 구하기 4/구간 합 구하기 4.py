n, m = map(int, input().split())
# 배열 생성
s = [0]*(n+1)
result = []
arr = list(map(int, input().split()))


for i in range(1, n+1):
    s[i] = s[i-1]+arr[i-1]


for p in range(m):
    i, j = map(int, input().split())
    result.append(s[j]-s[i-1])

print(*result)

#     for k in range(i-1, j):
#         result[p] += arr[k]
# for i in range(len(result)):
#     print(result[i])
