package kyu7;

public class AreaOfCircle {
    public static double area(double radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException();
        }

        return Math.PI * Math.pow(radius, 2);
    }
}