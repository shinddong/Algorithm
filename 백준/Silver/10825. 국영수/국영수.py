import sys

n = int(sys.stdin.readline())
students = []

# 학생 정보 입력 받기
for _ in range(n):
    name, kor, eng, math = sys.stdin.readline().split()
    students.append((name, int(kor), int(eng), int(math)))

# 정렬 기준에 따라 학생 정보 정렬
students = sorted(students, key=lambda x: (-x[1], x[2], -x[3], x[0]))

# 정렬된 학생 정보 출력
for student in students:
    print(student[0])