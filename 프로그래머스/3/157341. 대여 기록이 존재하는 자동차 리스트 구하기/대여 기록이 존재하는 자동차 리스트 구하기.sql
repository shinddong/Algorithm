-- 코드를 입력하세요
SELECT distinct(A.car_Id)
from CAR_RENTAL_COMPANY_CAR A
join CAR_RENTAL_COMPANY_RENTAL_HISTORY B
on A.car_Id = B.Car_Id
where A.Car_Type="세단"
and Month(B.Start_Date)="10"

order by 1 desc