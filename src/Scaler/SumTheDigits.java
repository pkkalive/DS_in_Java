package Scaler;

import java.util.Scanner;

public class SumTheDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(sum(N));
    }
    public static int sum(int num){
        int total = 0;
        while (num > 0){
            total = total + (num % 10);
            num = num /10;
        }
        return total;
    }
}
