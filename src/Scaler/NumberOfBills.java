package Scaler;

import java.util.Scanner;

public class NumberOfBills {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = sc.nextDouble();
        int bill = sc.nextInt();
        System.out.println((int) total/bill);
    }
}
