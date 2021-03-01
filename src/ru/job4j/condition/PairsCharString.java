package ru.job4j.condition;

public class PairsCharString {
    public  static boolean check(String l,String r) {
        if (l.length()-1 == r.length()-1) {
            return true;
        }
        return false;
    }
}
