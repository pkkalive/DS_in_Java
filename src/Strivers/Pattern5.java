package Strivers;

import java.util.Scanner;

public class Pattern5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        printPatter5(N);
    }

    public static void printPatter5(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
