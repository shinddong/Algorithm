def solution(A,B):
    answer = 0
#[1,2,4]
#[4,4,5]
    A.sort()
    B.sort(reverse=True)
    for i in range(len(A)):
        answer+=A[i]*B[i]

    return answer