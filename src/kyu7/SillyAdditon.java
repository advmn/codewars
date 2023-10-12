package kyu7;

public class SillyAdditon {
    public static int add(int x, int y) {
        int t = 0, m = 1;
        while (x != 0 || y != 0) {
            int s = x % 10 + y % 10;
            t += s * m;
            m *= s < 10 ? 10 : 100;
            x /= 10;
            y /= 10;
        }
        return t;
    }
}
