package Scaler;

import java.util.Scanner;

public class PalindromicInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        System.out.println(isPalindrome(A));
    }

    public static String isPalindrome(int num){
        int original = num;
        int rev = 0;
        while (num > 0){
            rev = (rev * 10) + (num % 10);
            num = num/10;
        }
        return original == rev ? "Yes" : "No";
    }
}
