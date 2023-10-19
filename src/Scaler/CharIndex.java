package Scaler;

import java.util.Scanner;

public class CharIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        System.out.println(insertIndex(A));
    }

    public static String insertIndex(String s){
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            stringBuilder.append(s.charAt(i));
            stringBuilder.append(s.charAt(i) - 96);
        }
        return stringBuilder.toString();
    }
}
