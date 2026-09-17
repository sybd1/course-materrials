/** null 병합 연산자 (??)
 * 좌항의 피연산자가 null 또는 undefined인 경우
 * 우항의 피연산자를 반환하고, 그렇지 않으면 좌항의 피연산자를 반환한다.
 * 
 * 실제 웹사이트에서 에러가 생기는 것을 방어적으로 막아줄 연산자
 */

const test = null ?? '기본 값';
console.log(test);

// 빈 문자열과 같은 Falsy한 값을 false로 취급해서 생기는 문제가 있다.
// const value = '' || '기본 값';
// console.log(value); // 빈 문자열이 아닌 '기본 값'으로 설정됨

const value = '' ?? '기본 값';
console.log(value);    // 빈 문자열이 출력 된다.