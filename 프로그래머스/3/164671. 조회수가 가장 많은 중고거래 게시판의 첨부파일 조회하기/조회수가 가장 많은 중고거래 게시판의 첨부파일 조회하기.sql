-- 코드를 입력하세요
SELECT concat('/home/grep/src/',A.Board_Id,"/",B.File_Id,B.File_Name,B.File_Ext)as File_Path
from USED_GOODS_BOARD A
join USED_GOODS_FILE B
on A.Board_Id = B.Board_ID
where A.views= (select max(views) from USED_GOODS_BOARD )
order by file_Id desc