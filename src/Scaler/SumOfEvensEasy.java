package Scaler;

import java.util.Scanner;

public class SumOfEvensEasy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int N = A/2;
        System.out.println(N * (N + 1));
    }
}
