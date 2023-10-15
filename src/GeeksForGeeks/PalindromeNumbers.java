package GeeksForGeeks;

import java.util.Scanner;

public class PalindromeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int reverse_num = reverse(num);
        if (reverse_num == num){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
    public static int reverse(int org_num){
        int rev_num = 0;
        while (org_num > 0){
            int last_digit = org_num % 10;
            rev_num = rev_num * 10 + last_digit;
            org_num = org_num / 10;
        }
        return rev_num;
    }
}
