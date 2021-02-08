package ru.job4j.condition;

public class Point {
        public static double distance (int x1, int y1, int x2, int y2){
        return Math.sqrt(Math.pow((x2-x1),2) + (Math.pow((y2-y1),2)));


            }
    public static void main (String [] arg ) {
        double result = Point.distance(10,5,2,3);
        System.out.println( "Result (10,5) to (5,3) " + result);
    }
}
