/**
 * object (객체)
 * 자바스크립트는 객체 기반 프로그래밍 언어로 원시 값을 제외한 나머지 값(함수, 배열 정규 표현식 등)은 모두 객체이다.
 * 객체는 0개 이상의 프로퍼티로 구성 된 집합이며 프로퍼티는 키(key)와 값(value)으로 구성된다.
 */

// 객체 생성(객체 리터럴 방식)
const student = {
    // 키-값 쌍으로 구성 된 프로퍼티
    // 프로퍼티 : 객체의 상태를 나타내는 값
    name: "판다", // key : name, value : 판다
    age: 5,      // key : age, value : 5
    // 메서드: 프로퍼티(상태 데이터)를 참조하고 조작할 수 있는 동작
    getInfo: function() {
        return `${this.name}는 ${this.age}세 입니다.`   // 여기서 this는 나 자신, 즉 student,age라는 이름의 객체이다.
    }
}
console.log(student);