/** sort, reduce */

// sort(): 배열 안의 숫자를 오름차순, 내림차순으로 정리할 수 있는 메서드. 원본 값을 바꾼다.
const numbers = [3, 1, 9, 10, 5];

const sorted = numbers.sort();  // 원본 배열을 정렬한다
console.log(sorted);    // [ 1, 10, 3, 5, 9 ]

console.log(sorted === numbers);    // true

// sort는 콜백 함수를 받아서 조건에 맞게 정리한다.
numbers.sort((a, b) =>  a - b);     // 고차함수에 들어갈 콜백함수
/**
 * 반환값 음수 : a를 b보다 앞에 놓는다
 * 반환값 양수 : a를 b보다 뒤에 놓는다
 * 0 : 이 비교 기준에서 같은 순위로 취급한다.
 */
console.log(numbers);   // [ 1, 3, 5, 9, 10 ]

numbers.sort((a, b) =>  b - a);
console.log(numbers);   // [ 10, 9, 5, 3, 1 ]

// reduce
const amounts = [1000, 2000, 3000];

let sum = 0;
// 누적하기: for문 사용
for (let i = 0; i < amounts.length; i++) {
    sum = sum + amounts[i];
}
console.log(sum);   // 6000

// 누적하기: reduce 사용(반환 값을 받아 다음 호출로 넘겨준다) 원본 값을 바꾸진 않는다.
// amounts.reduce(콜백함수, 초기값) 여기서 sum은 누적값, current는 이번에 처리할 배열요소. 0은 초기값을 뜻 한다.
const total = amounts.reduce((sum, current) => {    
    return sum + current;
}, 0);
console.log(total); // 6000
console.log('빈 배열 합계:', [].reduce((sum, current) => sum + current, 0));    // 0

