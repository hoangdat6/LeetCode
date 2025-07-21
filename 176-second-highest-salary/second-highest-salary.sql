-- Write your PostgreSQL query statement below
select (
    select 
        distinct e.salary 
    from Employee e
    order by salary DESC
    LIMIT 1 offset 1
) as SecondHighestSalary
