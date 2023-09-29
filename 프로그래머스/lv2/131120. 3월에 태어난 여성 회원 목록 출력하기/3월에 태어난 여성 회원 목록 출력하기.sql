-- 코드를 입력하세요
SELECT member_id, member_name, gender, Date_format(date_of_birth, '%Y-%m-%d')
from member_profile
where Month(date_of_birth) ='03'
and gender ='W'
and tlno is not null
order by member_id