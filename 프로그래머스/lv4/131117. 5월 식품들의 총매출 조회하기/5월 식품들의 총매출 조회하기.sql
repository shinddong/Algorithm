-- 코드를 입력하세요
SELECT A.Product_Id, A.Product_Name, sum(B.Amount*A.Price) as Total_Sales
from food_Product A
join Food_Order B
on A.Product_Id = B.Product_Id
where B.Produce_date like '2022-05-%%'
group by B.Product_Id
order by Total_Sales desc, Product_Id 