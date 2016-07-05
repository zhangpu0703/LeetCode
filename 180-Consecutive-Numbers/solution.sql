# Write your MySQL query statement below
select distinct(a.Num) as ConsecutiveNums from Logs a, Logs b, Logs c
where (a.Id = b.Id-1) & (b.Id = c.Id-1) & (a.Num=b.Num) & (b.Num=c.Num)