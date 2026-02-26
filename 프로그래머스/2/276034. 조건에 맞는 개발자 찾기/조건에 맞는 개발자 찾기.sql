SELECT d.ID,d.EMAIL,d.FIRST_NAME,d.LAST_NAME
FROM DEVELOPERS d
where exists(
    select 1
    from SKILLCODES s
    where s.NAME in ('C#','Python')
     AND (d.SKILL_CODE & s.CODE) != 0
)
ORDER BY d.ID asc;