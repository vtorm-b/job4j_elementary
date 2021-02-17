package ru.job4j.condition;

public class Max {
    public static int max(int left,int rigth){
        int result = left > rigth ? left : rigth;
        return result;

        }
        public static void main(String[]args){
        int rsl = Max.max(4,2);
        System.out.println("Максимальное число = " + rsl);
        }
}
