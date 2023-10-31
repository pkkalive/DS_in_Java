package Scaler;

import java.util.Scanner;

public class PhotoFramePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        printPhotoFramePattern(N);
    }

    public static void  printPhotoFramePattern(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n - 1){
                    System.out.print("*");
                } else if (j == 0 || j == n - 1){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
