package Scaler;

import java.util.Scanner;

public class IsItPerfect {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0){
            int A = sc.nextInt();
            System.out.println(isPerfect(A));
            T--;
        }
    }

    public static String isPerfect(int num){
        int total = 1;
        for (int i = 2; i * i <= num ; i++) {
            if (num % i == 0){
                if (i * i == num){
                    total = total + i;
                } else {
                    total = total + i + (num/i);
                }
            }
        }
        return total == num ? "YES" : "NO";
    }
}
