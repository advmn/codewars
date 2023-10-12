package kyu7;

public class X0 {
    public static boolean getXO(String str) {
        int countX = 0;
        int countO = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = Character.toLowerCase(str.charAt(i));
            if (ch == 'x') {
                countX++;
            } else if (ch == 'o') {
                countO++;
            }
        }
        return countX == countO;
    }
}
