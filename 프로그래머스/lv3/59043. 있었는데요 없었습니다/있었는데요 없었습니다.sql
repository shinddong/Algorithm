-- 코드를 입력하세요
SELECT B.Animal_Id, B.Name
from Animal_Ins A
join Animal_Outs B
on A.Animal_Id = B.Animal_Id
where B.DateTime<A.DateTime
order by A.DateTime