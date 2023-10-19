package Scaler;

import java.util.Scanner;

public class CopyTheString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        System.out.println(copy(S));
    }

    public static String copy(String s){
        StringBuilder new_S = new StringBuilder();
        for (int i = 0; i < s.length() - 1; i++) {
            new_S.append(s.charAt(i));
        }
        return new_S.toString();
    }
}
