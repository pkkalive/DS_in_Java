package Scaler;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        for (int i = 1; i <= B; i++) {
            System.out.println(A + " * " + i + " = " + A * i);
        }
    }
}
