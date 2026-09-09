// const student1 = {
//     name: '판다',
//     age: 8
// };

// const student2 = {
//     name: '다람쥐',
//     age: 5,
// };

function Student(name, age) {
    this.name = name;
    this.age = age;
}

const student1 = new Student('판다', 8);
const student2 = new Student('다람쥐', 4);

Student.prototype.activate = true;  //const Student.prototype = { activate: true};
Student.prototype.getInfo = function() {
    return `${this.name}는 ${this.age}세 입니다.`;  // 호출한 주체가 this가 된다
}

// new 키워드를 이용해서 만들면 생성자 함수의 prototype(Student.protype) 객체에 연결된다.
const student3 = new Student('홍길동', 20);
const student4 = new Student('장보고', 30);

console.log(Object.getPrototypeOf(student3) === Student.prototype);
console.log(Object.hasOwn(student3, 'getInfo'));    // 공통 객체에 정의해놨기 때문에 false

console.log(student3.activate);

console.log(student3.getInfo());
console.log(student4.getInfo());

console.log(student3.getInfo === student4.getInfo); // true

student3.age = 35;
console.log(student3.getInfo());


// 1. `Book(title, price)` 생성자에서 title과 price를 각 객체에 저장합니다.
// 2. `getTotal(quantity)`은 `Book.prototype`에 정의하고 현재 도서의 가격과 수량을 곱해 반환합니다.
// 3. 15000원 도서와 20000원 도서를 만들어 각각 두 권의 총액을 확인합니다.
// 4. 두 도서가 같은 getTotal 함수를 사용하는지 확인합니다.
// 5. book1이 getTotal을 직접 가지고 있는지, Book.prototype이 가지고 있는지 확인합니다.
// 6. 첫 도서의 가격을 18000원으로 바꾸고 두 도서의 총액을 다시 확인합니다. 수량 0도 확인합니다.

function Book(title, price) {
    this.title = title;
    this.price = price;
};

Book.prototype.getTotal = function(quantity) {
    return quantity * this.price;
};

const book1 = new Book(2, 15000);
const book2 = new Book(2, 20000);
console.log(book1.getTotal(2) + book2.getTotal(2));
// console.log(Object.hasOwn(book1, 'getTotal') === (book2, 'getTotal'));
console.log(book1.getTotal === book2.getTotal);
// console.log(Object.getPrototypeOf(book1.getTotal) === (book2.getTotal));
// console.log(Object.getPrototypeOf(book1.getTotal()) === book1.prototype);
console.log(Object.hasOwn(book1, 'getTotal'));

book1.price = 18000;
console.log(book1.getTotal(2) + book2.getTotal(2));
console.log(book1.getTotal(0) + book2.getTotal(0));

