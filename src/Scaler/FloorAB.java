package Scaler;

import java.util.Scanner;

public class FloorAB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int ans = A/B;

        if ( ans >= 0){
            System.out.println(ans);
        } else {
            System.out.println( ans == (A/B) ? ans : ans - 1);
        }
    }
}
