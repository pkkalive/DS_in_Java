package Scaler;

import java.util.Scanner;

public class DiverseCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.nextLine();
        System.out.println(maxCount(A));
    }

    public static int maxCount(String str){
        int alphaCount = 0;
        int digitsCount = 0;
        for (char ch: str.toCharArray()) {
            if (ch >= 48 && ch <= 57 ){
                digitsCount ++;
            } else {
                alphaCount ++;
            }
        }
        return Math.max(alphaCount, digitsCount);
    }
}
