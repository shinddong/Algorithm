-- 코드를 입력하세요
SELECT  B.Ingredient_Type, sum(A.Total_Order) as Total_Order
from IceCream_Info B
left join First_Half A
on A.Flavor = B.Flavor
group by B.Ingredient_Type
