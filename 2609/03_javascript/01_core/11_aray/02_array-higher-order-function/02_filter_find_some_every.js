/** filter, find, some, evey 고차함수에 콜백함수를 받는다. */
const students = [
    { name: '홍길동', score: 90 },
    { name: '권판다', score: 80 },
    { name: '유관순', score: 95 }
];

// filter(): 콜백함수의 반환결과가 true인 요소만 모아 새로운 배열로 만듦
const highScorers = students.filter(
    student => student.score >= 85
);
console.log(highScorers);

// find(): 처음으로 조건을 통과한 요소 하나를 반환하고 검색을 끝낸다
const firstHighScorer = students.find(student => student.score >= 85);
console.log(firstHighScorer);

// find로 맞는 요소를 찾지 못하면 undefined를 반환하기 때문에 안정적인 접근을 위해 옵셔널 체이닝 연산자(?.)를 사용할 수 있다.
const firstHighScorerError = students.find(student => student.score >= 100);
console.log(firstHighScorer?.name);

console.log(students.find(student => student.score >= 100));    // undefined
console.log(students.filter(student => student.score >= 100));  // [], 조건을 만족하지 않으면 빈 배열을 반환

// some(): 조건에 맞는 요소가 한 개라도 있는지 확인, 불리언 값 반환
const hasHighScorer = students.some(student => student.score >= 85);
console.log(hasHighScorer);     // true

// every(): 모든 요소가 조건에 만족하는지 확인, 불리언 값 반환
const allHighscorer = students.every(student => student.score >= 85);
console.log(allHighscorer);