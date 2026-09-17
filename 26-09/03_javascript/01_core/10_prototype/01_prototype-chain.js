// prototype 상속 : 다른 객체의 프로퍼티 가지고 올 수 있다.

const user = {
    id: 'user',
    activate: true,
    login: function() {
        console.log(`${this.id}님이 로그인 되었습니다.`);
    }
};

// const student = {
//     passion: true
// };

// crete: 새로운 빈 객체를 만들고, 그 객체가 프로퍼티를 찾을 때 user도 살펴볼 수 있도록 연결한다
// student의 프로토타입을 user로 설정
const student = Object.create(user);
student.passion = true;

console.log(student.activate);

console.log(student.passion);

// student가 프로토타입으로 연결한 객체 확인
console.log(Object.getPrototypeOf(student));

// hasOwn: student가 activate를 직접 가지고 있는가
console.log('자신의 activate:', Object.hasOwn(student, 'activate'));
console.log('자신의 passion:', Object.hasOwn(student, 'passion'));

// in: activate가 student로 찾아갈 수 있는가
console.log('activate' in student);

const greedyStudent = Object.create(student);
greedyStudent.greed = true;
greedyStudent.id = 'student01';

// prototype 체인을 따라 greedyStudent -> student -> user 순으로 찾아 올라간다.
console.log(greedyStudent.activate);    // true
console.log(greedyStudent.passion);     // true
console.log(greedyStudent.missing);     // undefined

console.log(greedyStudent.id);
console.log(user.id);

// 호출 주체인 점(.)앞의 객체의 this를 참조한다
greedyStudent.login();  // student01님이 로그인 되었습니다.

delete greedyStudent.id;
console.log(greedyStudent.id);  // user
greedyStudent.login();  // user님이 로그인 되었습니다.