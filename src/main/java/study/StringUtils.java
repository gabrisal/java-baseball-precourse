package study;

import java.util.ArrayList;
import java.util.List;

public class StringUtils {


    public static String[] split(String str, String separator) {
        return str.split(separator);
    }

    public static String removeParentheses(String str) {
        int leftPtIdx = str.indexOf("(");
        if (leftPtIdx > -1) {
            str = str.substring(leftPtIdx + 1);
        }
        int rightPtIdx = str.indexOf(")");
        if (rightPtIdx > -1) {
            str = str.substring(0, rightPtIdx);
        }
        return str;
    }

    public static int chartAt(String str, int index) {
        return str.charAt(index);
    }
}
