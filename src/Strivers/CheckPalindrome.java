package Strivers;

import java.util.Scanner;

public class CheckPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        System.out.println(isPalindrome(S));
        System.out.println(isPalindrome(0, S));
    }

    // Iterative Solution
    public static Boolean isPalindrome(String str){
        int start = 0, end = str.length() - 1;
        while (start <= end){
            if (str.charAt(start) != str.charAt(end)){
                return false;
            }
            start ++;
            end --;
        }
        return true;
    }

    // Recursive Solution
    public static Boolean isPalindrome(int start, String str){
        if (start >= str.length() -1){
            return true;
        }
        if (str.charAt(start) != str.charAt(str.length() - 1 - start)){
            return false;
        }
        return isPalindrome(start + 1, str);
    }
}