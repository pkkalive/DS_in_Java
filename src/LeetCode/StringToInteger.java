package LeetCode;

import java.util.Scanner;

public class StringToInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        System.out.println(AtoI(S));
    }

    public static int AtoI(String s){
        int ans = 0, sign = 1, len = s.length()-1, i = 0;
        while (i < len && s.charAt(i) == ' ') {
            i++;
        }

        if (i < len && s.charAt(i) == '-'){
            sign = -1;
            i++;
        } else if (i < len && s.charAt(i) == '+'){
            i++;
        }

        while (i <= len){
            int digit = s.charAt(i) - '0';
            if (digit >= 0 && digit <= 9){
                if ((ans > Integer.MAX_VALUE / 10) ||
                        (ans == Integer.MAX_VALUE / 10 && digit > Integer.MAX_VALUE % 10)) {
                    return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                }
                ans = (ans * 10) + digit;
            } else {
                break;
            }
            i++;
        }
        return ans * sign;
    }
}
