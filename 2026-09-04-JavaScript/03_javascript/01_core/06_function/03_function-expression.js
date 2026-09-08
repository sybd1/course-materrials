/** 함수 표현식 - 값으로 담기*/

// console.log(hi('판다')); // ReferenceError: 표현 함수 초기화 전에 읽을 수 없음

const hi = function (name) {         // 함수명 생략 가능 <함수의 값을 변수로 담는다. 함수를 값으로 취급할 수 있다.> 
    return `${name}님 안녕하세요!`;    
};

console.log(hi('판다')); // 함수명이 아니라 변수명으로 호출을 시도한다.

// 함수 선언문은 코드 실행 전에 먼저 준비되기 때문에 선언 위치보다 위에서 참조가능
// 함수 선언문이 코드의 가장 위로 올라간 것처럼 보이는 동작을 호이스팅이라고 한다.
console.log(hello('홍길동'));

// 함수 선언문의 호이스팅 (Hoisting)
function hello(name) {
    return `${name} 안녕?`
}

console.log(hello('판다'));