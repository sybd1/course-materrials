// class 함수와 생성자 함수 prototype 형식 생성자 함수도 모두 기능을 동일하다. 문법이 다르다.
// clsss는 한 코드 블럭안에 기능이 들어가 보기 편하다.
// new 없이 호출시 생성자 함수는 오류를 일으킬 수 있지만, 클래시 함수는 Type Error로 원천차단한다.
// 본문 내부가 암묵적으로 strict mode로 실행된다.
class Student {
    // new Student(..)가 실행될 때 자동으로 호출되는 초기화 메서드
    constructor(name, score) {
        this.name = name;
        this.score = score;
    }
    // 객체마다 함수를 새로 만들지 않고
    // Student.prototype에 한 번 만들어 공유한다.
    getInfo() {
        return this.name + ': ' + this.score + '점'
    }
}
// new 없이 호출하면 TypeError가 나온다. 일반 함수가 아닌 생성자 함수로만 호출 가능하다.
const student1 = new Student('홍길동', 80);
const student2 = new Student('유관순', 90);

console.log(student1);  // Student { name: '홍길동', score: 80 }
console.log(student2);  // Student { name: '유관순', score: 90 }
console.log(student1.getInfo());    // 홍길동: 80점
console.log(student2.getInfo());    // 유관순: 90점

student1.score = 85;
console.log(student1.getInfo());    // 홍길동: 85점
console.log(student2.getInfo());    // 유관순: 90점