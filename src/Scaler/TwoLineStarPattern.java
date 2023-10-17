package Scaler;

import java.util.Scanner;

public class TwoLineStarPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  N = sc.nextInt();

        for (int i = 1; i <= N ; i++) {
            System.out.print("*");
            for (int j = 1; j <= N - 2 ; j++) {
                if (j > 0){
                    System.out.print(" ");
                }
            }
            System.out.println("*");
        }
    }
}
