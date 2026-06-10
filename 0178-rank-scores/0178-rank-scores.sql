# Write your MySQL query statement be
select score,
    dense_rank() over(order by score desc) as `rank`
from scores
