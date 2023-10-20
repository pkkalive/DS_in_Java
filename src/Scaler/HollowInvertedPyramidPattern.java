package Scaler;

import java.util.Scanner;

public class HollowInvertedPyramidPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        pattern(N);
    }

    public static void pattern(int N){
        for (int i = N; i >= 1; i--) {
            int spaces = (2 * i) - 2;
            int stars = ((2 * N) - spaces)/2;
            for (int j = 1; j <= stars ; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= spaces ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= stars ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
