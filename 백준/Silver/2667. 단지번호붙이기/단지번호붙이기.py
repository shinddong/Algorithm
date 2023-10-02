from collections import deque
n = int(input())
maps = []
for i in range(n):
    maps.append(list(map(int, input())))

result = []
dx = [-1, 1, 0, 0]
dy = [0, 0, -1, 1]


def bfs(x, y):
    cnt = 1
    q = deque()
    q.append((x, y))
    maps[x][y] = 0
    while q:
        x, y = q.popleft()

        for i in range(4):
            nx = x+dx[i]
            ny = y+dy[i]
            if nx < 0 or nx >= n or 0 > ny or ny >= n:
                continue
            if maps[nx][ny] == 0:
                continue
            if maps[nx][ny] == 1:
                maps[nx][ny] = 0
                q.append((nx, ny))
                cnt += 1
    result.append(cnt)


for i in range(n):
    for j in range(n):
        if maps[i][j] == 1:
            bfs(i, j)

result.sort()
print(len(result))
for i in result:
    print(i)
