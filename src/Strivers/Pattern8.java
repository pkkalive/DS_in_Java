package Strivers;

import java.util.Scanner;

public class Pattern8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        printPattern8(N);
    }
    
    public static void printPattern8(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < (2 * n) - ((2 * i) + 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
