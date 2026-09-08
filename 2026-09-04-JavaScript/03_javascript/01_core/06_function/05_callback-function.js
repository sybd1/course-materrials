/**
 * 콜백 함수는 "지금 바로 실행할 함수"가 아니라,
 * 다른 함수에 맡겨두었다가 필요한 시점에 호출되도록 전달하는 함수이다.
 */

// 고차 함수: 함수를 인수로 받는 함수 <함수 안에, 인수로 함수를 두는 함수>
function calculator(calculateCallback, a, b) {
    console.log('계산을 시작합니다.');
    // 계산 '시점'은 calculator가 결정하지만,
    // 계산 '방식'은 외부에서 주입받은 콜백 함수가 결정한다.
    const result = calculateCallback(a, b);
    return result;
}

// 콜백 함수
function add(a, b) {
    return a + b;
}

function multiply(a, b) {
    return a * b;
}

// 고차함수에 콜백함수를 '재료'처럼 전달
const addResult = calculator(add, 9, 8);
console.log(addResult);
const multiplyResult = calculator(multiply, 9, 8);
console.log(multiplyResult);

// 실용 예제 : 배열 정렬
const numbers = [3, 10, 1, 6, 9] 

// sort() 라는 고차 함수에 '정렬 기준'을 담은 콜백함수를 전달한다
numbers.sort(function(a, b) {   
    // a - b가 음수면 a가 앞으로, 양수면 b가 앞으로 정렬
    return a -b ; // 오름차순 정렬
});

console.log(numbers);