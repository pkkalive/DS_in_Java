package Strivers;

import java.util.Scanner;

public class Pattern4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        printPattern4(N);
    }

    public static void printPattern4(int n){
        for (int i = 1; i <= n ; i++) {
            for (int j = 0; j < i ; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
