package Scaler;

import java.util.Scanner;

public class HollowPyramidPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        hollowPattern(N);
    }

    public static void hollowPattern(int N){
        for (int i = 1; i <= N ; i++) {
            int spaces = (2 * i) - 2;
            int stars = ((2 * N) - spaces)/2;
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
