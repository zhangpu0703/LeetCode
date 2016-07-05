# Write your MySQL query statement below
select a.Name as Employee from Employee as a 
join Employee as b
where (a.ManagerId = b.Id) & (a.Salary>b.Salary) 