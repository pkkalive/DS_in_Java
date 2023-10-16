package Scaler;

import java.util.Scanner;

public class PrintPerfectSquares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int i = 1;
        while ((i * i) <= A){
            System.out.print((i * i) + " ");
            i++;
        }
    }
}
