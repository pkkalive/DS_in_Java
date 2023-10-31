package Scaler;

import java.util.Scanner;

public class DifferentNumberTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        printDifferentNumberTriangle(N);
    }

    public static void printDifferentNumberTriangle(int n){
        for (int i = n; i > 0; i--) {
            int mul = 2;
            for (int j = 1; j < (2 * n); j++) {
                if (j == i){
                    System.out.print(i + " ");
                } else if (j > i && j <= (2 * n) - i){
                    System.out.print((i * mul) + " ");
                    mul ++;
                } else {
                    System.out.print(0 + " ");
                }
            }
            System.out.println();
        }
    }
}
