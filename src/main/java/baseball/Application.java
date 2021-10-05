package baseball;

import nextstep.utils.Console;
import nextstep.utils.Randoms;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Application {
    public static void main(String[] args) {
        // TODO 숫자 야구 게임 구현
        // 1. 컴퓨터가 1에서 9까지 서로 다른 임의의 수 3개를 선택한다.
        Set threeNumbers = new LinkedHashSet();
        while(threeNumbers.size() < 3) {
            threeNumbers.add(Randoms.pickNumberInRange(1, 9));
        }
        String computerNumber = threeNumbers.toString();

        // 2. 사용자가 서로 다른 수 세자리를 입력하도록 한다.
        // - 잘못된 값을 입력한 경우 [ERROR]로 시작하는 에러 메시지를 출력하고 게임을 계속 진행한다.
        String userNumber = getUserInputString();
        while(!chkUserNumbers(userNumber)) {
            userNumber = getUserInputString();
        }

        // 3. 컴퓨터가 선택한 수와 사용자가 선택한 수가 일치할 때까지 값을 비교한다.
        // 4. 값을 비교하는 동안 사용자가 진행 상황을 알 수 있도록 메시지를 보여준다. (n은 일치하는 숫자의 수이다.)
        // - 컴퓨터의 수와 사용자의 수가 일치하고 자리까지 일치할 경우 => n스트라이크
        //         - 컴퓨터의 수와 사용자의 수가 일치하지만 자리는 다를 경우 => n볼
        //         - 위의 두 경우가 동시에 적용될 경우 => n스트라이크 n볼
        // - 컴퓨터와 수와 사용자의 수가 일치하지 않을 경우 => 낫싱
        // 5. 컴퓨터의 수와 사용자의 수가 일치하면 게임이 종료된다.
        //         - "3개의 숫자를 모두 맞히셨습니다! 게임 끝" 메시지를 출력한다.
        // 6. 사용자는 게임을 종료한 후 게임을 다시 시작하거나, 완전히 종료할 수 있다.
        //         - 사용자가 게임 종료여부를 선택할 수 있도록 "게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요." 라는 메시지를 보여준다.
        //         - 사용자가 1을 입력한 경우 위의 1번부터 다시 시작한다.
        //         - 사용자가 2를 입력한 경우 종료 메시지를 출력한다.
        // - 사용자가 다른 값을 입력한 경우 재선택 메시지를 출력한다.
    }

    /**
    *   사용자 세자리 숫자 받기
    */
    public static String getUserInputString() {
        System.out.print("숫자를 입력해주세요 : ");
        return Console.readLine();
    }

    /**
    * 사용자가 입력한 값 체크
    */
    public static Boolean chkUserNumbers(String numbers) {
        if(!chkNumberFormat(numbers)) {
            return false;
        }
        if(!chkNumberSize(numbers)) {
            return false;
        }
        if(!chkNumberOverlap(numbers)) {
            return false;
        }
        return true;
    }
    /**
    * 숫자 형식 체크
    */
    public static Boolean chkNumberFormat(String numbers) {
        String regExp = "^[1-9]+$";
        if(!numbers.matches(regExp)) {
            System.out.println("[ERROR] 1부터 9까지의 숫자가 아닙니다.");
            return false;
        }
        return true;
    }

    /**
     * 숫자 자리수 체크
     */
    public static Boolean chkNumberSize(String numbers) {
        if(numbers.split("").length != 3) {
            System.out.println("[ERROR] 입력한 수의 자릿수가 맞지 않습니다.");
            return false;
        }
        return true;
    }

    /**
     * 숫자 중복 체크
     */
    public static Boolean chkNumberOverlap(String numbers) {
        Set userNumberSet = new HashSet();
        for(int i = 0; i < numbers.length(); i++) {
            userNumberSet.add(numbers.substring(i, i+1));
        }
        if(userNumberSet.size() != 3) {
            System.out.println("[ERROR] 중복된 숫자가 있습니다.");
            return false;
        }
        return true;
    }
}
