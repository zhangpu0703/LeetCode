# Write your MySQL query statement below
Select distinct A.Num 
from Logs as A join Logs as B join Logs as C
on (A.Id=B.Id+1) & (B.Id=C.Id+1) & (A.Num=B.Num) & (B.Num = C.Num)
