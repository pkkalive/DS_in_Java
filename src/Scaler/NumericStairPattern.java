package Scaler;

import java.util.Scanner;

public class NumericStairPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 1; i <= N ; i++) {
            for (int j = 1; j <= i ; j++) {
                if (j == i){
                    System.out.print(j);
                } else {
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }
    }
}
