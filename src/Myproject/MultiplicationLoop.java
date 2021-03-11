package Myproject;
//Найти произведение всех целых чисел от a до b включительно

public class MultiplicationLoop {
    public static void main(String []args) {
        int a = 0;
        int b = 2;
        int c = 1;
        for (int i = a; i <= b ; i++) {
            c*=i;
            System.out.println(c);
        }
    }
}
