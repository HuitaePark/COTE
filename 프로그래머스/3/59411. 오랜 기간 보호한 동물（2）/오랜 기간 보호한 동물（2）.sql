SELECT *
from (
    select O.ANIMAL_ID,O.NAME
    from ANIMAL_INS I
    INNER JOIN ANIMAL_OUTS O
        on I.ANIMAL_ID = O.ANIMAL_ID
    order by O.DATETIME - I.DATETIME desc
)
where rownum <= 2;
