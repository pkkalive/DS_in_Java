package Strivers;

import java.util.Scanner;

public class Basics {
    public static void main(String[] args) {
        // Input Type 1

        int A = 10;
        long B = 20;

        double X = 55.0;
        float Y = 58;

        String name= "Gopi";
        char n = 'A';

        boolean alpha = true;
        boolean beta = false;

        // Output
        System.out.println(A);
        System.out.println(B);
        System.out.println(X);
        System.out.println(Y);
        System.out.println(name);
        System.out.println(n);
        System.out.println(alpha);
        System.out.println(beta);

        // Input
        Scanner sc = new Scanner(System.in);
        int C = sc.nextInt();
        long D = sc.nextLong();

        double U = sc.nextDouble();
        float V = sc.nextFloat();

        String firstName = sc.nextLine();

        boolean gammma = sc.nextBoolean();

        // Output
        System.out.println(C);
        System.out.println(D);
        System.out.println(U);
        System.out.println(V);
        System.out.println(firstName);
        System.out.println(gammma);

    }
}
