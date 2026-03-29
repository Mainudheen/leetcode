# Write your MySQL query statement below
select sample_id,dna_sequence,species,
(case when dna_sequence like "ATG%" then 1 else 0 end) as has_start,
(case when regexp_like(dna_sequence,"TAA$|TAG$|TGA$") THEN 1 ELSE 0 END) AS has_stop,
 (case when dna_sequence like "%ATAT%" then 1 else 0 end) as has_atat,
   (case when dna_sequence like "%GGG%" then 1 else 0 end) as has_ggg
from Samples
group by sample_id;