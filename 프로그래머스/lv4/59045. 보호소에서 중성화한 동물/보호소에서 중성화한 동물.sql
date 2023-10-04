-- 코드를 입력하세요
SELECT A.Animal_Id, A.Animal_Type, A.Name
from Animal_Ins A
join Animal_Outs B
on A.Animal_Id = B. Animal_Id
where A.Sex_upon_intake != B. Sex_upon_OutCome
order by Animal_Id