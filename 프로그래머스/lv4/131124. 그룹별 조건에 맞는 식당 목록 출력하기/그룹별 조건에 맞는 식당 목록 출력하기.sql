-- 코드를 입력하세요
SELECT A.Member_Name, B.Review_Text, Date_format(B.Review_Date,'%Y-%m-%d') as Review_Date
from MEMBER_PROFILE A
join Rest_Review B
on A.Member_Id = B.Member_Id
where
   A.MEMBER_ID = (
        SELECT 
            MEMBER_ID
        FROM
            REST_REVIEW
        GROUP BY
            MEMBER_ID
        ORDER BY COUNT(*) DESC LIMIT 1
    )

order by Review_date, Review_Text