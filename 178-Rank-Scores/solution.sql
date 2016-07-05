# Write your MySQL query statement below
select Score, (select count(distinct(Score)) from Scores where Score>= a.Score) as Rank
from Scores as a
Order by Score Desc