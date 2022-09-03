# Write your MySQL query statement below
select Max(salary) as  SecondHighestSalary
from employee
where salary < (select Max(Salary) from employee)