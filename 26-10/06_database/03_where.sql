# WHERE 조건
-- '조건 필터링'의 역할, 특정 조건에 맞는 행만 선택하는데 사용된다.

-- (1) 비교 연산자 활용 (=, <>, > <=)
SELECT
	menu_name,
    menu_price,
    orderable_status
FROM
	tbl_menu
WHERE
	orderable_status <> 'Y';	-- 이 조건이 true가 되는 행들만 결과에 포함
    
-- (2) 논리 연산자(AND, OR)를 활용하여 조건 조합
-- AND (두 조건이 모두 참이어야 함)
-- OR (둘 중 하나라도 참이면 참)
-- 주문 가능하면서(Y), 카테고리가 10번인 메뉴 찾기
SELECT
	menu_name,
    category_code,
    orderable_status
FROM
	tbl_menu
WHERE
	orderable_status = 'Y' AND category_code = 10;
    
-- 우선순위 (AND > OR)
SELECT 1 OR 0 AND 0;
SELECT (1 OR 0) AND 0;
    
-- 가격이 만원 이상이고, 2만 5천원 이하인 메뉴 찾기
SELECT
	menu_name,
    menu_price
FROM
	tbl_menu
WHERE
	menu_price NOT BETWEEN 10000 AND 25000;	-- 부정은 NOT을 붙인다.
    
-- LIKE
-- 메뉴 이름에 '마늘'이 포함된 메뉴를 찾고 싶을 때
-- %는 문자가 없거나 여러 개 있어도 된다는 와일드 카드이다.
SELECT
	menu_name
FROM
	tbl_menu
WHERE
	-- 이름 어느 위치에서든 마늘이 포함된 메뉴를 찾는다.
	menu_name LIKE '%마늘%';	-- 부정은 NOT LIKE
    -- LIKE '%마늘' -- 마늘로 끝나는 메뉴
    -- LIKE '마늘%' -- 마늘로 시작하는 메뉴

-- IN 연산자
-- 카테고리 코드가 4번이거나, 5번이거나, 6번인 메뉴 찾기
SELECT
	menu_name,
    category_code
FROM
	tbl_menu
WHERE
	category_code IN (4, 5, 6);	-- 부정은 NOT IN

-- IS NULL 연산자
SELECT
	category_code,
    category_name,
    ref_category_code
FROM
	tbl_category
WHERE
	ref_category_code IS NULL;	-- 부정은 IS NOT NULL

    