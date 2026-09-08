/**
 * 암묵적 타입 변환
 * 개발자가 직접 변환을 명령하지 않아도
 * 자바스크립트 엔진이 문맥에 맞게 타입을 자동 변환하는 것
 */

console.log('문자열 타입으로 변환');
console.log(10 + '20'); // + 는 문자열이 끼어 있으면 연결 연산자로 동작
console.log(typeof (10 + '20'));
console.log(true + ''); // 'true'
console.log(null + ''); // 'null'

// 문자열로 변경 필요 시 빈 문자열을 사용하는 방법도 있다.
console.log(1 + '');    // '1'

// 산술 연산자의 피연산자는 모두 숫자여야 하므로
// 숫자가 아닌 피연산자를 숫자 타입으로 암묵적 타입 변환한다.
console.log('숫자 타입으로 변환');
console.log(10 - '5');
console.log(typeof(10 - '5'));
console.log(10 * '5');
console.log(10 / '5');
console.log(10 % 'js'); //NaN (Not a Number) - 피연산자 숫자 변환 불가로 연산 수행 불가

// 숫자와 문자열 비교하면 문자열을 숫자로 변환한 뒤 비교
console.log(10 > '5');

// + 단항 연산자는 피연산자가 숫자 타입의 값이 아니면 숫자 타입으로 암묵적 타입 변환
console.log(+'');       //0
console.log(+true);     //1
console.log(+false);    //0

// 불린 타입으로 변환

// 자바스크립트 엔진은 불리언 타입이 아닌 값을 Truthy한 값(참으로 평가 되는 값)
// 또는 Falsy 값(거짓으로 평가되는 값)으로 구분한다.

/**
 * - Falsy 값(false로 평가되는 값)
 * false
 * 0 (숫자 0)
 * '' (빈 문자열)
 * null
 * undefined
 * NaN (Not a Number)
 */

if(10 > 5) console.log('참 입니다.');
if('') console.log('Falsy');
if(0) console.log(0);
if(1) console.log(1);