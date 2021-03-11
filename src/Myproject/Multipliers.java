package Myproject;

import javax.crypto.spec.PSource;

public class Multipliers {
    public static void main(String[] args) {
        int n = 7;
        int x = 1;
        int result;
        for(int i = x; i <= n; i++) {
            if(n % i == 0) {
                result = n / i;
            System.out.println(result);
            }
        }
    }
}



