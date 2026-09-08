function compareVar() {
    var i = 100;
    for (var i = 0; i < 3; i++) {
        console.log('var 안:', i);  // 0, 1, 2
    }
    console.log('var 밖:', i);      // 3
}
compareVar();   

// let : 블록 범위
function compareLet() {
    let i = 100;
    for (let i = 0; i < 3; i++) {
        console.log('let 안:', i);  // 0, 1, 2
    }
    console.log('let 밖:', i);      // 100
}
compareLet();   

function comapareAssignment() {
    var oldMessage = '처음';
    var oldMessage = '변경';    // 같은 범위에서의 재선언을 허용
    console.log(oldMessage);

    let message = '처음';
    message = '변경';       // 재할당 허용
    console.log(message);
    // let message = '중복';   // 재선언 허용하지 않음

    const greeting = '안녕하세요';
    console.log(greeting);
    // greeting = '안녕히 가세요'; // 재할당 허용 안함
}
comapareAssignment();

function comapareInitialization() {
    console.log('var 선언 전', oldValue);   //
    var oldValue = '준비됨'
    console.log('var 대입 후', oldValue);

    // console.log(value);
    let value;
    console.log('let 선언 후', value);
    value ='준비됨'
    console.log('let 대입 후', value);
}
comapareInitialization();

const student = {
    name: '판다',
    age: 5
};
student.name = '코알라';
console.log('학생 이름:', student.name);
// student = {name: '홍길동', age: 30};

