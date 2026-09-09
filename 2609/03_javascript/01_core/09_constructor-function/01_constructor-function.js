/** 생성자 함수 */

const student1 = {
    name: '판다',
    age: 5,
    getInfo: function () {
        return `${this.name}는 ${this.age}세 입니다.`;
    }
};

const student2 = {
    name: '코알라',
    age: 3,
    getInfo: function () {
        return `${this.name}는 ${this.age}세 입니다.`;
    }
};

console.log(student1.getInfo());
console.log(student2.getInfo());

// 관례적으로 대문자로 함수를 만들게 되면 생성자 함수를 만들겠다는 의미.
function Student(name, age) {   // Student가 생성자 함수
    this.name = name;       // 우항은 호출할 인수, 좌항은 새롭게 만들어질 this 객체
    this.age = age;
    this.getInfo = function () {     // method
        return `${this.name}는 ${this.age}세 입니다.`
    };
}

// 1. this라는 빈 객체를 만든다.
// 2. 그 객체의 프로퍼티들을 할당한다.
// 3. 완성된 this객체가 호출 결과가 되어 student3번에 할당 된다

const student3 = new Student('원숭이', 40);     // new 로 객체를 새롭게 생성
const student4 = new Student('고릴라', 30);
console.log(student3);
console.log(student4);
console.log(student3.getInfo());
console.log(student4.getInfo());

console.log('같은 객체인가:', student3 === student4);   // false, 같은 설계도로 만들어도 new로 생성된 객체는 서로 다른 객체이다.
student3.age = 31;
console.log(student3.getInfo());
console.log(student4.getInfo());

// 1. 이름과 나이를 전달받는 `Dog(name, age)` 생성자 함수를 작성합니다.
// 2. 전달받은 값을 새 객체의 name과 age 프로퍼티에 저장합니다.
// 3. `new`를 사용해 뽀삐 3살과 바둑이 5살 객체를 만듭니다.
// 4. 두 객체의 이름과 나이를 출력합니다.
// 5. 첫 번째 강아지의 나이만 4로 바꾸고 두 객체의 나이를 다시 출력합니다.

function Dog(name, age) {
    this.name = name;
    this.age = age;
    this.info = function() {
        return `이 친구는 ${this.name}고요, ${this.age}살 이에요.`
    };
}
const dog = new Dog('뽀삐', 3);
const dog2 = new Dog('바둑이', 5);
console.log(dog.info());
console.log(dog2.info());
dog.age = 40;
console.log(dog.info());
console.log(dog2.info());