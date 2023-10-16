package Scaler;

import java.util.Scanner;

public class MinOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        if (A <= B){
            System.out.println(A);
        } else {
            System.out.println(B);
        }
    }
}
