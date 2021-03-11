package Myproject;
// Дано целое число price — цена 1 кг конфет. Вывести стоимость 1, 2, . . . , 5 кг конфет.

public class BackwardFor {
    public static void main(String[] args) {
        int m = 1;
        int n = 10;
        for (int i = m; i <= n; i++) {
            if (i <= 5) {
                System.out.println(i * n);
            }
        }
    }
}
