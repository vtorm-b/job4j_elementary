package ru.job4j.type;

import java.util.Scanner;

public class IntType {
    public static void main(String[]args) {
        Scanner in = new Scanner(System.in);
        System.out.println("введите чило: ");
        int value = in.nextInt();
        System.out.println("Вы ввели число: " + value);
    }
}
