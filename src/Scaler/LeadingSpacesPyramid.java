package Scaler;

import java.util.Scanner;

public class LeadingSpacesPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int i = 1; i <= N ; i++) {
            for (int j = N; j >= 1; j--) {
                if (j > i){
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
