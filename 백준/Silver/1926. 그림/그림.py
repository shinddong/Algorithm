from collections import deque
dx = [0, 0, -1, 1]
dy = [-1, 1, 0, 0]
n, m = map(int, input().split())
result = []
graph = [[0 for j in range(m)] for i in range(n)]

for i in range(n):
    graph[i] = list(map(int, input().split()))


def bfs(x, y):
    cnt = 1
    q = deque()

    q.append((x, y))
    graph[x][y] = 0
    while q:
        x, y = q.popleft()
        for i in range(4):
            nx = x+dx[i]
            ny = y+dy[i]
            if nx < 0 or nx >= n or ny < 0 or ny >= m:
                continue

            if graph[nx][ny] == 1:
                graph[nx][ny] = 0
                q.append((nx, ny))
                cnt += 1
    return cnt


for i in range(n):
    for j in range(m):
        if graph[i][j] == 1:
            result.append(bfs(i, j))

if len(result) == 0:
    print(len(result))
    print(0)
else:
    print(len(result))
    print(max(result))
