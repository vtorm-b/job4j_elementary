package ru.job4j.condition;

public class LogicNot {

    public boolean isEven(int num) {
        return num % 2 == 0;
    }

    public boolean isPositive (int num) {
        return  num > 0;
    }

    public boolean notEven (int num) {
        return !isEven(num);
    }

    public boolean notPositive (int num) {
        return num < 0;
    }

    public boolean notEvenAndPositive (int num) {
        return notEven(num) && isPositive(num);
    }

    public boolean evenOrPositive (int num) {
        return isEven(num) || notPositive(num);
    }
}

