/**
 * 함의 기본 구조 (function name () {})
 * 특정 동작을 이름 붙여 재사용할 수 있게 만든 코드 묶음이다
 * {코드블럭} 코드블럭이라고 부르는 간격
 */

const area1 = 10 * 20;
const area2 = 30 * 40;
const area3 = 50 * 60;
console.log(area1, area2, area3);

// 함수 선언문
function calculateArea(width, height) {     // 1. 함수 이름과 매개변수(parameter) 함수 이름과 매개 변수 모두 의미있는 단어로 만들어주면 된다. 값을 보내줄 통로
    console.log('함수 안으로 들어왔습니다.');   // 2. 실행할 로직
    const area = width * height;
    return area;                            // 3. 반환값 - 호출한 곳으로 값 전달
}

// 함수 호출 및 결과 활용
const result = calculateArea(10, 20);      // 인자(argument) 전달하며 함수 호출. 호출문의 함수이름을 변수에 담아서 결과를 출력할 수 있다.
console.log(result);

console.log(calculateArea(30, 40));
console.log(calculateArea(50, 60));        // 반복문 사용하면 더 편하게 값을 자동으로 나오게 할 수 있을까?

/**
 * 매개변수(paramerter)와 인수(argument)
 * 함수를 정의할 때 설정하는 통로를 매개변수, 실제 호출할 때 넘기는 값을 인수라고 한다.
 */

// 매개변수는 함수가 호출될 때 값을 받기 위해 함수 내부에 만들어지는 지역 변수라고 볼 수 있다.
function greet(name) {
    console.log(name);      // 내부에서는 자유롭게 접근 가능
    console.log(arguments); // 초과인수도 확인 할 수 있다.
    return `${name}님 안녕하세요!`;
}
console.log(greet(`홍길동`));       // 여기서 argument는 `홍길동`이다.

// console.log(name);  // ReferenceError: 함수 내부(지역 스코프)에서만 살아있다. 저녁이라고도 부름.

// 인수 개수 불일치
console.log(greet());  // Java는 매개변수와 인수가 맞지 않으면 Error가 뜨지만, JavaScript는 인수가 부족하면 Undefined가 들어간다.
console.log(greet('홍길동', '이순신'));     // 인수 개수가 초과되는 경우엔 첫번째 인수만 연결해서 사용한다.

// 매개변수 기본값 활요
function hi(name = '아무개') {  // 인수가 전달되지 않거나 undefined가 들어오면 '아무개'가 기본값으로 쓰임
    return `${name} 안녕?`;
}

console.log(hi());          // 아무개 안녕?
console.log(hi('유관순'));   // 유관순 안녕?
console.log(hi(undefined)); // 아무개 안녕?