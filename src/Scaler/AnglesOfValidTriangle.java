package Scaler;

import java.util.Scanner;

public class AnglesOfValidTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        if ((A + B + C) == 180){
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
