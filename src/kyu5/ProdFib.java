package kyu5;

public class ProdFib {
    public static long[] productFib(long prod) {

        long a = 0;
        long b = 1;

        while (a * b <= prod) {
            if ((a * b) == prod) {
                return new long[]{a, b, 1};
            }

            long counter = a;
            a = b;
            b += counter;
        }

        return new long[]{a, b, 0};
    }
}
