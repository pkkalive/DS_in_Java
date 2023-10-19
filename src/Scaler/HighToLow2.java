package Scaler;

import java.util.Scanner;

public class HighToLow2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        System.out.println(toLowerCase(S));
    }

    public static String toLowerCase(String s){
        char[] s_array = s.toCharArray();
        for (int i = 0; i < s_array.length; i++){
            s_array[i] = (char) (s_array[i] | 32);
        }
        return new String(s_array);
    }
}
