/** 옵셔널 체이닝 연산자(?.)
 * 좌항의 피연산자가 null 또는 undefined인 경우 underfined를 반환하고
 * 그렇지 않으면 우항의 프로퍼티 참조를 이어간다.
 * 객체 속성을 안전하게 읽고 싶을 때 사용한다.
 */

const obj = null;
// let val = obj.value;    //TypeError: Cannot read properties of null

const val = obj?.value;
console.log(val);

// 옵셔널 체이닝 이전에는 논리연산자 &&를 사용한 단축 평가로 확인을 했다.
// 단, 빈 문자열과 같은 Falsy한 값을 false 취급해서 생기는 문제가 있다.
const str = '';
console.log(str.length);    //0 , 빈문자열은 글자수 0으로 출력된다.
// len에 str즉, 빈 문자열이 담긴다. 우리가 원했던 길이 값이 담기지 않는다.
// const len= str && str.length;

// null 또는 undefined일 때만 멈춘다.
// 빈 문자열은 null, undefined가 아니므로 문자열의 길이 값이 담긴다.
const len = str?.length;
console.log(len);