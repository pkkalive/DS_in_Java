package Scaler;

import java.util.Scanner;

public class SumOfOddsEasy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int N = ((A - 1)/2) + 1;
        System.out.println(N/2 * (1+A));
    }
}
