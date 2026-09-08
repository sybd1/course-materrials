```text
// 1.
const book = {
    title: '자바스크립트 입문',         
    price: 15000
};

// 객체의 프로퍼티는 Key : Value 값 한 쌍으로 구성된다.

// 2.
function calculateTotal(book, quantity) {

// 기본 함수 선언 순서. function (function name)(매개변수 parameter)
// 매개변수 : 함수가 들어왔을 때 값을 받을 구역

// 3.
    return book.price * quantity;           
}

// 호출될시에 '책의 가격'과 수량을 곱해 return 키워드를 사용해 코드 블럭 밖으로 반환하도록 한다.

// 4.
const result = calculateTotal(book, 2);     
console.log(result);

// 함수를 호출해서 인수를 보내고 계산된 return(반환) 값을 받아 result 변수에 할당하고 출력한다.

// 5.
book.price = 18000;
console.log(calculateTotal(book, 2));

// 마침표 표기법으로 book 객체의 price 프로퍼티 값을 15000에서 18000으로 재할당 했습니다.
// 재할당 된 book 객체의 인수를 전달하고, 함수를 호출하고 반환된 결과값을 출력한다.

// 6.
console.log(calculateTotal(book, 0));

// 매개변수 quantity 자리에 인수 0을 전달하여 호출하고 결과값을 출력

```