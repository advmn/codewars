package kyu7;

public class VowelCount {
    public static int getCount(String str) {

        int count = str.replaceAll("[^aeiouAEIOU]","").length();

        return count;
    }

    public static class YouAreSquare {
        public static boolean isSquare(int n) {

            for (int i = 0; i < n / 2 + 2; i++)
            {
                if (i * i == n)
                {
                    return true;
                }
            }
            return false;
        }
    }
}
