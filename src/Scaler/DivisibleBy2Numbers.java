package Scaler;

import java.util.Scanner;

public class DivisibleBy2Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        if ( (A % 5) == 0 && (A % 11) ==0 ){
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
