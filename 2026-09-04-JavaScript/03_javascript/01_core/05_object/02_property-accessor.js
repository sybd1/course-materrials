/** 프로퍼티 접근
 * 1. 마침표 표기법
 * 2. 대괄호 표기법
 */

// 1. 마침표 표기법
const dog = {
    name: '김삐',       // 여기서 nmae은 프로퍼티
    eat: function(food) {   // 여기서 eat은 매서드
        console.log(`${this.name}는 ${food}를 맛있게 먹어요.`);
    }
}

// console.log(객체.key)
console.log(dog.name);
dog.eat('김자반');

// 2. 대괄호 표기법
console.log(dog['name'])   // 대괄호 안의 프로퍼티 키를 문자열로 적는다
dog['eat']('달래');

const obj = {
    'dash-key': 'dash-value',
    0 : 1    //모든 자료형이 프로퍼티의 키,밸류 값이 가능하다.
};

console.log(obj['dash-key']);   // 네이밍 규칙에 맞지 않는 자료형은 대괄호 안에 적는다.

// key가 변수에 담겨 있을 때 반드시 대괄호 표기법을 써야 한다.
const prop = 'name';
console.log(dog.prop); // undefined 'prop'라는 프로퍼티 키를 찾으려고 함
console.log(dog[prop]); // dog['name'] -> 김삐

