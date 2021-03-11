package Myproject;

public class DegreeLoop {
    public static int calculate(int a, int n) {
        int b=a;
        int count = 1;
        while (count != n) {
            b = b * a ;
            count++;
        }
        return b;
    }
}

