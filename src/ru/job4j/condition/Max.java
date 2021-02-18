package ru.job4j.condition;

public class Max {
    public static int max(int left,int rigth){
        return left > rigth ? left : rigth;
        }
        public static void main(String[]args){
        int rsl = Max.max(4,2);
        System.out.println("Максимальное число = " + rsl);
        }
}
