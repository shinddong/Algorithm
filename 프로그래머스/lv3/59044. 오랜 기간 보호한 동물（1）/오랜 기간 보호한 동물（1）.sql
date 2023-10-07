-- 코드를 입력하세요
SELECT A.Name,A.DateTime 
from animal_INS A
left join Animal_Outs B
on A.ANIMAL_ID = B.ANIMAL_ID
where B.DateTime is null
order by A.DateTime
limit 3
