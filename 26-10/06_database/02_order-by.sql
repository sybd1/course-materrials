# ORDER BY 기준 컬럼
-- SELECT문의 가장 마지막에 위치하며, 결과 집합을 하나의 열로 정렬

SELECT
	menu_code,
    menu_name,
    menu_price
FROM
	tbl_menu
ORDER BY
-- menu_price ASC; -- ASC는 오름차순을 의미(생략가능)
	menu_price;
    
-- 내림차순 정렬
SELECT
	menu_code,
    menu_name,
    menu_price
FROM
	tbl_menu
ORDER BY
	menu_price DESC,	-- 내림차순 DESC 생략 불가능
    menu_name ASC;		-- 2차 기준: 가격이 같으면, 이름 오름차순으로
    
-- 연산 결과로 정렬
SELECT
	menu_code,
    menu_price,
    menu_code * menu_price AS calculated_value
FROM
	tbl_menu
ORDER BY
	calculated_value DESC;
    
-- FIELD(컬럼 첫번째, 두번째, ...) : 컬럼 값이 목록의 몇 번째에 있는지 숫자로 알려준다.
SELECT FIELD('B', 'A', 'B', 'C');

-- 'N'을 1순위, 'Y'를 2순위로 정렬
SELECT
	menu_name,
    orderable_status
FROM
	tbl_menu
ORDER BY
	FIELD(orderable_status, 'N', 'Y');
    
-- null 값이 있는 컬럼에 대한 정렬
SELECT
	*
FROM
	tbl_category
ORDER BY
	ref_category_code IS NULL,	-- NULL 이면 true(1), 아니면 false(0) 반환. 
    ref_category_code;

-- 내림차순 시 NULL을 처음으로 (IS NULL DESC)
SELECT
	*
FROM
	tbl_category
ORDER BY
	ref_category_code IS NULL DESC,	-- NULL 이면 true(1), 아니면 false(0) 반환
    ref_category_code DESC;
