package baseball.utils;

import java.util.HashSet;
import java.util.Set;

public class Validation {

    private Validation() {
    }

    /**
     * 사용자가 입력한 값 체크
     */
    public static boolean chkUserNumbers(String numbers) {
        if (!chkNumberFormat(numbers)) {
            return false;
        }
        if (!chkNumberSize(numbers)) {
            return false;
        }
        if (!chkNumberOverlap(numbers)) {
            return false;
        }
        return true;
    }

    /**
     * 숫자 형식 체크
     */
    public static boolean chkNumberFormat(String numbers) {
        String regExp = "^[1-9]+$";
        if (!numbers.matches(regExp)) {
            System.out.println("[ERROR] 1부터 9까지의 숫자가 아닙니다.");
            return false;
        }
        return true;
    }

    /**
     * 숫자 자리수 체크
     */
    public static boolean chkNumberSize(String numbers) {
        if (numbers.split("").length != 3) {
            System.out.println("[ERROR] 입력한 수의 자릿수가 맞지 않습니다.");
            return false;
        }
        return true;
    }

    /**
     * 숫자 중복 체크
     */
    public static boolean chkNumberOverlap(String numbers) {
        Set userNumberSet = new HashSet();
        for (int i=0; i<numbers.length(); i++) {
            userNumberSet.add(numbers.substring(i, i+1));
        }
        if (userNumberSet.size() != 3) {
            System.out.println("[ERROR] 중복된 숫자가 있습니다.");
            return false;
        }
        return true;
    }

}
