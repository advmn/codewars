package kyu6;

public class BitCounting {
    public static int countBits(int n){

        int counter = 0;

        while (n != 0) {
            if (n % 2 == 1) ++counter;
            n /= 2;
        }
        return counter;
    }
}

