package Scaler;

import java.util.Scanner;

public class LastOccurrence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        int B = sc.nextInt();
        System.out.println(occurrence(A, B));
    }

    public static int occurrence(String str, int code){
        int ans = -1;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == code){
                ans = i;
            }
        }
        return ans;
    }
}
