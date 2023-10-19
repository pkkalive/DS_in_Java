package Scaler;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        System.out.println(isPalindrome(S));
    }

    public static boolean isPalindrome(String s){
        int start = 0, end = s.length() - 1;
        char[] s_array = s.toCharArray();
        while (start <= end){
            char temp = s_array[start];
            s_array[start] = s_array[end];
            s_array[end] = temp;
            start ++;
            end --;
        }
        return new String(s_array).equals(s);
    }
}
