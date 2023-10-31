package Scaler;

import java.util.Scanner;

public class HollowInvertedHalfPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        printHollowHalfPyramid(N);
    }

    public static void printHollowHalfPyramid(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                if(i == 0 || j == 0 || j == n - i -1){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
