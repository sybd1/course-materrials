# Transaction (트랜잭션) - ALL or Nothing 모두 성공하거나, 모두 실패해야 하는 하나의 작업 단위

-- MYSQL은 기본적으로 autocommit 모드가 켜져있다. 조절하고 싶다면 설정을 바꿔줘야한다.

SET autocommit = OFF;

-- 지금부터 트랜잭션을 시작하겠다!!
START TRANSACTION;

SELECT * FROM tbl_menu;

DELETE FROM tbl_menu WHERE menu_code = 5;

-- START TRANSACTION 시점 이후에 수행했던 모든 작업을 '전부 취소'하고
-- 트랜잭션 시작 전의 상태로 되돌린다. COMMIT 이후에는 소용이 없다.
ROLLBACK;

-- 작업이 올바르다고 판단되면 최종 저장 명령한다.
COMMIT;