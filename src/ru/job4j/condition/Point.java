package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow((x2 - x1), 2) + (Math.pow((y2 - y1), 2)));
            }

    public static void main(String[]arg) {
        /*double result = Point.distance(0, 0, 2, 0);
        System.out.println("Result (0,0) to (2,0) " + result);
        double result1 = Point.distance(0,0,0,2);
        System.out.println("Result (0,0) to (0,2) " + result1);*/
        double result2 = Point.distance(1,0,0,0);
        System.out.println("Result (2,0) to (0,0) " + result2);
           }
 }
