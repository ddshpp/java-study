package study20230125;

public class Calculator {

    public static int plus(int a, int b) {
        return (a + b);
    }

    public static int minus(int a, int b) {
        return (a - b);
    }

    public static int multiplication(int a, int b) {
        return (a * b);
    }

    public static double division(double a, double b) {
        if (b == 0.0) {
            throw new IllegalArgumentException();
        }
        return (a / b);
    }
}
