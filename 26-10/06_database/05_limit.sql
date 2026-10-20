# LIMIT 개수
-- 결과중에 딱 내가 원하는 만큼만 잘라서 줘!! 라고 요청하는 키워드.

SELECT
	*
FROM
	tbl_menu
ORDER BY
	menu_price DESC
LIMIT 5;

-- LIMIT [시작 위치(건너뛸 개수)], [가져올 행의 개수]
SELECT
	*
FROM
	tbl_menu
ORDER BY
	menu_price DESC
LIMIT 1, 4;