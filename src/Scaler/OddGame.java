package Scaler;

import java.util.Scanner;

public class OddGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int i = 1;
        if ((N & 1) == 0){
            N = N - 1;
        }
        while (i <= N) {
            System.out.print(i + " ");
            i = i + 2;
        }
    }
}
