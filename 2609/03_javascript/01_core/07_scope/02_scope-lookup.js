const message = '바깥';

function showMessage() {
    const message = '안쪽';     
    console.log(message);   // 안쪽
}
showMessage();
console.log(message);       // 바깥

const outerValue = '바깥쪽 변수';

if(true) {
    const blcokValue = '블록 변수';
    const sayHi = function() {
        const localValue = '함수 지역 변수';
        console.log(outerValue);
        console.log(blcokValue);
        console.log(localValue);
    };
    sayHi();
    // console.log(localValue);     // 바깥에서 안의 값은 사용 불가능
}
// console.log(blcokValue);         // 바깥에서 안의 값은 사용 불가능

const label = '바깥';

function printLabel() {
    console.log(label); // 정의된 위치의 바깥 이름을 찾는다 - 렉시컬 스코프
}
function run() {
    const label = 'run 안쪽';
    printLabel();
}
run();

