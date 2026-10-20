# SELECT
-- SELECT 컬럼명 FROM 테이블명

-- 단일 열(컬럼) 데이터 검색
SELECT menu_name FROM tbl_menu;

-- 여러 열의 데이터 검색
SELECT
	menu_code,
    menu_name,
    menu_price
FROM
	tbl_menu;
    
-- 모든 열에서 데이터 검색(*: 모든 컬럼을 의미하는 와일드 카드)
SELECT * FROM tbl_menu;

SELECT 6 + 3;
SELECT NOW();
SELECT CONCAT('홍','길동');
SELECT CONCAT('홍','길동') AS name;


