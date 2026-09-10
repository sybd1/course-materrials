/** 화살표 함수 */
'use strict';       // 엄격모드. 엄격하게 코드를 점검함.

const power = function(x) {
    return x * x;
}
console.log(power(3));

// function 함수가 사라지고 매개변수를 받을 장소와 화살표 =>가 생겼다.
const arrowPower = (x) => {
    return x * x;
}
console.log('화살표 함수', arrowPower(3));

// 매개변수가 딱 하나인 경우 소괄호 생략 가능. 단순한 표현식은 return과 중괄호도 생략 가능.
const square = x => x * x;
console.log(square(3));

// 매개변수가 없는 경우, 소괄호 생략 불가
const greet = () => '안녕하세요';
const add = (a, b) => a + b;
console.log(greet());
console.log(add(1, 2));


const calculateSquare = x => {
    return x * x;
}
// 중괄호 본문: return을 꼭 명시해서 반환해야 함
const worngSquare = x => {
    x * x;
}
console.log(calculateSquare(3));
console.log(worngSquare(3));    // undefined
// 객체를 반환할 시, 소괄호로 감싸서 실행문이 아니고 반환할 객체를 만드는 표현식임을 표시해 주어야 한다.
// 또는 소괄호 대신 return을 사용해도 된다.
const creatUser = (id, name) => ({id: id, name: name});
console.log(creatUser(1, '판다'));

// 화살표 함수도 다른 함수에 콜백으로 전달 가능
function calculate(value, operation) {
    return operation(value);
}
console.log(calculate(3, power));   // 9
console.log(calculate(3, number => number * number));   // 9