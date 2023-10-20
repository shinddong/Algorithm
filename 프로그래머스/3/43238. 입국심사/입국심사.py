def solution(n, times):
    min_time=1
    max_time=max(times)*n
    ans=1
    while min_time<=max_time:
        people=0
        mid=(min_time+max_time)//2
        
        for time in times:
            people+=mid//time
            if people>=n:
                break
        if people>=n:
            ans=mid
            max_time=mid-1
        else:
            min_time=mid+1
    return ans

##총 시간을 탐색해보자. 

## 중위값을 time 반복문 돌리면서 나눈 값이랑 n값 비교
