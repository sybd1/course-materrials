# SUBQUERIES (서브쿼리)

-- 1단계 서브쿼리
SELECT
	category_code
FROM
	tbl_menu
WHERE
	menu_name = '민트미역국';
    
-- 2단계 메인쿼리
-- 민트미역국과 같은 카테고리 메뉴 조회
SELECT
	menu_name,
    category_code
FROM
	tbl_menu
WHERE
	category_code = (SELECT
						 category_code
				 	 FROM
						 tbl_menu
					 WHERE
						 menu_name = '민트미역국');

-- FROM 절에서 서브쿼리 사용
-- 즉석에서 만들어 쓰는 임시 테이블처럼 동작 -> 파생 테이블이라고도 부른다.

-- 가장 많은 메뉴가 포함된 카테고리는 메뉴를 총 몇 개 가지고 있나요?

-- 1단계 서브쿼리: 카테고리별로 메뉴가 몇 개씩 있는지?
SELECT 
	COUNT(*) AS 'count'
FROM
	tbl_menu
GROUP BY
	category_code;
    
-- 2단계 : 가장 많은 메뉴가 포함된 카테고리의 메뉴 수
SELECT
	MAX(count) AS '최대 메뉴 수'
FROM
	(SELECT 
		COUNT(*) AS 'count'
	FROM
		tbl_menu
	GROUP BY
		category_code) AS count_table;	-- 파생테이블은 반드시 별칭이 있어야 한다.

-- 상관 서브쿼리
-- 카테고리별 평균 가격보다 높은 가격의 메뉴 조회
SELECT
	AVG(menu_price)
FROM
	tbl_menu
WHERE
	category_code = 4;
    
SELECT
	menu_code,
    menu_name,
    menu_price
FROM
	tbl_menu a
WHERE
	menu_price > (SELECT
						AVG(menu_price)
					FROM
						tbl_menu
					WHERE
						category_code = a.category_code);


