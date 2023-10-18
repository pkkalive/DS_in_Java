package Scaler;

import java.util.Scanner;

public class LowToHigh2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        System.out.println(toUpperCase(S));
    }
    public static String toUpperCase(String s){
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            chars[i] = (char) (chars[i] &~ 32);
        }
        return new String(chars);
    }
}
