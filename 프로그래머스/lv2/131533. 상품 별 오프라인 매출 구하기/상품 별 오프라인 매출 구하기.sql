-- 코드를 입력하세요
SELECT A.Product_Code, (A.Price * sum(B.Sales_Amount))as Sales
from Product A
join Offline_Sale B
on A.Product_Id=B.Product_Id
group by B.product_Id
order by Sales desc, Product_Code 