package ru.job4j.calculate;

public class X2 {
    public static int calc(int a, int b, int c, int x) {
        return a * x * x + b * x + c;
    }
    public static void main(String[]args){
        int a = 1;
        int b = 1;
        int c = 1;
        int x = 1;
        int rsl = X2.calc(a,b,c,x);
        System.out.println(rsl);
        int a1 = 0;
        int b1 = 1;
        int c1 = 1;
        int x1 = 1;
        int rsl1 = X2.calc(a1,b1,c1,x1);
        System.out.println(rsl1);
        int a2 = 1;
        int b2 = 1;
        int c2 = 0;
        int x2 = 1;
        int rsl2 = X2.calc(a2,b2,c2,x2);
        System.out.println(rsl2);
        int a3 = 1;
        int b3 = 1;
        int c3 = 1;
        int x3 = 0;
        int rsl3 = X2.calc(a3,b3,c3,x3);
        System.out.println(rsl3);
    }
}
