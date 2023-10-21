-- 코드를 입력하세요
SELECT A.Rest_ID, A.Rest_NAMe, A.Food_Type, A.Favorites, A.Address, Round(avg(B.REVIEW_SCORE),2)as SCORE
from Rest_Info A
join Rest_Review B
on A.Rest_Id= B.Rest_Id
where A.Address like "서울%"
group by B.Rest_ID
order by 6 desc ,4 desc