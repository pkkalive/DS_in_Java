package Scaler;

import java.util.Scanner;

public class CategoriseTheNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        if (A > 0){
            System.out.println(1);
        } else if (A < 0) {
            System.out.println(-1);
        } else {
            System.out.println(0);
        }
    }
}
