package kyu6;

public class BouncingBalls {

    public static int bouncingBall(double h, double bounce, double window) {

        if (h > 0 && 0 < bounce && bounce < 1 && window < h) {

            int counter = 1;

            double a = h * bounce;

            while (a > window) {
                a *= bounce;
                counter += 2;
            }
            return counter;
        }
        else
        {
            return -1;
        }
    }
}
