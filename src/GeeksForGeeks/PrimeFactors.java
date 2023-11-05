package GeeksForGeeks;

import java.util.Scanner;

public class PrimeFactors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printPrimeFactors(n);
    }

    public static void printPrimeFactors(int n){
        if (n <= 1){
            System.out.print(0 + " ");
        }
        while (n % 2 == 0){
            System.out.print(2 + " ");
            n = n /2;
        }
        while (n % 3 == 0){
            System.out.print(3 + " ");
            n = n/3;
        }
        for (int i = 5; i * i <= n ; i = i + 6) {
            while (n % i == 0){
                System.out.print(i + " ");
                n = n/i;
            }
            while ((n % (i + 2)) == 0){
                System.out.print(i + " ");
                n = n/(i+2);
            }
        }
        if (n > 3){
            System.out.print(n + " ");
        }
    }
}
