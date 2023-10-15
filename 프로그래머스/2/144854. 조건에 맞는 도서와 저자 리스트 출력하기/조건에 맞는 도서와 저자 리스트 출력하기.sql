-- 코드를 입력하세요
SELECT A.Book_Id, B.Author_Name, Date_Format(A.Published_Date,'%Y-%m-%d')as Published_Date
from Book A
join Author B
on A.Author_Id=B.Author_Id
where A.Category="경제"
order by 3