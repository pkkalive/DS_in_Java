package GeeksForGeeks;

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(count(sc.nextInt()));
    }
    public static int count(int num){
        int ans = 0;
        if (num < 0){
            num = -1 * num;
        }
        if (num <= 9 && num >= 0){
            return 1;
        }
        while (num > 0){
            num = num/10;
            ans ++;
        }
        return ans;
    }
}
