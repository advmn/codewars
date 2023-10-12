package kyu7;

public class SumOfSequence {
    public static int sequenceSum(int start, int end, int step) {
        if (start > end) {
            return 0;
        }

        int sum = 0;
        for (int i = start; i <= end; i += step) {
            sum += i;
        }

        return sum;
    }
}
