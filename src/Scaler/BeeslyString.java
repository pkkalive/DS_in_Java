package Scaler;

import java.util.Scanner;

public class BeeslyString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        System.out.println(canMakeEmpty(A));
    }

    public static int canMakeEmpty(String s){
        int count_P = 0, count_A = 0, count_M = 0;
        for (char str: s.toCharArray()) {
            if (str == 'p'){
                count_P ++;
            }
            if (str == 'a'){
                count_A ++;
            }
            if (str == 'm'){
                count_M ++;
            }
        }
        return (count_A + count_P) ==  count_M ? 1: 0;
    }
}
