/** 배열 메소드 */

// 추가, 제거를 해도 인덱스의 위치는 여전히 첫번째 요소가 0이다.

const food = ['짜장면', '짬뽕', '볶음밥'];

// push: 배열의 끝에 요소를 추가하고, 새 길이(100% 숫자열)를 반환하는 메서드.
const count = food.push('탕수육');
console.log(food);      // ['짜장면', '짬뽕', '볶음밥', '탕수육']
console.log(count);     // 4

// pop: 배열 끝의 요소를 제거하고, 제거한 요소를 반환하는 메서드.
const removed = food.pop();
console.log(removed);

// unshift: 배열의 맨 앞에 요소 추가, 변경 후 길이 반환하는 메서드.
food.unshift('유산슬');
console.log(food);      // ['유산슬', '짜장면', '짬뽕', '볶음밥']

// shift(): 배열의 맨 앞 요소 제거, 제거한 요소 반환
food.shift();
console.log(food);      // ['짬뽕', '볶음밥', '탕수육']

const foodList = ['물회', '삼계탕', '냉면', '수박', '물회'];

// indexOF('값'): 값이 처음으로 나오는 인덱스 반환
console.log(foodList.indexOf('물회'));  // 0
console.log(foodList.indexOf('야호'));  // 없으면 -1 반환

// includes('값'): 값이 있으면 true, 없으면 false
console.log(foodList.includes('냉면'));     // true
console.log(foodList.includes('다시마'));   // false