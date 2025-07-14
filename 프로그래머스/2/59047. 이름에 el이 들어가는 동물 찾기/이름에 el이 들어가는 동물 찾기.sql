SELECT ANIMAL_ID,NAME
from ANIMAL_INS
where LOWER(NAME) like '%el%' and ANIMAL_TYPE = 'Dog'
order by NAME;