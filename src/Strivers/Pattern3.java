package Strivers;

import java.util.Scanner;

public class Pattern3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        printPattern3(N);
    }

    public static void printPattern3(int n){
        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
