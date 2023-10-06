from collections import deque


def solution(numbers, target):
    def bfs(x,y):
        answer = 0

        queue=deque()
        queue.append((x,y))
        while queue:
            x,y =queue.popleft()
            if y==len(numbers):
                if x==target:
                    answer+=1
                else: continue
            else:
                queue.append((x+numbers[y],y+1))
                queue.append((x-numbers[y],y+1))
        return answer
    return bfs(0,0)
   
    # queue = deque()
    # queue.append((0, 0))
    # while queue:
    #     x, y = queue.popleft()
    #     if y == len(numbers) :
    #         if x==target:
    #             answer+=1
    #         else: continue
    #     else:
    #       queue.append((x+numbers[y], y+1))
    #       queue.append((x-numbers[y], y+1))
    # return answer