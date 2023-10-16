package Scaler;

import java.util.Scanner;

public class FromDownToTop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        while (N > 0){
            System.out.print(N + " ");
            N --;
        }
    }
}
