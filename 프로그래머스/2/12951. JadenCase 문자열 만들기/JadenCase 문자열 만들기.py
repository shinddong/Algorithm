def solution(s):
    answer = []
    k=s.split(" ")
    for i in k:
        answer.append(i.capitalize())
    return " ".join(answer)
    