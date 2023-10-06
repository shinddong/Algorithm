-- 코드를 입력하세요
SELECT A.Flavor
from July B
left join First_Half A
on A.Shipment_Id = B. Shipment_Id
group by B.Flavor
order by sum(B.Total_order)+A.Total_order desc
limit 3