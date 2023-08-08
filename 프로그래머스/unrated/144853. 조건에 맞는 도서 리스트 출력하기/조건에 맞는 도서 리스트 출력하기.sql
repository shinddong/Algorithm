SELECT book_id, to_char(published_date,'yyyy-mm-dd')as PUBLISHED_DATE
from book
where to_char(PUBLISHED_DATE,'YYYY') ='2021' and category = '인문'
order by PUBLISHED_DATE asc

