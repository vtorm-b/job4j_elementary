package ru.job4j.convert;

public class Converter {
    public static void main(String[]args){
        int in = 140;
        int expected = 2;
        int out = ru.job4j.converter.Converter.rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 ribles are 2.Test result: " + passed);
        int in1 = 140;
        int expected1 = 16;
        int out1 = ru.job4j.converter.Converter.rubleToDollar(in1);
        boolean passed1 = expected1 == out1;
        System.out.println("140 ribles are 2.Test result: " + passed);
        int in2 = 140;
        int expeced2 = 143360;
        int out2 = ru.job4j.converter.Converter.sizeInfo(140);
        boolean passed2 = expeced2 == out2;
        System.out.println("В 140 килобайтах 143360 байтов. Test result:" + passed2);
        int in3 = 10;
        int expeced3 = 1000;
        int out3 = ru.job4j.converter.Converter.distInfo(10);
        boolean passed3 = expeced3 == out3;
        System.out.println("В 10 метрах 1000 см. Test result: " + passed3);
    }
}
