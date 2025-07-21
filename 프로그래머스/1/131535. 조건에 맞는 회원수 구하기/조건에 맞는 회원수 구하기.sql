SELECT COUNT(*) as USERS
from USER_INFO
where TO_CHAR(JOINED,'YYYY-MM-DD') like '2021%' and 
AGE between 20 and 29;