package Scaler;

import java.util.Scanner;

public class EasyPower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        System.out.println(power(A, B));
    }

    public static int power(int base, int power){
        if (base ==  0) {
            return 0;
        }
        if (power == 0){
            return 1;
        }
        int half = power (base, power/2);
        if ((power & 1) == 0 ){
            return half * half;
        } else {
            return half * half * base;
        }
    }
}
