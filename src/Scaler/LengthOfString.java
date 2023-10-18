package Scaler;

import java.util.Scanner;

public class LengthOfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0){
            String str = sc.next();
            System.out.println(str.length());
            T--;
        }
    }
}
