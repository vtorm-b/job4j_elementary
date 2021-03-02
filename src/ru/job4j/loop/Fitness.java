package ru.job4j.loop;

public class Fitness {
    public static int calc(int ivan, int nic) {
        int month = 0;
        int powIvan = ivan;
        int powNic = nic;
            while (powIvan < powNic) {
            ivan *= 3;
            nic *= 2;
            month++;
            }
        return month;
    }
}


