# 숫자 야구 게임
## 진행 방법
* 숫자 야구 게임 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 과제를 제출한다.

## 과제 제출 과정
* [과제 제출 방법](https://github.com/next-step/nextstep-docs/tree/master/precourse)


## 게임 설명
* 기본적으로 1부터 9까지 서로 다른 수로 이루어진 3자리의 수를 맞추는 게임이다.
* 같은 수가 같은 자리에 있으면 스트라이크, 다른 자리에 있으면 볼, 같은 수가 전혀 없으면 포볼 또는 낫싱이란 힌트를 얻고, 그 힌트를 이용해서 먼저 상대방의 수를 맞추면 승리한다.
* 위 숫자 야구게임에서 상대방의 역할을 컴퓨터가 한다.
* 컴퓨터는 1에서 9까지 서로 다른 임의의 수 3개를 선택한다.
* 게임 플레이어는 컴퓨터가 생각하고 있는 3개의 숫자를 입력하고, 컴퓨터는 입력한 숫자에 대한 결과를 출력한다.
* 이 같은 과정을 반복해 컴퓨터가 선택한 3개의 숫자를 모두 맞히면 게임이 종료된다.
* 게임을 종료한 후 게임을 다시 시작하거나 완전히 종료할 수 있다.
* 사용자가 잘못된 값을 입력할 경우 [ERROR]로 시작하는 에러 메시지를 출력하고 게임을 계속 진행할 수 있어야 한다.

## 제약사항
* 숫자 야구게임을 실행하는 시작점은 src/main/java 폴더의 baseball.Application의 main()이다.
* 숫자 야구게임은 JDK8버전에서 실행가능해야한다.JDK8에서 정상 동작하지 않을 경우 0점 처리한다.
* JDK에서 기본제공하는 Random,Scanner API 대신 nextstep.utils 패키지에서 제공하는 Randoms, Console API를
  활용해 구현해야 한다.
* Random 값 추출은 nextstep.utils.Randoms의 pickNumberInRange()를 활용한다. 
* 사용자가 입력하는 값은 nextstep.utils.Console의 readLine()을 활용한다. 
* 프로그램 구현을 완료했을 때 src/test/java 폴더의 baseball.ApplicationTest에 있는 2개의 Test Case가 성공해야 한
  다. 
* ApplicationTest에서 제공하는 2개의 Test Case는 숫자 야구게임 구현을 위한 최소한의 Test Case이다. 
* 필수 요구사항은 아니지만 제공하는 소스코드를 참고해 숫자 야구게임을 위한 모든 Test Case를 추가해 보는 것도
  테스트에 대한 좋은 연습이 될 수 있다.
* 자바 코드 컨벤션을 지키면서 프로그래밍한다. https://naver.github.io/hackday-conventions-java/
* indent(인덴트, 들여쓰기) depth를 2가 넘지 않도록 구현한다. 1까지만 허용한다.
    - 예를 들어 while문 안에 if문이 있으면 들여쓰기는 2이다.
    - 힌트: indent(인덴트, 들여쓰기) depth를 줄이는 좋은 방법은 함수(또는 메소드)를 분리하면 된다.
* 자바 8에 추가된 stream api를 사용하지 않고 구현해야 한다. 단, 람다는 사용 가능하다.
* else 예약어를 쓰지 않는다.
    - 힌트: if 조건절에서 값을 return하는 방식으로 구현하면 else를 사용하지 않아도 된다.
    - else를 쓰지 말라고 하니 switch/case로 구현하는 경우가 있는데 switch/case도 허용하지 않는다.
* 함수(또는 메소드)의 길이가 10라인을 넘어가지 않도록 구혆나다.
    - 함수(또는 메소드)가 한 가지 일만 잘 하도록 구현한다.
* 도메인 로직에 단위 테스트를 구현해야 한다. 단, UI(System.out, System.in, Scanner) 로직은 제외
    - 핵심 로직을 구현하는 코드와 UI를 담당하는 로직을 분리해 구현한다.

## 구현할 기능 목록
### 기능 개발
1. 컴퓨터가 1에서 9까지 서로 다른 임의의 수 3개를 선택한다.
2. 사용자가 서로 다른 수 세자리를 입력하도록 한다. 
   - 잘못된 값을 입력한 경우 [ERROR]로 시작하는 에러 메시지를 출력하고 게임을 계속 진행한다.
3. 컴퓨터가 선택한 수와 사용자가 선택한 수가 일치할 때까지 값을 비교한다.
4. 값을 비교하는 동안 사용자가 진행 상황을 알 수 있도록 메시지를 보여준다. (n은 일치하는 숫자의 수이다.)
    - 컴퓨터의 수와 사용자의 수가 일치하고 자리까지 일치할 경우 => n스트라이크
    - 컴퓨터의 수와 사용자의 수가 일치하지만 자리는 다를 경우 => n볼
    - 위의 두 경우가 동시에 적용될 경우 => n스트라이크 n볼
    - 컴퓨터와 수와 사용자의 수가 일치하지 않을 경우 => 낫싱
5. 컴퓨터의 수와 사용자의 수가 일치하면 게임이 종료된다.
    - "3개의 숫자를 모두 맞히셨습니다! 게임 끝" 메시지를 출력한다.
6. 사용자는 게임을 종료한 후 게임을 다시 시작하거나, 완전히 종료할 수 있다.
    - 사용자가 게임 종료여부를 선택할 수 있도록 "게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요." 라는 메시지를 보여준다.
    - 사용자가 1을 입력한 경우 위의 1번부터 다시 시작한다.
    - 사용자가 2를 입력한 경우 종료 메시지를 출력한다.
    - 사용자가 다른 값을 입력한 경우 재선택 메시지를 출력한다.
### 기능 테스트
1. 입력 테스트
    - 사용자가 정상적인 임의의 수 3개를 입력한 경우, 정상동작하는지 확인한다.
    - 사용자가 중복되는 임의의 수 3개를 입력한 경우, 에러메시지를 출력하는지 확인한다.
    - 사용자가 1~9까지의 숫자가 아닌 값을 입력한 경우, 에러메시지를 출력하는지 확인한다.
2. 값 검증 테스트
    - 사용자의 수와 컴퓨터의 수가 일치하지않을 경우, 정상동작하는지 확인한다.
    - 사용자의 수와 컴퓨터의 수가 숫자만 일치할 경우, n볼 메시지를 출력하는지 확인한다.
    - 사용자의 수와 컴퓨터의 수가 일부 숫자와 자리가 일치하고 일부 숫자만 일치할 경우, n스트라이크 n볼 메시지를 출력하는지 확인한다.
    - 사용자의 수와 컴퓨터의 수가 일부만 숫자와 자리가 일치할 경우 n스트라이크 메시지를 출력하는지 확인한다.
    - 사용자의 수와 컴퓨터의 수가 일치할 경우 3개의 숫자를 모두 맞히셨습니다! 게임끝 메시지를 출력하는지 확인한다.
3. 게임 종료 테스트
    - 게임이 종료된 경우, 사용자에게 다시 게임을 시작할지 종료할지 선택하도록 하는지 확인한다.
    - 사용자가 1을 선택한 경우, 게임을 재시작하는지 확인한다.
    - 사용자가 2를 선택한 경우, 게임이 종료되는지 확인한다.
    - 사용자가 1, 2가 아닌 임의의 값을 선택한 경우, 재선택 메시지를 정상적으로 출력하는지 확인한다.