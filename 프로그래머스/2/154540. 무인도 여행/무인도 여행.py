from collections import deque

def solution(maps):
    dx=[-1,1,0,0]
    dy=[0,0,-1,1]
    answer = []
    # for i in range(len(maps)):
    #     maps[i]=list(maps[i])
    n=len(maps)
    m=len(maps[0])
    isVisited=[[0 for _ in range(m)]for _ in range(n)]
    def bfs(x,y):
        cnt=0
        q=deque()
        q.append((x,y))
        isVisited[x][y]=1
        area = int(maps[x][y])
        while q:
            x,y=q.popleft()
            for i in range(4):
                nx=x+dx[i]
                ny=y+dy[i]
                if 0<=nx<n and 0<=ny<m:
                    if isVisited[nx][ny]==0:
                        if maps[nx][ny]!='X':
                            isVisited[nx][ny]=1
                            area+=int(maps[nx][ny])
                            q.append((nx,ny))
        return area
    for i in range(n):
        for j in range(m):
            if isVisited[i][j]==0 and maps[i][j]!='X':
                answer.append(bfs(i,j))
    if len(answer)==0:
        return [-1]
    else: return sorted(answer)
    return maps