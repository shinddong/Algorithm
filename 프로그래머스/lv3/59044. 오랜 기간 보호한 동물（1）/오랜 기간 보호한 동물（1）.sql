-- 코드를 입력하세요
SELECT A.Name, A.DateTime
-- 아직 입양 못간. 보호테이블은 전부 다 꺼내야됨. 즉 leftjoin. 
from Animal_Ins A
left join Animal_Outs B
on A.Animal_Id = B.Animal_Id
-- 아직 입양을 못 간걸 고려하려면, B.Animal_Id가 NULL인걸 뽑아야됨. 
where B.Animal_Id is Null
order by A.DateTime
Limit 3
