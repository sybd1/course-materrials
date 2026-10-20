# GROUP BY
-- 지정된 컬럼의 값이 같은 데이터들을 하나의 그룹으로 묶는다.
-- COUNT() : 각 그룹에 속한 행의 개수를 센다.
SELECT
	category_code,
    COUNT(*) AS '메뉴 개수'
FROM
	tbl_menu
GROUP BY
	category_code;
    
    
SELECT
	category_code,
    -- menu_code, -- GROUP BY를 사용할 때, GROUP BY에 사용된 컬럼과 집계함수만 올 수 있다.
    SUM(menu_price) AS '가격 총합',
    AVG(menu_price) AS '가격 평균'
FROM
	tbl_menu
GROUP BY
	category_code;
    
-- HAVING : 그룹에 대한 조건 필터링(WHERE는 그룹화 '전' 조건 필터링이다.)
SELECT
	category_code,
    COUNT(*) AS '메뉴 개수'
FROM
	tbl_menu
GROUP BY
	category_code
HAVING
	COUNT(*) >= 3;

-- ROLLUP : 그룹별 집계 결과와 합계 그 그룹들의 소계와 총계를 보여줌
SELECT
	category_code,
    SUM(menu_price)
FROM
	tbl_menu
GROUP BY
	category_code
WITH ROLLUP;

-- 가격대별, 그 안에서 카테고리별로 그룹화 하고 ROLLUP 적용
SELECT
	menu_price,
    category_code,
    SUM(menu_price)
FROM
	tbl_menu
GROUP BY
	menu_price,
    category_code
WITH ROLLUP;
