def solution(answers):
    a1=[1,2,3,4,5]
    a2=[2, 1, 2, 3, 2, 4, 2, 5]
    a3=[3, 3, 1, 1, 2, 2, 4, 4, 5, 5]
    answer = [0,0,0]
    ans=[]
    for i in range(len(answers)):
        if (answers[i]==a1[i%5]):
            answer[0]+=1
        if (answers[i]==a2[i%8]):
            answer[1]+=1
        if (answers[i]==a3[i%10]):
            answer[2]+=1
    for i, collect in enumerate(answer):
        if max(answer) == collect:
            ans.append(i+1)
    ans.sort()
    
    return ans