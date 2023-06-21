-- 코드를 입력하세요
SELECT * FROM FOOD_PRODUCT
Where Price= (select MAX(PRICE) as price From FOOD_PRODUCT)