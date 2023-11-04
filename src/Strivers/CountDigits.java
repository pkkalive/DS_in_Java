package Strivers;

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(countDigits(n));
    }
    public static int countDigits(int n){
        int count = 0, temp = n;
        while (n > 0){
            int last = n % 10;
            if (last != 0 && temp % last == 0 ) {
                count++;
            }
            n = n/10;
        }
        return count;
    }
}
