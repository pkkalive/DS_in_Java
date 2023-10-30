package CrackingTheInterview;

import java.util.Scanner;

public class UniqueCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        System.out.println(hasUniqueCharacters(S));
    }

    public static boolean hasUniqueCharacters(String s){
        int len = s.length();
        int checker = 0;
        for (int i = 0; i < len; i++) {
            int val = s.charAt(i) - 'a';
            if ((checker & (1 << val)) > 0){
                return false;
            }
            checker = checker | (1 << val);
        }
        return true;
    }
}
