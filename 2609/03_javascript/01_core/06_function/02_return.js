// return : 결과를 함수를 호출한 곳으로 돌려준다. 반환.
function add(a, b) {
    // console.log(a + b); // <밖의 인수를 더해 출력만 할 뿐, return을 사용하지 않으면 변수에 값이 담기지 않는다.>
    return a + b;   // 결과값을 <코드 블럭?> 밖으로 던진다
}

const result = add(10, 20); //던진 값을 result 변수에 담는다 <return을 호출해서 add(10, 20)으로 불러오고 result가 결과값을 출력한다.>
console.log(result);    // 30
console.log(result * 2);    // 60

function printAdd(a, b) {
    console.log(a + b);
}
function returnAdd(a, b) {
    return a + b;
}
const printed = printAdd(10, 20);
const returned = returnAdd(10, 20);
console.log('printed', printed);    // printed undefined
console.log('returned', returned);  // returned 30

// 함수의 종료
function sayHello(name) {
    return `${name}님 안녕하세요!`;
    // return을 만나는 순간 함수 실행 끝남, return 아래의 코드는 실행되지 않는다.
    console.log('출력이 되나요?');  // <다른 선언문이나 키워드는?>
}
console.log(sayHello(`유관순`));

// 반환값의 생략
function noReturn() {
    console.log('함수 호출됨');
    return;
}

function emptyFunction() {
    // return문 자체 없음
}

console.log(noReturn());        // undefined
console.log(emptyFunction());   // undefined

// 조기 종료 Early return
function registerUser(nickname) {
    // 1. 조건이 안 맞으면 즉시 종료 (Early Return)
    if (nickname.length < 2) {
        console.log('닉네임이 너무 짧습니다');
        return; // 여기서 함수를 끝냄
    }
    // 2. 위 조건을 통과해야만 실행되는 메인 로직
    console.log(`${nickname}님 환영합니다~`);
}

registerUser('나');
registerUser('권판다');