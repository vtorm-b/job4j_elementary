package Myproject;

public class Array {
    public static void main(String[] args) {
        int[] array = new int [] {1,2,3,4,5};
        for (int i = 0; i < array.length; i++) {
            int temp = array [i];
            array[i] = array[array.length -i-1];
            array[array.length -i-1] = temp;
            System.out.println(i);

        }
    }
}
