# Write your MySQL query statement below
Select(Select distinct salary  from Employee  order by salary DESC LIMIT 1 OFFSET 1)as SecondHighestSalary;