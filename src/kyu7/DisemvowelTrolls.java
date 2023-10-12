package kyu7;

public class DisemvowelTrolls {
    public static String disemvowel(String str) {

        return str.replace("A", "").replace("a", "").replace("E", "").replace("e", "").replace("I", "").replace("i", "").replace("O", "").replace("o", "").replace("U", "").replace("u", "");
    }
}
