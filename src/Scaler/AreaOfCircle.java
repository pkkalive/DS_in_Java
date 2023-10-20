package Scaler;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        double area = 3.1416 * A * A;
        System.out.format("%.2f", area);
    }
}
