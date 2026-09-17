/** array 배열
 * 배열은 객체의 한 종류이다.
 * 관련된 값들을 하나의 목록으로 묶어서 관리한다. 100가지가 넘는 같은 목록의 변수를 선언하지 않고 배열하는 것.
 * 배열 리터럴 방식 array literal
 */

// 인덱스 Index : 배열 안의 위치를 나타내는 번호. 인덱스는 1이 아니라 0부터 0, 1, 2... 순으로 오름차순
const fruits = ['바나나', '복숭아', '키위'];    // fruits 변수 안의 값들은 '요소' 'Element'라고 부른다.
console.log(fruits);        // ['바나나', '복숭아', '키위']
console.log(typeof fruits); // object

// 배열이름[인덱스]
console.log(fruits[1]);     // 복숭아

console.log(fruits[3]);     // undefined 반환
console.log(fruits.length); // 3, 배열을 카운팅하는 객체

fruits[1] = '딸기';
console.log(fruits);        // 배열 안의 요소를 재할당하는 것은 문제없다.

console.log(fruits[0]);
console.log(fruits[1]);
console.log(fruits[2]);

// for문을 활용한 배열 순회
for (let i = 0; i < fruits.length; i++) {
    console.log(fruits[i]);
}

console.log(typeof fruits);
console.log(Array.isArray(fruits));     // 배열인지 확인

