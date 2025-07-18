SELECT  WAREHOUSE_ID,
        WAREHOUSE_NAME,
        ADDRESS,
        nvl(FREEZER_YN,'N') as FREEZER_YN
from FOOD_WAREHOUSE
where address like '경기%'
order by WAREHOUSE_ID;