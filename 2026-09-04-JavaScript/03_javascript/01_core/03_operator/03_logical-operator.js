/** 
 * 논리 연산자는 여러 조건을 결합하여 하나의 논리적 결과를 도출한다
 * 논리 연산자는 AND, OR, NOT 연산자가 있다.
 */

const a = true;
const b = false;

// 1. 논리 AND (&&) - a와 b 모두 true 일 때만 true
console.log(a && b);    // false

// 2. 논리 OR (||) - a 또는 b 중 하나만 true 이면 true
console.log(a || b);    // true

// 3. 논리 NOT (!)
console.log(!a);        // false

/** 단축 평가
 * 표현식을 평가하는 도중 평가 결과가 확정 된 경우 나머지 평과 과정을 생략하는 것
 */

// OR의 경우 'apple이 이미 Truthy한 값이여서 true로 평가되고
// 논리 연산의 결과를 결정한 첫번째 피연산자인 aplle을 그대로 반환한다.
console.log('apple' || 'banana');   // apple 문자열은 트루시안 값이다. 펄시값은 몇 개 없다.
console.log(false || 'banana');     // banana

//AND의 경우 좌항, 우항 모두 확인해야 하므로
//논리 연산의 결과를 결정하는 두번째 피연산자 banana를 그대로 반환한다.
console.log('apple' && 'banana');   // banana 앞과 뒤 모두 Truthy 값이기 때문에 맨 뒤의 결과값을 도출한다.
console.log(false && 'apple');

/** 삼항 연산자 : 조건식에 따라 두 값 중 하나를 선택하는 연산자
 * 조건 ? 값1 : 값2
 * 조건이 true일 경우 값1, false일 경우 값2 선택
 */

const age = 20;

const result = (age >= 20) ? "성인" : "미성년자";
console.log(result);
