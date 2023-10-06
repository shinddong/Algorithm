-- 코드를 입력하세요
SELECT A.Book_Id, B.Author_Name, Date_format(A.Published_Date,"%Y-%m-%d")
from Book A
join Author B
on A.Author_Id = B.Author_Id
where Category = '경제'
order by Published_Date