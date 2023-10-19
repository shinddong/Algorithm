def solution(citations):
    answer = 0
    citations.sort(reverse=True)
    #6,5,3,0,1
    for citation in citations: 
        if citation>answer:
            answer+=1
        
    return answer