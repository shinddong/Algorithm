-- 코드를 입력하세요
SELECT Date_Format(DateTime,'%H') HOUR, count(*) Count
from Animal_Outs
group by Hour
having Hour between '09' and '19'
order by HOur