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
        ), NuLL
    ) as SecondHighestSalary

--third-highest-salary
select
    coalesce(
        (
            select salary
            from (
                    select salary, Dense_Rank() Over (
                            order by salary Desc
                        ) as rnk
                    FROM employee
                ) as ranked
            where
                rnk = 3
            Limit 1
        ),
        NuLL
    ) as ThirdHighestSalary
    inner join employee as f on e.managerId = f.id
    and e.salary > f.salary

select Email as Email
from person
GROUP BY
    Email
HAVING
    COUNT(Email) > 1;

select name as Customers
from Customers
where
    id Not In(
        select CustomerId
        from Orders
    )