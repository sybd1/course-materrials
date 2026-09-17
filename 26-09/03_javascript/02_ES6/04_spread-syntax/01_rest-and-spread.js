/**
 * [Spread Syntax]
 * 함수의 '인수' 자리나, 배열/객체 리터럴 안에서 사용하여
 * 배열의 요소들을 개별 값의 목록으로 펼쳐준다.
 * 
 * [Rest Parameter]
 * 함수의 '매개변수' 자리에 사용하여, 정해지지 않은 개수의 인수들을
 * 하나의 '배열'로 모아서 받는다.
 */

const scores = [80, 95, 70];

// Math.max(80, 95, 70) 처럼 숫자를 각각 받아야 한다.
console.log(Math.max(scores));  // NaN

// spread(...): 배열을 인수로 펼친다. 스프레드 신텍스(spread syntax)라고 부른다.
console.log(Math.max(...scores));   // 95

// spread syntax를 사용해 원본 문자열을 헤치지 않고 요소를 추가하는 법. push는 원본 자체를 바꾼다.
const frontEnd = ['HTML', 'CSS'];

const languages = [...frontEnd, 'JavaScript'];
console.log(languages);     // [ 'HTML', 'CSS', 'JavaScript' ]

// 모든 요소를 새 대괄호 안에 펼치므로 모양은 같지만 서로 다른 배열이 만들어짐
const languagesCopy = [...languages];   // [ 'HTML', 'CSS', 'JavaScript' ]
console.log(languages === languagesCopy);   // false

const sameLanguages = languages;
console.log(sameLanguages === languages);   // true


const original = [
    { name: '홍길동' }
];
const copid = [...original];
console.log(copid);     // [ { name: '홍길동' } ]

// 내부에 객체가 있다면 그 객체까지 새로 만드는 것은 아닌 얕은 복사이다.
console.log(original === copid);        // false, 객체는 서로 다르다.
console.log(original[0] === copid[0]);  // true, 객체 안의 요소는 같은 값이다.


//객체를 펼쳐 새 객체 만들기
const student = {
    name: '홍길동',
    score: 80
};

const updatedStudent = {
    ...student,
    score: 90
}
console.log(updatedStudent);    // { name: '홍길동', score: 90 }, 원하는 프로퍼티 값을 수정하는 문법

// Rest 파라미터: 나머지 인수를 배열로 모으기
function sum(...numbers) {
    let total = 0;

    console.log('받은 인수의 배열', numbers);   // 받은 인수의 배열 [ 10, 20, 30, 40 ]
    for (const number of numbers) {
        total += number;    // total = total + number
    }
    return total;
}
console.log(sum(10, 20, 30, 40));   // 100


const prices = [1000, 2000, 3000];

// 함수의 매개변수 자리에는 Rest 파라미터를 사용한다
function printTotal(label, ... values) {
    let total = 0;

    for (const value of values) {
        total += value;
    }
    console.log(label, total)
}
// 호출하는 쪽에서 spread 문법
printTotal('합계:', ...prices); // ('합계', 1000, 2000, 3000) 
