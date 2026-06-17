select person_name
from (
    select person_name,
    sum(weight) over(order by turn) as total
    from queue
)t
where total <= 1000
order by total desc
limit 1;
