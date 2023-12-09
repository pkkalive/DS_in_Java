package Scaler;

import java.util.Scanner;

public class VeryLargePower {
    public static final long MOD = 1_000_000_007;
    public static long power(long base, long expo){
        long result = 1L;
        while (expo > 0){
            if ((expo & 1) == 1){
                result = (result * base) % MOD;
            }
            base = (base * base) % MOD;
            expo = expo >> 1;
        }
        return result;
    }

    public static long fact(long num){
        if (num == 0){
            return 0;
        }
        if (num == 1){
            return 1;
        }
        long result = 1L;
        while (num > 1){
            result = (result * num) % MOD;
            num = num - 1;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        long B = sc.nextLong();
        System.out.println(power(A, fact(B)));
    }
}
