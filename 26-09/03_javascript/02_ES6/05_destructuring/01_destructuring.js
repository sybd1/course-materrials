/**
 * 구조 분해 할당 Destructuring
 * 배열이나 객체의 속성을 해체하여 그 값을 개별 변수에 손쉽게 담을 수 있게 하는 표현식
 */

const colors = ['빨강', '파랑'];

const red = colors[0];
const blue = colors[1];

// 배열 구조 분해 할당
const [ primaryColor, secondaryColor ] = colors;
console.log(primaryColor);      // 빨강
console.log(secondaryColor);    // 파랑

// 기본 값 사용
const [leader, assistant = '미정'] = ['홍길동'];

// rest 파라미터 사용
const [first, ...other] = ['유관순', '장보고', '이순신'];
console.log(first);     // 유관순
console.log(other);     // [ '장보고', '이순신' ]

// 객체 구조 분해 할당
const student = {
    name: '유관순',
    age: 16,
    major: '역사'
};

const studentName = student.name;
const studentAge = student.age;
console.log(studentName, studentAge);   // 유관순 16

// 객체 구조분해는 순서가 아니라 property 키 이름으로 값을 찾는다.
const { age, name } = student;
console.log(name, age);     // 유관순 16
// name키의 값을 learnerName 이라는 새 변수에 담는다는 뜻
const { name: learnerName, job = '학생'} = student;
console.log(learnerName);   // 유관순
console.log(job);   // 학생, job이라는 property가 없으면 undefined가 나온다.


const product = {
    name: '키보드',
    price: 70000
}

// function printProduct(product) {

//     const { name, price } = product;
function printProduct({ name, price }) {
    console.log(`상품명: ${name}`);     // 키보드
    console.log(`가격: ${price}원`);    // 70000원
}

printProduct(product);

// 배열 고차 함수의 콜백에서도 사용할 수 있음
const products = [
    { name: '키보드', price: 50000 },
    { name: '마우스', price: 30000 }
]
// 기존방식
const productNames = products.map(product => product.name);
// 객체 구조 분해 할당 적용 (객체 구조 분해 매개변수: 소괄호 필요)
const productNames1 = products.map(({name}) => name);

console.log(productNames);

const product1 = {
    name: '노트북',
    price: 2000000,
    spec: {
        cpu: 'i7',
        ram: '16GB'
    }
}

function printProduct1( {name, price, spec: {cpu}, producer='삼성' }) {
    console.log(`상품 이름: ${name}`);
    console.log(`상품 가격: ${price}`);
    console.log(`CPU: ${cpu}`);
    console.log(`제조사: ${producer}`);
}

printProduct1(product1);