# Write your MySQL query statement below
select A.name as Employee from Employee as A
inner join Employee as B
on (A.ManagerId=B.Id) where A.salary>B.salary
