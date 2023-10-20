from functools import cmp_to_key
def solution(numbers):
    answer=""
    def compare(x,y):
        t1=x+y
        t2=y+x
        if t1>t2:
            return 1
        elif t1<t2: 
            return -1
        else: 
            return 0
    numbers=list(map(str,numbers))
    numbers=sorted(numbers,key=cmp_to_key(compare),reverse=True)
    answer = str(int(''.join(numbers)))
    return answer