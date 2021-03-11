//Метод принимает 2 строки, всегда одинаковой длины. Необходимо определить для строки расстояние Хэмминга.
// Для этого в цикле последовательно необходимо сравнивать символы в строке.
// Для извлечения символа из строки используйте метод charAt(int index) класса String.
package Myproject;

public class Hamming {
    public static int checkStrings(String left, String right) {
        int distance = 0;
        for (int i = 0; i < left.length(); i++) {
            if (left.charAt(i) != right.charAt(i)) {
                distance++;
            }
        }
        return distance;
    }
}
