package Scaler;

import java.util.Scanner;

public class InvertedNumericPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int i = N; i >= 1 ; i--) {
            for (int j = 1; j <= N ; j++) {
                if (j == i){
                    System.out.print(j);
                }
                if (j < i) {
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }
    }
}
