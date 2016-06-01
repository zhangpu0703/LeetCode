# Write your MySQL query statement below
select
(select distinct Salary from Employee Order By Salary DESC Limit 1 Offset 1)
as SecondHighestSalary