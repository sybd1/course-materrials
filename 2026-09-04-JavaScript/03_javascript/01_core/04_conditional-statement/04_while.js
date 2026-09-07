/**
 * 반복문 while
 * 조건이 참인 동안 코드를 반복 실행한다.
 * for문은 반복 횟수가 명확할 때, while문은 반복을 멈출 조건이 더 중요할 때 사용하기 좋다.
 */

let count = 3;

while (count > 0) {
    console.log(count);
    count--;    // 증감식을 적지 않으면 무한반복하게 된다.
}

/** 반복문 do-while
 * 최소 한 번 실행한 후 조건을 검사한다.
 * do {
 *      // 조건에 상관없이 처음 실행할 구문
 * } while (조건)
 */

let number = 4

do {
    console.log(number);
    number++;
} while (number <= 3);