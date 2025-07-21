-- Write your PostgreSQL query statement below
SELECT 
p.firstName firstName,
p.lastName lastName,
a.city city, a.state state
FROM Person p
LEFT JOIN Address a ON a.personId = p.personId
