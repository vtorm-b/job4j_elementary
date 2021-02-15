package ru.job4j.converter;

public class Converter {
    public static int rubleToEuro(int value1) {
        return value1 / 70;
            }
    public static int rubleToDollar(int value2) {
        return  value2 / 60;
            }
    public static int sizeInfo(int size) { //количество байтов в килобайтах
        return size * 1024;
    }
    public static int distInfo(int dist) { //колличество метров в сантиметрах
        return  dist * 100;
            }
    public static void main(String[] args) {
        int euro = Converter.rubleToEuro(140);
        System.out.println("140 ribles are " + euro + " euro");
        int dollar = Converter.rubleToDollar(140);
        System.out.println("140 rubles are " + dollar + " dollars");
        int size = Converter.sizeInfo(140);
        System.out.println("В 140 килобайтах " + size + " байтов");
        int dist = Converter.distInfo(10);
        System.out.println("В 10 метрах " + dist + " сантиметров");
    }
}






