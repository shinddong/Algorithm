from collections import deque
def solution(maps):
    dx=[-1,1,0,0]
    dy=[0,0,-1,1]
    
    def bfs(x,y):
        n= len(maps)
        m= len(maps[0])
        q=deque()
        q.append((x,y))
        while q:
            x,y= q.popleft()
            for i in range(4):
                nx = x+dx[i]
                ny = y + dy[i]
                if 0<=nx< n and 0<= ny < m:
                    if maps[nx][ny]==1:
                        maps[nx][ny]= maps[x][y]+1
                        q.append((nx,ny))
        return maps[n-1][m-1]               
                
    answer = bfs(0,0)
    if answer==1: return -1
    else : return answer