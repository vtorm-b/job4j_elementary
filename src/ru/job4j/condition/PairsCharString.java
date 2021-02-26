package ru.job4j.condition;

public class PairsCharString {
    public  static boolean check(String l,String r) {
        l = "";
        r = "";
        int rsl1 = l.length()-1;
        int rsl2 = r.length()-1;
        char ch = l.charAt(rsl1);
        char ch1 = r.charAt(rsl2);
        if (ch == ch1) {
            return true;
        }
        return false;
    }
}
