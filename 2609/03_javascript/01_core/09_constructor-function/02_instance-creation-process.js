'use strict'    // 엄격 모드

function Student(name, age) {
    console.log(`this가 있는가:`, this !== undefined);  // true
    console.log(`name이 있는가:`, 'name' in this);      // false
    this.name = name;   // 이곳에서 this라는 객체에 name,age라는 프로퍼티를 만들어줌
    this.age = age;
    this.getInfo = function () {
        return `${this.name}는 ${this.age}세 입니다.`
    };
    console.log(`초기화한 값:`, this.name, this.age);
}

const student = new Student('호랑이', 50);  // new를 지우고 생성자 함수를 만들면 this라는 객체가 인식이 되지 않는다.
console.log(`객체를 반환받았는가:`, typeof student === 'object');

function Dog(name, age) {
    // 방어코드 new.target: new Dog() 호출하면 Dog를 가리키고 일반 호출로 하면 undefined이다.
    if (!new.target) {  // 만약 new가 없다면 true 라는 뜻
        console.log('new 없이 호출했네요~ new를 붙여서 다시 실행합니다.');
        return new Dog(name, age);
    }
    this.name = name;
    this.age = age;
}

const dog = new Dog('바둑이', 3);
console.log(dog);



// 1. Book(title, price) 생성자를 작성하고 제목과 가격을 프로퍼티에 저장합니다.
// 2. getTotal(quantity) 메서드는 현재 책 가격과 수량을 곱해 반환합니다. 내부에서는 출력하지 않습니다.
// 3. ‘자바스크립트 입문’ 15000원과 ‘객체와 함수’ 20000원인 책 두 개를 new로 만듭니다.
// 4. 두 책의 두 권 총액을 출력합니다. 첫 책의 총액은 const 변수에 저장한 뒤 출력합니다.
// 5. 첫 책 가격을 18000으로 바꾸고 두 책의 두 권 총액을 다시 출력합니다.
// 6. 첫 책의 수량 0도 확인합니다.

function Book(title, price) {
    this.title = title;
    this.price = price;
    this.getTotal = function(quantity) {
        return quantity * this.price;
    };
}

const book1 = new Book(2, 15000);
const book2 = new Book(2, 20000);
console.log(book1.getTotal(2) + book2.getTotal(2));
const firstBookPrice = book1.price;
console.log(firstBookPrice);
book1.price = 18000;
console.log(book1.getTotal(2) + book2.getTotal(2));
console.log(book1.getTotal(0));





// 답지
// function Book(title, price) {
//     this.title = title;
//     this.price = price;
//     this.getTotal = function (quantity) {
//         return quantity * this.price;
//     }
// }

// const book = new Book(2, 15000);
// const book2 = new Book(2, 20000);
// console.log(book.getTotal(2) + book.getTotal(2));   // 두 책의 합
// const firstBookPrice = book.price;
// console.log(firstBookPrice);
// book.price = 18000;
// console.log(book.getTotal(2) + book.getTotal(2));
// console.log(book.getTotal(0));





