heights=[]
for i in range(9):
    heights.append(int(input()))
total=sum(heights)
a=0
b=0
for i in range(9):
    for j in range(i+1,9):
        if total-heights[i]-heights[j]==100:
            a,b=heights[i],heights[j]
            break
heights.remove(a)
heights.remove(b)
heights.sort()
for i in heights:
    print (i)