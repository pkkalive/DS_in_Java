package Scaler;

import java.util.Scanner;

public class FavouriteChocolate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        System.out.println(Math.min((A / B), C));
    }
}
