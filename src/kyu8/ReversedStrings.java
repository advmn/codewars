package kyu8;

public class ReversedStrings {
    public static String solution(String str) {

        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        return sb.toString();
    }
}
