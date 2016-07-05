# Write your MySQL query statement below
select A.name as Employee from Employee as A join Employee as B
where (A.ManagerId=B.Id) & (A.salary>B.salary)