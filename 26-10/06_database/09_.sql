# SET OPERATORS (집합 연산자)

-- UNION : 두 결과를 합치기(중복은 제거)

-- 카테고리 코드가 10번인 메뉴들
-- 가격이 9,000원 미만인 메뉴들

SELECT
	menu_name,
    menu_price,
    category_code
FROM
	tbl_menu
WHERE
	category_code = 10
UNION	-- 두 결과를 합쳐줘~ (중복은 제거하고~)
SELECT
	menu_name,
    menu_price,
    category_code
FROM
	tbl_menu
WHERE
	menu_price < 9000;
    
-- UNION ALL : 두 결과를 합치기(중복 포함)
    SELECT
	menu_name,
    menu_price,
    category_code
FROM
	tbl_menu
WHERE
	category_code = 10
UNION ALL	-- 두 결과를 합쳐줘~ (중복 포함)
SELECT
	menu_name,
    menu_price,
    category_code
FROM
	tbl_menu
WHERE
	menu_price < 9000;
    
/* 교집합 */
SELECT
	a.menu_code,
    a.menu_price,
    a.category_code
FROM 
	tbl_menu a
WHERE category_code = 10
	AND menu_code IN (SELECT
							menu_code
						FROM
							tbl_menu
						WHERE
							menu_price < 9000);
                            
/* 차집합 */
-- 10번 카테고리 메뉴 중에서 가격이 9천원 미만인 메뉴를 제외하는 차집합 조회                           
SELECT
	a.menu_code,
    a.menu_price,
    a.category_code
FROM 
	tbl_menu a
LEFT JOIN (SELECT
				menu_code
			FROM
				tbl_menu
			WHERE
				menu_price < 9000) b ON a.menu_code = b.menu_code
WHERE
	a.category_code = 10 AND b.menu_code IS NULL;