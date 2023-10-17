package Scaler;

import java.util.Scanner;

public class BankAccount2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int balance = sc.nextInt();
        int operations = sc.nextInt();
        while (operations > 0){
            int type = sc.nextInt();
            int amount = sc.nextInt();
            if (type == 1){
                balance = balance + amount;
                System.out.println(balance);
            } else {
                if (amount > balance){
                    System.out.println("Insufficient Funds");
                } else {
                    balance = balance - amount;
                    System.out.println(balance);
                }
            }
            operations--;
        }
    }
}
