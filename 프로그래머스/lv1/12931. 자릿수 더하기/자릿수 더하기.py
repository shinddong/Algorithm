def solution(n):
    x=str(n)
    ans=[]
    answer=0
    for i in range(len(x)):
        ans.append(x[i])
    for j in range(len(ans)):
        answer+=int(ans[j])
    return answer

    # [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
    

