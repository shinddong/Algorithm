import copy
from collections import deque
dx = [-1, 1, 0, 0]
dy = [0, 0, -1, 1]
n, m = map(int, input().split())
graph = []
for _ in range(n):
    graph.append(list(map(int, input().split())))


def makewall(x):
    if x == 3:
        bfs()
        return
    for i in range(n):
        for j in range(m):
            if graph[i][j] == 0:
                graph[i][j] = 1
                makewall(x+1)
                graph[i][j] = 0


def bfs():
    arr = copy.deepcopy(graph)
    q = deque()
    for i in range(n):
        for j in range(m):
            if arr[i][j] == 2:
                q.append((i, j))
    while q:
        x, y = q.popleft()
        for i in range(4):
            nx = x+dx[i]
            ny = y + dy[i]
            if 0 <= nx < n and 0 <= ny < m:
                if arr[nx][ny] == 0:
                    arr[nx][ny] = 2
                    q.append((nx, ny))
    global result
    cnt = 0
    for i in range(n):
        for j in range(m):
            if arr[i][j] == 0:
                cnt += 1
    result = max(result, cnt)


result = 0
makewall(0)
print(result)
