# Spring Core 수업용 Starter Code

Spring Core 라이브 코딩 수업에서 사용하는 시작 코드입니다. 각 챕터는 독립된 Gradle 프로젝트이며, 수업 시간에는 해당 챕터 폴더를 IntelliJ IDEA로 열어 사용합니다.

## 챕터 구성

| 챕터 | 준비된 코드 | 수업에서 작성할 핵심 |
| --- | --- | --- |
| `chap01-ioc-container` | 회원 DTO와 DAO | 객체 직접 생성, XML Bean, Java Config, Component Scan |
| `chap02-dependency-injection` | 계좌 도메인과 Memo 계층 클래스 | 객체 연결, XML·Java Config DI, 계층 조립 |
| `chap03-di-annotation` | 도서 조회 코드, 필드·setter 주입 비교 코드, Pokemon 구현체 | 생성자 주입, Primary, Qualifier, List 주입 |
| `chap04-bean` | 상품·장바구니 클래스와 상품 Bean, 외부 설정 파일 | scope 비교, Life Cycle, 외부 설정값 주입 |
| `chap05-aop` | 회원 조회 기능과 Aspect의 Pointcut | AOP 활성화, Before, Around, 원본 메소드 호출 |

준비 코드에는 정답 위치를 표시하는 `TODO`를 사용하지 않았습니다. 수업 중 강사의 안내에 따라 필요한 코드를 순서대로 작성합니다.

## 프로젝트 열기

1. 저장소를 clone 합니다.
2. IntelliJ IDEA에서 수업할 챕터 폴더를 엽니다.
3. Gradle 프로젝트 가져오기가 완료될 때까지 기다립니다.
4. 각 챕터의 `Application.java`에서 수업을 진행합니다.

## 컴파일 확인

Windows에서는 각 챕터 폴더에서 다음 명령으로 확인할 수 있습니다.

```powershell
.\gradlew.bat compileJava
```

macOS와 Linux에서는 다음 명령을 사용합니다.

```bash
./gradlew compileJava
```

## 참고

- 각 챕터의 시작 코드는 정상적으로 컴파일됩니다.
- 비어 있는 `Application`과 설정 클래스는 수업에서 완성합니다.
- 수업 완성 코드는 이 저장소에 포함하지 않습니다.
