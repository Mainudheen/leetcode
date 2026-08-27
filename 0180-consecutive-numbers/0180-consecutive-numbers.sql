with cte as (
    select num,
    lead(num,1)  over(order by id asc) as num1,
    lead(num,2) over(order by id asc) as num2
    from logs
)

select distinct num as ConsecutiveNums
from cte
where num = num1 and num = num2;