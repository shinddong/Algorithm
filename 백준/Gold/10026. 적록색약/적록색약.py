# 그래프를 입력받아서, 그대로 출력 (버전1 ), G를 R로 바꾼 버전(적록색약)
# 두가지 그래프에 대해 bfs 돌리면 되지 않으려나?
from collections import deque
import copy
n = int(input())
dx = [-1, 1, 0, 0]
dy = [0, 0, -1, 1]
graph1 = []
isVisited = [[0 for i in range(n)] for j in range(n)]
for i in range(n):
    graph1.append(list(map(str, input())))

graph2 = copy.deepcopy(graph1)
for i in range(n):
    for j in range(n):
        graph2[i][j] = graph1[i][j].replace('G', 'R')




def bfs(graph, x, y):
    q = deque()
    q.append((x, y))
    isVisited[x][y] = 1
    while q:
        x, y = q.popleft()
        for i in range(4):
            nx = x + dx[i]
            ny = y+dy[i]
            if 0 <= nx < n and 0 <= ny < n:
                if graph[nx][ny] == graph[x][y] and isVisited[nx][ny] == 0:
                    isVisited[nx][ny] = 1
                    q.append((nx, ny))


cnt = 0

for i in range(n):
    for j in range(n):
        if isVisited[i][j] == 0:
            bfs(graph1, i, j)
            cnt += 1
print(cnt, end=' ')

cnt2 = 0

isVisited = [[0 for _ in range(n)] for _ in range(n)]
for i in range(n):
    for j in range(n):
        if isVisited[i][j] == 0:
            bfs(graph2, i, j)
            cnt2 += 1
print(cnt2, end=' ')

# print(bfs(graph2, 0, 0))
