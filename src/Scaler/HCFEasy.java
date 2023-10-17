package Scaler;

import java.util.Scanner;

public class HCFEasy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        System.out.println(gcd(A, B));
    }

    public static int gcd(int a, int b){
        if (b == 0){
            return a;
        }
        return gcd(b, a % b);
    }
}
