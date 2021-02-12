package ru.job4j.calculator;

public class MathFunc {
    public static int func1(int x) {
    int a = x * x + 1;
    return a;
    }

    public static double func2(double x) {
    double b = 1 / x;
    return b;
    }

    public static double func3(double x) {
    double z = (1 * x - 0.9);
    return z;
    }

    public static void main(String[]args) {
    int result1 = MathFunc.func1(3);
    double result2 = MathFunc.func2(5);
    double result3 = MathFunc.func3(2);
        double total = result1 + result2 + result3;
        System.out.println(total);
    }
}
