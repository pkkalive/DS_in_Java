package Scaler;

import java.util.Scanner;

public class InvertedHalfPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int i = 1; i <= N ; i++) {
            for (int j = N; j >= i ; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
