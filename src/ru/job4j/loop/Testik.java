package ru.job4j.loop;

public class Testik {
    public static void main(String[] args) {
        int i = 1;

        int j = 1;

        while (i <= 3) {

            System.out.println("i - " + i);

            while (j <= 3) {

                System.out.println(" j - " + j);

                j++;

            }

            i++;

            j = 1;

        }
    }
}
