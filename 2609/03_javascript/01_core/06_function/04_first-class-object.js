// 함수도 값이다
const sayHello = function() {   // <함수도 변수에 담을 수 있다.>
    console.log('안녕하세요~');
}
console.log(typeof sayHello);
sayHello();

// 객체의 프로퍼티 값으로 넣기
const myObject = {
    sayHi: function() {         // <함수를 프로퍼티 값에 넣을 수 있다.>
        console.log('반갑습니다!');
    }
};
console.log(myObject.sayHi);    // function , value를 물어봄
myObject.sayHi();               // 반갑습니다! , 함수를 호출

// 다른 함수에 전달하기, 함수 반환하기
function manager(task, count) {
    console.log(`매니저가 업무를 지시합니다.`);
    for (let i = 0; i < count; i++) {
        task();
    }
    return function() {
        console.log('모든 업무가 완료되었습니다.');
    }
}
const report = manager(sayHello, 3);       // 안녕하세요~
report();
// manager(sayHello());  // undefined가 task로 들어가서 Error가 나왔다.




