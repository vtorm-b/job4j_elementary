package ru.job4j;


public class Main {
    public static void main(String[] args) {
            int count = 10;
            for (int i = 0; i < count; i++) {
                for (int j = 0; j < count; j++) {
                    if (i == 0 || j == 0 || j == count - 1) {
                        System.out.print("*");
                    } else if (i == j) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println(" ");
            }
        }
    }
