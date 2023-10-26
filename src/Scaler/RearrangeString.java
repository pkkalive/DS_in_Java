package Scaler;

import java.util.HashMap;
import java.util.Objects;
import java.util.Scanner;

public class RearrangeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.nextLine();
        String B = sc.nextLine();
        System.out.println(solve(A, B));

    }
    public static String solve(String A, String B){
        int len_a = A.length();
        int len_b = B.length();
        if (len_a != len_b){
            return "False";
        }
        HashMap<Character, Integer> a_map = new HashMap<>();
        HashMap<Character, Integer> b_map = new HashMap<>();
        for (int i = 0; i < A.length(); i++){
            a_map.put(A.charAt(i), a_map.getOrDefault(A.charAt(i), 0)+ 1);
        }

        for (int i = 0; i < B.length(); i++){
            b_map.put(B.charAt(i), b_map.getOrDefault(B.charAt(i), 0)+ 1);
        }

        for (int i = 0; i < A.length(); i++){
            char ch = A.charAt(i);
            if (!Objects.equals(a_map.get(ch), b_map.get(ch))){
                return "False";
            }
        }
        return "True";
    }
}
