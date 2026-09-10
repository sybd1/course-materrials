/** Math 표준 빌트인 객체
 * 수학 계산 기능을 제공하며 new로 만들지 않고 Math.메서드()로 바로 사용한다.
 */

// 1. 반올림.내림.올림
// round() : 소수점 이하를 반올림
console.log(Math.round(3.6));   // 4

// floor() : 주어진 수보다 크지 않은 정수 중 가장 큰 값 반환(내림)
console.log(Math.floor(3.99999999999966346375))   // 3

// ceil() : 주어진 수보다 작지 않은 정수 중 가장 작은 값 반환(올림)
console.log(Math.ceil(3.111111114645654623726))   // 4

// random() : 실행할 때마다 0이상 1미만의 임의의 실수를 반환
const randomValue = Math.random();
console.log(randomValue);

const zeroToNine = Math.floor(randomValue * 10);
console.log(zeroToNine);
const oneToTen = zeroToNine + 1;
console.log(oneToTen);

// 배열에서 무작위 요소 선택
const menus = ['비빔밥', '우동', '김밥'];
const menuIndex = Math.floor(Math.random() * menus.length);
console.log('선택 인덱스', menuIndex);
console.log('추천 메뉴', menus[menuIndex]);

// date
