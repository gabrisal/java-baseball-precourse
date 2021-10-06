package baseball;

import baseball.domain.BaseBallGame;
import nextstep.utils.Console;

public class Application {
    public static void main(String[] args) {
        boolean playGame = true;
        do {
            BaseBallGame baseBallGame = new BaseBallGame();
            baseBallGame.playGame();
            String endGame = "";
            while (!endGame.matches("^[1-2]+$")) {
                System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
                endGame = Console.readLine();
            }
            if ("2".equals(endGame)) {
                playGame = false;
            }
        } while (playGame);
    }
}
