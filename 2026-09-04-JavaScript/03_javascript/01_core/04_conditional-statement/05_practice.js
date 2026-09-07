// 1단
for (a = 1; a < 10; ++a) {
    console.log(a);
}

// 2단
for (b = 1; b < 20; b++) {     // 반복문: 초기화, 조건식, 증감식
    if (b % 2 === 1) {         // 조건문: 나머지가 1은 홀수
        continue;              // 홀수를 건너뛰고 증감식으로 돌아가 반복한다.
    }
    console.log(b);            // 20미만의 짝수값만 출력
}

// 3단
for (c = 1; c <= 27; ++c) {
    if (c % 3 === 0)
        console.log(c);
}

// 4단
for (d = 1; d <= 36; d++) {
    if (d % 4 === 0)
        console.log(d);
}
//5단
for (e = 1; e <= 45; ++e) {
    if (e % 5 == 0)
        console.log(e);
}

//6단
if (6) {
    console.log(6);
} else if (12) {
    console.log(12);
    else if (18) {
        console.log(18);
    }
}
