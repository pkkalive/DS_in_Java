package GeeksForGeeks;

import java.util.Arrays;
import java.util.Scanner;

public class SieveOfEratosthenes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printSieve(n);
    }
    public static void printSieve(int n){
        Boolean[] nums = new Boolean[n+1];
        Arrays.fill(nums, true);
        for (int i = 2; i * i <= n ; i++) {
            if (nums[i]){
                for (int j = i * i; j <= n ; j = j + i) {
                    nums[j] = false;
                }
            }
        }
        for (int i = 2; i < n; i++) {
            if(nums[i]){
                System.out.print(i + " ");
            }
        }
    }
}
