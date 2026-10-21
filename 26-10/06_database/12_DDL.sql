# DDL(Data Definition Language)
-- 데이터 정의 언어 (CREATE, ALTER, DROP)

# CREATE
-- 테이블 생성 구문
/*
CREATE TABLE 테이블명 (
	컬럼명 데이터타입(길이),
    컬렴명 데이터타입(길이),
    ...) ENGINE = ...;
*/
-- IF NOT EXISTS: 존재하지 않을때만 생성하기 위한 구문
CREATE TABLE IF NOT EXISTS tb1(
	pk INT,
    fk INT,
    col1 VARCHAR(225)
) ENGINE = INNODB;

DESCRIBE tb1;

INSERT INTO tb1 VALUES(1, 10, 'Y');

SELECT * FROM tb1;

-- AUTO_INCREMENT
-- INSERT시 PRIMARY KEY에 해당하는 컬럼에 자동으로 번호를 발생시켜 저장할 수 있다.

-- tb2 생성
CREATE TABLE IF NOT EXISTS tb2(
	pk INT AUTO_INCREMENT PRIMARY KEY,
    fk INT,
    col1 VARCHAR(255)
)ENGINE = InnoDB;

DESCRIBE tb2;

-- pk값에 NULL을 주면 자동으로 번호가 채워진다.
INSERT INTO tb2 VALUES(NULL, 10, 'Y');
INSERT INTO tb2 VALUES(NULL, 20, 'N');

SELECT * FROM tb2;

# ALTER
-- 테이블에 추가/변경/수정/삭제하는 모든 것은 ALTER 명령어를 사용해 적용한다.
-- ADD: 새 컬럼 추가
-- DROP COLUMN: 컬럼 삭제
-- CHANGE COLUMN: 이름을 포함한 정의 변경
-- MODIFY: 이름을 유지한 정의 변경

ALTER TABLE tb2
ADD col2 INT;	-- 컬럼 추가

DESCRIBE tb2;
SELECT * FROM tb2;

ALTER TABLE tb2
DROP COLUMN col2; -- 컬럼 삭제

ALTER TABLE tb2
CHANGE COLUMN fk change_fk BIGINT;	-- 이름과 데이터타입을 함께 바꿀 때

ALTER TABLE tb2
MODIFY change_fk INT;	-- 데이터 타입 변경

CREATE TABLE IF NOT EXISTS tb3 (
	pk INT AUTO_INCREMENT PRIMARY KEY,
    fk INT,
    col1 VARCHAR(255)
)ENGINE = InnoDB;

DROP TABLE IF EXISTS tb3;	-- 테이블 구조와 데이터를 영구적으로 삭제.


CREATE TABLE IF NOT EXISTS tb4 (
	pk INT AUTO_INCREMENT PRIMARY KEY,
    fk INT,
    col1 VARCHAR(255)
)ENGINE = InnoDB;

-- 다시 데이터를 넣으면 pk가 1부터 시작
INSERT INTO tb4 
	VALUES (NULL, 10, 'Y'), (NULL, 20, 'N');
    
SELECT * FROM tb4;

#TRUNCATE
-- 테이블 내용물만 비우고 초기화(구조는 남겨두고, 데이터만 비우고 싶을 때 사용)
TRUNCATE TABLE tb4;

-- 다시 데이터를 넣으면 pk가 1부터 시작
INSERT INTO tb4 
	VALUES (NULL, 10, 'Y'), (NULL, 20, 'N');
    



