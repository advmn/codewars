package kyu8;

public class NoZerosForHeros {
    public static int noBoringZeros(int n) {

        while (n != 0 && n % 10 == 0) {
            n /= 10;
        }
        return n;
    }
}

