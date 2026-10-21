# INDEX

CREATE TABLE phone (
	phone_code INT PRIMARY KEY,
    phone_name VARCHAR(100) NOT NULL,
    phone_price DECIMAL(10, 2) NOT NULL
);

INSERT INTO phone 
VALUES(1, 'iPhone', 2400000), (2, 'Galaxy', 2000000), (3, 'Xiaomi', 1700000);

-- EXPLAIN은 SELECT문을 MySQL이 어떻게 실행할지 보여준다.
EXPLAIN SELECT
			* 
		FROM
			phone
		WHERE
			phone_name = 'iPhone';

-- 인덱스 생성
CREATE INDEX idx_phone_name
ON phone(phone_name);

SHOW INDEX FROM phone;

-- 인덱스 삭제
DROP INDEX idx_phone_name ON phone;











