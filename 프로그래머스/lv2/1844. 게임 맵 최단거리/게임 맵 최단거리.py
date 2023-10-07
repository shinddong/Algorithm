from collections import deque
def solution(maps):
    dx=[0,0,-1,1]
    dy=[-1,1,0,0]
    x,y=1,1
    n=len(maps)
    m=len(maps[0])
    answer=0
    def bfs(x,y):
        
        q=deque()
        q.append((x,y))
        while q:
            x,y=q.popleft()
            for i in range(4):
                    nx=x+dx[i]
                    ny=y+dy[i]
                    if nx <0 or nx>=n or ny<0 or ny>=m:
                        continue
                    if maps[nx][ny]==0:
                        continue
                    if maps[nx][ny]==1:
                        maps[nx][ny]=maps[x][y]+1
                        q.append((nx,ny))
        return maps[n-1][m-1]
    if bfs(0,0)==1:
        return -1
    else: answer=bfs(0,0)
    return answer