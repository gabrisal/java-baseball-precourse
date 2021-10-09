package study;

import java.util.ArrayList;
import java.util.List;

public class StringUtils {
    private final String str;

    public StringUtils(String str) {
        this.str = str;
    }

    public String[] split(String separator) {
        return str.split(separator);
    }
}
