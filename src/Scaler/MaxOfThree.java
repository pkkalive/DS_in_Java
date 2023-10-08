package Scaler;

import java.util.Scanner;

public class MaxOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        if (C >= B && B >= A){
            System.out.println(C);
        } else if (C >= A && A >= B){
            System.out.println(C);
        } else if (B >= C && C >= A){
            System.out.println(B);
        } else if (B >= A){
            System.out.println(B);
        } else if (C >= B){
            System.out.println(A);
        } else {
            System.out.println(A);
        }
    }
}
