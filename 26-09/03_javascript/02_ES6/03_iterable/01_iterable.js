// for...of와 iterable
// iterable은 값을 순서대로 하나씩 꺼낼 수 있는 값이다. 배열과 문자열이 대표적이다.

const fruits = ['🍎', '🍌', '🍓'];

// index로 접근해서 요소를 불러오는 방식
for (let i = 0; i < fruits.length; i++) {
    console.log('일반 for문:', i, fruits[i]);
}
// 일반 for문: 0 🍎
// 일반 for문: 1 🍌
// 일반 for문: 2 🍓

// for...of 문. 요소를 직접 불러오는 방식
for (const fruit of fruits) {
    console.log('for...of:', fruit);
}
// for...of: 🍎
// for...of: 🍌
// for...of: 🍓

// 문자열에서는 문자 한 글자씩 가지고 온다.
const message = '안녕';
for (const character of message) {
    console.log('글자', character);
}

// 일반 객체는 iterable이 아니라 TypeError가 발생한다.
// const student = {
//     name: '홍길동',
//     score: 80
// };

// for (const value of student) {
//     console.log(value);     // TypeError: student is not iterable
// }