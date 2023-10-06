-- 코드를 입력하세요
SELECT B.User_Id, B.NickName,sum(A.Price) as TOTAL_SALES
from USED_Goods_Board A
join USED_GOODS_USER B
on A.Writer_Id= B.User_ID
where A.Status ='DONE' 
group by A.Writer_ID
having TOTAL_SALES>=700000
order by 3
