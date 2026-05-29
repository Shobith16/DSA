SELECT firstname, lastname, city, state
FROM person
    LEFT JOIN address ON person.personid = address.personid

--second-highest-salary
select coalesce(
        (
            select salary
            from (
                    select salary, Dense_Rank() Over (
                            order by salary Desc
                        ) as rnk
                    FROM employee
                ) as ranked
            where
                rnk = 2
            Limit 1
        ), NuLL) as SecondHighestSalary

select e.name as Employee from Employee as e 
inner join employee as f on e.managerId = f.id and e.salary < f.salary

select e.name as Employee from Employee as e 
inner join employee as f on e.managerId = f.id and e.salary > f.salary

