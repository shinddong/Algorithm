from collections import deque
dx = [-2, -1, 1, 2, 2, 1, -1, -2]
dy = [1, 2, 2, 1, -1, -2, -2, -1]

case = int(input())


def bfs(x, y, a, b):
    q = deque()
    q.append((x, y))
    graph[x][y] = 0
    while q:
        x, y = q.popleft()
        if x == a and y == b:
            break
        for i in range(8):
            nx = x + dx[i]
            ny = y+dy[i]
            if 0 <= nx < n and 0 <= ny < n:
                if graph[nx][ny] != 0:
                    continue
                elif graph[nx][ny] == 0:
                    graph[nx][ny] = graph[x][y]+1
                    q.append((nx, ny))

    return graph[a][b]


for i in range(case):
    n = int(input())
    graph = [[0 for _ in range(n)]for _ in range(n)]
    x, y = map(int, input().split())
    a, b = map(int, input().split())      
    print(bfs(x, y, a, b))
