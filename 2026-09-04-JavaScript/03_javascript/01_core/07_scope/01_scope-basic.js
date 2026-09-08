/** 스코프 - 변수를 사용할 수 있는 범위 */

function calculateArea(width, height) {
    const area = width * height;
    console.log('함수 안:', area);
    return area;
}

const result = calculateArea(10, 20);
console.log(result);
// console.log(area);
// console.log(width);

const outerValue = "바깥쪽 값";
if (true) { 
    const blcokValue = '블록 안의 값'; 
    console.log(outerValue);    // 블록 안에서 바깥 값은 사용가능하다.
    console.log(blcokValue);
}

// 블록 바깥에서 블록 안의 값은 사용할 수 없다. 에러가 뜬다.
// console.log(blcokValue);