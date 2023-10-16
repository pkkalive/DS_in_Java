package Scaler;

import java.util.Scanner;

public class FromTopToDown {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int i = 1;
        while (i <= N){
            System.out.print(i + " ");
            i ++;
        }
    }
}
