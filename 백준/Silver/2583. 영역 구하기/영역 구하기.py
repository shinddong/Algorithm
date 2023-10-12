# 입력 받아서
# N*M짜리 0으로 된 판 만들고
# K만큼 반복문 돌면서 해당하는 칸을 1로 바꿔
# 그다음 bfs
from collections import deque
m, n, k = map(int, input().split())
graph = [[0 for _ in range(n)] for _ in range(m)]

for _ in range(k):
    x1, y1, x2, y2 = map(int, input().split())
    for a in range(y1, y2):
        for b in range(x1, x2):
            graph[a][b] = 1
dx = [0, 0, -1, 1]
dy = [-1, 1, 0, 0]

result = []


def bfs(x, y):
    cnt = 1
    q = deque()
    q.append((x, y))
    graph[x][y] = 1
    while q:
        y, x = q.popleft()
        for i in range(4):
            nx = x+dx[i]
            ny = y+dy[i]
            if 0 <= nx < n and 0 <= ny < m:
                if graph[ny][nx] == 1:
                    continue
                elif graph[ny][nx] == 0:
                    cnt += 1
                    graph[ny][nx] = 1
                    q.append((ny, nx))
    result.append(cnt)


for i in range(m):
    for j in range(n):
        if graph[i][j] == 0:
            bfs(i, j)

print(len(result))
print(*(sorted(result)))
