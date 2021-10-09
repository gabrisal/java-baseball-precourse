package baseball.domain;

import baseball.utils.Validation;
import nextstep.utils.Console;
import nextstep.utils.Randoms;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class BaseBallGame {

    private List<String> computerNumber;

    public BaseBallGame() {
        Set threeNumbers = new LinkedHashSet();
        while (threeNumbers.size() < 3) {
            threeNumbers.add(String.valueOf(Randoms.pickNumberInRange(1, 9)));
        }
        computerNumber = new ArrayList<>(threeNumbers);
    }

    public void playGame() {
        boolean isGameOver = false;

        while (!isGameOver) {
            String userNumber = getValidUserNumber();
            GameResult result = new GameResult(computerNumber, userNumber);
            isGameOver = result.getGameResult();
        }
    }

    /**
     * 사용자 세자리 숫자 받기
     */
    private String getUserInputString() {
        System.out.print("숫자를 입력해주세요 : ");
        return Console.readLine();
    }

    /**
     * 검증된 사용자 입력 값 가져오기
     */
    private String getValidUserNumber() {
        String userNumber = getUserInputString();
        while (!Validation.chkUserNumbers(userNumber)) {
            userNumber = getUserInputString();
        }
        return userNumber;
    }

}
