package Scaler;

import java.util.Scanner;

public class ConfusionInElectricityBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        double bill = 0;
        if (A <= 50){
            bill =  A * 0.5;
        } else if (A <= 150) {
            bill = (50 * 0.5) + (A - 50) * 0.75;
        } else if (A <= 250) {
            bill = (50 * 0.5) + (100 * 0.75) + ((A - 150) * 1.20);
        } else {
            bill = (50 * 0.5) + (100 * 0.75) + (100 * 1.20) + ((A - 250) * 1.50);
        }
        bill = (bill * 0.2) + bill;
        System.out.println((int) bill);
    }
}
