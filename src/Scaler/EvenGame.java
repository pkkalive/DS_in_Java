package Scaler;

import java.util.Scanner;

public class EvenGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int i = 2;
        if ( (N & 1) == 1){
            N = N - 1;
        }
        while (i <= N){
            System.out.print(i + " ");
            i = i+2;
        }
    }
}
