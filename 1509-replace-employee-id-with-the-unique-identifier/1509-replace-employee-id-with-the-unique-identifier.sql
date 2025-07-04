# Write your MySQL query statement below
select g.unique_id ,E.name 
from Employees as E 
left join EmployeeUNI as g
on E.id=g.id
