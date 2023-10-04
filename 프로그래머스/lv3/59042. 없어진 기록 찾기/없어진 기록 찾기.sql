-- 코드를 입력하세요
SELECT B.Animal_Id, B.Name
from Animal_Ins A
right join Animal_Outs B
on A.Animal_Id = B.Animal_Id
where A.Animal_Id is null
order by 1,2