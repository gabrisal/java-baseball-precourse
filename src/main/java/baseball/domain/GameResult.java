package baseball.domain;

import java.util.List;

public class GameResult {
    private static final int NUMBER_SIZE = 3;

    private int strike = 0;
    private int ball = 0;

    private List<String> computerNumber;
    private String userNumber;

    public GameResult(List<String> computerNumber, String userNumber) {
        this.computerNumber = computerNumber;
        this.userNumber = userNumber;
    }

    public boolean getGameResult() {
        for (int i=0; i<NUMBER_SIZE; i++) {
            chkGameResult(i, userNumber);
        }
        System.out.println(getResultMessage());
        return isGameOver();
    }

    public boolean isGameOver() {
        if (strike == 3) {
            System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 끝");
            return true;
        }
        return false;
    }
    private void chkGameResult(int index, String userNumber) {
        int sameIndex = userNumber.indexOf(computerNumber.get(index));
        if (sameIndex == -1) {
            return;
        }
        if (sameIndex == index) {
            ++strike;
            return;
        }
        ++ball;
        return;
    }

    private String getResultMessage() {
        String message = "";
        if (strike == 0 && ball == 0) {
            return "낫싱";
        }
        if (strike > 0) {
            message += strike + "스트라이크 ";
        }
        if (ball > 0) {
            message += ball + "볼";
        }
        return message.trim();
    }
}
