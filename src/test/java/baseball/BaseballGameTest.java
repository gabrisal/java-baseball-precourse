package baseball;

import baseball.utils.Validation;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BaseballGameTest {
    @DisplayName("숫자형식이 아닌 문자 입력")
    @Test
    void 숫자형식이_아닌_문자_입력() {
        String number = "asdfg";
        assertThat(Validation.chkUserNumbers(number)).isEqualTo(false);
    }

    @DisplayName("세자리수가 아닌 문자 입력")
    @Test
    void 세자리수가_아닌_문자_입력() {
        String number = "1";
        assertThat(Validation.chkUserNumbers(number)).isEqualTo(false);
        String number2 = "1234";
        assertThat(Validation.chkUserNumbers(number)).isEqualTo(false);
    }

    @DisplayName("중복된 문자 입력")
    @Test
    void 중복된_문자_입력() {
        String number = "111";
        assertThat(Validation.chkUserNumbers(number)).isEqualTo(false);
        String number2 = "122";
        assertThat(Validation.chkUserNumbers(number)).isEqualTo(false);
    }
}
