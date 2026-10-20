# DISTINCT (중복 제거)
-- 중복된 값을 제거하고 고유한 값들의 목록만 보고 싶을때 사용

SELECT DISTINCT 
	category_code
FROM
	tbl_menu
ORDER BY
	category_code;
    
-- 열이 여러 개인 DISTINCT
-- 지정된 모든 열의 조합이 똑같을 때만 중복으로 간주하여 제거
SELECT DISTINCT
	category_code,
    orderable_status
FROM
	tbl_menu;