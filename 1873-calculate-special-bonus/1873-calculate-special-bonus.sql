# Write your MySQL query statement below
SELECT employee_id, IF(employee_id % 2 != 0 and SUBSTRING(name, 1, 1) != 'M', salary, 0) AS bonus from Employees order by employee_id;