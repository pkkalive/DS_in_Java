package Scaler;

import java.util.Scanner;

public class TotalBillsValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bill = sc.nextInt();
        int number_of_bills = sc.nextInt();
        System.out.println(bill * number_of_bills);
    }
}
