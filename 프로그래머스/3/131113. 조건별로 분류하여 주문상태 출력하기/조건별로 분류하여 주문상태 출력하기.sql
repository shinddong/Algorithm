-- 코드를 입력하세요
SELECT order_Id, Product_Id, Date_format(Out_Date,'%Y-%m-%d') as out_date,
case when Month(out_date)<'5'
then "출고완료"
when Month(out_date)='5' and day(out_date)="1"
then "출고완료"
when Month(out_date)>='5' 
then "출고대기"
when out_date is null 
then "출고미정"
end as "출고여부"
from food_order
order by order_id