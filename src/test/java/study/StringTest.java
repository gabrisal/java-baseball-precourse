package study;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StringTest {
    @Test
    @DisplayName("콤마로_연결된_문자열_입력_시_문자로_분리되는지_테스트")
    void split_test_1() {
        assertThat(StringUtils.split("1,2", ",")).contains("1", "2");
        assertThat(StringUtils.split("1,2", ",")).containsExactly("1", "2");
    }
    @Test
    @DisplayName("콤마로_끝나는_문자열_입력_시_문자로_분리되는지_테스트")
    void split_test_2() {
        assertThat(StringUtils.split("1,", ",")).contains("1");
        assertThat(StringUtils.split("1,", ",")).containsExactly("1");
    }
    @Test
    @DisplayName("subString 테스트")
    void subString_테스트() {
        assertThat(StringUtils.removeParentheses("(1,2)")).isEqualTo("1,2");
    }
}
