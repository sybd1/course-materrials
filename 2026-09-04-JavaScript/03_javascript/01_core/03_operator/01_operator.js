/**
 * 연산자
 * 자바스크립트에서 자주 사용되는 연산자는 산술, 할당, 증감 연산자 등이 있다.
 */

// 1. 산술연산자
const a = 9;
const b = 7;

console.log(a + b);
console.log(a - b);
console.log(a * b);
console.log(a / b); //소수점이 무한대로 나오나?
console.log(a % b);
console.log(a ** b); //거듭제곱 연산자

// 2. 할당연산자
let c = 5;
c += 3;     // c = c + 3 
c -= 2;     // c = c - 2 순서는 항상 산술연산자가 앞에온다.

console.log(c); // 6

// 3. 증감 연산자 : ++는 1증가, --는 1감소
let d = 5;

//후위 증감: 현재 값을 먼저 사용하고, 그 다음 값을 바꾼다.
console.log(d++);   // 5 다음 값을 증가 시킨다.
console.log(d);     // 6

// 전위 증감: 값을 먼저 바꾸고, 바뀐 값을 사용한다.
console.log(++d);   // 7
console.log(--d);   // 6