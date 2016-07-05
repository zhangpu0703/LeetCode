# Write your MySQL query statement below
Select a.Id from Weather as a left join Weather as b
on TO_DAYS(a.Date)=TO_DAYS(b.Date)+1
where a.Temperature>b.Temperature