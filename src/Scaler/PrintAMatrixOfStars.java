package Scaler;

import java.util.Scanner;

public class PrintAMatrixOfStars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        for (int i = 1; i <= N; i++){
            for (int j = 1; j <= M ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
