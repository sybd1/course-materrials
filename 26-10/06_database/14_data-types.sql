# CAST FUNCTION

# 명시적 형변환
-- CAST
-- CONVERT

SELECT
	AVG(menu_price) AS '변환 전 평균'
FROM
	tbl_menu;
    
-- CAST(값 AS 바꿀타입)
SELECT
	CAST(AVG(menu_price) AS SIGNED INTEGER) AS '메뉴 평균 가격'
FROM
	tbl_menu;
    
SELECT
	-- SIGNED INTEGER: 부호가 있는 정수, 즉 음수, 0, 양수를 표현(INTEGER는 생략 가능)
	CONVERT(AVG(menu_price), SIGNED) AS '메뉴 평균 가격'
FROM
	tbl_menu;
    
SELECT CAST('2026-10-21' AS DATE);

SELECT 
	menu_name, 
    CONCAT(CAST(menu_price AS CHAR(5)), '원') AS '메뉴가격'
FROM
	tbl_menu;
    
    
# 암시적 형변환

SELECT '1' + '2';

SELECT 3 > 'MAY';