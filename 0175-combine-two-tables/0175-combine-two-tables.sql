# Write your MySQL query statement below
select p.FirstName, p.LastName, a.City, a.State from person p
join address a on p.personid = a.personid
union
select p.FirstName, p.LastName, null as City, null as State from person p
where not exists (select 1 from address a where p.personid = a.personid)
