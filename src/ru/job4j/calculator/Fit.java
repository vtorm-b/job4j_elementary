package ru.job4j.calculator;

public class Fit {
    public static double manWeigth (short heigth){
        double rls =  (heigth - 100) * 1.15;
        return rls;
    }
    public static double womanWeigth (short heigth) {
        return (heigth - 110) * 1.15;
    }
    public static void main (String [] args ){
        short heigth = 187;
        double man = Fit.manWeigth(heigth);
        double woman = Fit.womanWeigth(heigth);
        System.out.println("Man 187 is " + man);
        System.out.println("Woman 187 is " + woman);
    }
}