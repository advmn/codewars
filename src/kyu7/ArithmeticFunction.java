package kyu7;

public class ArithmeticFunction {
    public static int arithmetic(int a, int b, String operator) {

        if (operator == "add") {
            return a + b;
        }
        else if (operator == "subtract") {
            return a - b;
        }
        else if (operator == "multiply") {
            return a * b;
        }
        else {
            return a / b;
        }
    }
}
