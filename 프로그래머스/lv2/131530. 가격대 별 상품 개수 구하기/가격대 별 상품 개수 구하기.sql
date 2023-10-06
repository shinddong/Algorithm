-- 코드를 입력하세요
SELECT (price div 10000)*10000 as Price_Group ,count(*) as Products
from Product
group by Price_Group
order by Price_Group