package LeetCode;

import java.util.Scanner;

public class StringToInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        System.out.println(AtoI(S));
    }

    public static int AtoI(String s){
        int ans = 0, multiplier = 1;
        for (int i = s.length() - 1; i >= 0; i--) {
            char
            if (s.charAt(i) >= 48 && s.charAt(i) <= 57) {
                if (s.charAt(i) == '-') {
                    ans = ans * -1;
                } else if (s.charAt(i) == ' ') {
                    break;
                } else {
                    ans = ans + ((s.charAt(i) - '0') * multiplier);
                    multiplier = 10;
                }
            }
        }
        return ans;
    }
}
