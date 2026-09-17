// 객체 배열
const students = [
    { name: '홍길동', score: 90 },
    { name: '권판다', score: 80 },
    { name: '유관순', score: 95 }
];
// 인덱스로 프로퍼티 값을 불러온다.
console.log(students[0].name);  // 홍길동

// for문으로 이름 출력
for (let i = 0; i < students.length; i++) {     // students.length는 현재 3이라는 숫자열 타입이다.
    console.log(students[i].name);
}

// forEach 메서드 사용 - 배열 요소 하나씩 전달받기
students.forEach(student => {      // forEach가 객체의 요소들을 받아와 인수로서 students에 넣어준다. forEach 함수에 소괄호에 들어간 콜백함수를 호출한다.
    console.log(student.name);     // 매개변수 students에 배열에 있는 요소를 불러와 출력
});

// forEach()는 콜백을 호출할 때 현재 요소와 현재 인덱스를 전달해준다.
students.forEach((student, index) => {
    console.log((index + 1) + '번째 이름: ' + student.name);
});

// <forEach는 콜백에서 반환한 값을 저장하지 않고 undefined로 출력한다. 반환한 결과는 직접 호출해서 사용해야한다.>
// forEach는 콜백함수의 반환값을 모아주지 않는다. forEach의 반환값은 undefined이다
const ignoredNames = students.forEach(student => student.name);
console.log(ignoredNames);      // undefined


// map: 각 요소를 콜백의 반환값으로 바꾼 결과를 새 배열로 만들어 준다.
const studentNames = students.map(student => student.name);
console.log(studentNames);  // [ '홍길동', '권판다', '유관순' ]

// 원본 배열에 영향을 주지는 않는다.
console.log(students[0]);   // { name: '홍길동', score: 90 }

//점수에 5점을 더하여 배열로 반환받기
const adjustedScores = students.map(student => {
    return student.score + 5;
})
console.log(adjustedScores);