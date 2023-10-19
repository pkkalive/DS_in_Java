package Scaler;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class VowelsVSConsonants {
    public static List<Character> vowelsList = Arrays.asList('A','E','I','O','U');
    public static HashSet<Character> vowels = new HashSet<>(vowelsList);
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0){
            String S = sc.next();
            countVC(S);
            T --;
        }
    }

    public static void countVC(String s){
        int vowelsCount = 0, consonantsCount = 0;
        for (int i = 0; i < s.length(); i++) {
            if (vowels.contains(s.charAt(i)) || vowels.contains((char) (s.charAt(i) &~ 32))){
                vowelsCount ++;
            } else {
                consonantsCount ++;
            }
        }
        System.out.println(vowelsCount + " " + consonantsCount);
    }
}
