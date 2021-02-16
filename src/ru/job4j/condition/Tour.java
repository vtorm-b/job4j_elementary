package ru.job4j.condition;

import java.security.SignatureSpi;

public class Tour {
    public static void offer(boolean passport) {
        System.out.println("A client has foreign passport: " + passport );
        if (passport) {
            System.out.println("Tours abroud.");
        } else {
            System.out.println("Tours in Russia.");
        }
    }
    public static void main(String[]args){
    Tour.offer(true);
    Tour.offer(false);
    }
}
