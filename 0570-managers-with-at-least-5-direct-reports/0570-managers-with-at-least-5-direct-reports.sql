select a.name
from employee a
join employee b
on a.id = b.managerId
group by b.managerId
having count(b.managerId) >= 5;