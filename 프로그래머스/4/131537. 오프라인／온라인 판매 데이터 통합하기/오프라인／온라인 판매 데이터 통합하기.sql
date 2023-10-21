-- 코드를 입력하세요
SELECT Date_Format(Sales_Date,'%Y-%m-%d') as Sales_Date, Product_Id,User_Id,Sales_Amount
from online_sale
where year(Sales_Date)='2022' and month(Sales_Date)='03'

union all

SELECT Date_Format(Sales_Date,'%Y-%m-%d') as Sales_Date, Product_Id, NULL as User_Id ,Sales_Amount
from offline_sale
where year(Sales_Date)='2022' and month(Sales_Date)='03'

order by sales_date, product_Id, User_Id
