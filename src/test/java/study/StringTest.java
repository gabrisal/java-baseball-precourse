package study;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StringTest {
    @Test
    @DisplayName("콤마로_연결된_문자열_입력_시_문자로_분리되는지_테스트")
    void 콤마로_연결된_문자열_입력_시_문자로_분리되는지_테스트() {
        StringUtils stringUtils = new StringUtils("1,2");
        assertThat(stringUtils.split(",")).contains("1", "2");
        assertThat(stringUtils.split(",")).containsExactly("1", "2");
    }
    @Test
    @DisplayName("콤마로_끝나는_문자열_입력_시_문자로_분리되는지_테스트")
    void 콤마로_끝나는_문자열_입력_시_문자로_분리되는지_테스트() {
        StringUtils stringUtils = new StringUtils("1,");
        assertThat(stringUtils.split(",")).contains("1");
        assertThat(stringUtils.split(",")).containsExactly("1");
    }
    @Test
    @DisplayName("괄호를_포함한_문자열_입력_시_문자로_분리되는지_테스트")
    void 괄호를_포함한_문자열_입력_시_문자로_분리되는지_테스트() {
        StringUtils stringUtils = new StringUtils("(1,2)");
        assertThat(stringUtils.split(",")).contains("1", "2");
        assertThat(stringUtils.split(",")).containsExactly("1","2");
    }
}
