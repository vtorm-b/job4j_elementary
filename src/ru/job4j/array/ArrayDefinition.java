package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnumes = new String[100500];
        float[] prices = new float[40];
        System.out.println("Размер массива равен " + ages.length +" "+ surnumes.length +" "+ prices.length);
    }

}