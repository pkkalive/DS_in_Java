package Scaler;

import java.util.Scanner;

public class PrintNStars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        for (int i = 0; i < A; i++){
            System.out.print("*");
        }
    }
}
