-- 코드를 입력하세요
SELECT B.User_ID, B.NickName,concat(B.City,' ',B.Street_Address1,' ',B.Street_Address2) as 전체주소,
concat(substr(B.tlno,1,3),'-',substr(B.tlno,4,4),'-',substr(B.tlno,8,4)) as 전화번호

from Used_Goods_User B join Used_Goods_Board A
on A.Writer_Id = B.User_Id
group by A. Writer_Id
having count(A.Board_Id)>=3
order by 1 desc