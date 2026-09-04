/**
 * 동적 타입 언어(JS, Python 등)
 * 변수에 현재 들어 있는 값에 따라 타입이 결정된다.
 */

/**
 * 1. 숫자(Number)
 * 하나의 숫자 타입만 존재하고 모든 수를 실수로 처리한다.
 */

const age = 30;
console.log(age);
console.log(typeof age);

/**
 * 2. 문자열 타입(string)
 * 문자열은 작은 따옴표(''), 큰 따옴표 (""), 또는 백틱(``)으로 텍스트를 감싼다.
 */
const string = "문자열";
console.log(string);
console.log(typeof string);

/**
 * 3. 불린(Boolean): 논리적 참, 거짓을 나타내는 true와 false 뿐이다.
 */
const isStudent = true;
console.log(isStudent);
console.log(typeof isStudent);

/**
 * 4. null: 명시적으로 값이 없음을 의도적으로 명시할 때 사용
 */
const address = null;
console.log(address);
console.log(typeof address);    //object -> JS의 오래된 버그

/**
 * 5. undefined: 변수에 값이 할당되지 않았을 때 자동으로 할당되는 값
 */
let salary;
console.log(salary);
console.log(typeof salary);

/** 템플릿 리터럴
 * ES6부터 도입된 문자열 표기법
 * 작은 따옴표, 큰 따옴표 대신 백틱(``)을 사용해 표현한다.
 */
const lastName = '권';
const firstName = '은지';

console.log('제 이름은 ' + lastName + firstName + '입니다.');

//템플릿 리터럴 사용(표현식 삽입)
//백틱으로 만든 템플릿 리터럴에서는 ${}안에 변수나 계산식을 넣을 수 있다.
console.log(`제 이름은 ${lastName}${firstName}입니다.`);

// const str = '안녕하세요. \n반갑습니다.';

//백틱을 사용하면 줄바꿈이 허용 되고 모든 공백이 있는 그대로 적용 된다.
const str = `안녕하세요.
반갑습니다.`;
console.log(str);