package ru.job4j.calculator;
import java.util.Scanner;
import java.io.Reader;

public class Fit {
    public static double manWeight(short height) { return   (height - 100) * 1.15; }
    public static double womanWeight(short height) { return (height - 110) * 1.15; }

    public static void main (String [] args ){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите значение роста:\n");
        short height = in.nextShort();
        double man = Fit.manWeight(height), woman = Fit.womanWeight(height);
        System.out.println("Man 187 is " + man + "\nWoman 187 is " + woman);
    }
}