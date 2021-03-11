package Myproject;
//Дано целое число a и целое число degree (> 0).
// Найти a в степени degree: a^degree = a·a· . . . ·a
// (числа a перемножаются degree раз).

public class Print0To0 {
    public static void main(String[]args){
        int a =2;
        int n=2;
        int b=a;
        int count = 1;
        while (count != n) { //выполняет пока счетчик не равен степени
            b = a*b; //умножили
            count++; // увеличили счетчик
            System.out.println(b);

        }
    }
}
