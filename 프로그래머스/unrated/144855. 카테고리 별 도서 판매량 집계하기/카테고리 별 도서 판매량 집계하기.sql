-- 코드를 입력하세요
SELECT A.Category, sum(B.Sales) as Total_Sales
from Book A
join Book_Sales B
on A.Book_Id = B.Book_Id
where B.Sales_Date like "2022-01-%%"
group by A.Category

order by Category