package GeeksForGeeks;

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(printPower(a, b));
    }

    public static int printPower(int base, int power){
        if(base == 0){
            return 0;
        }
        if (power == 0){
            return 1;
        }
        int res = 1;
        while (power > 0){
            if((power & 1) == 1){
                res = res * base;
            }
            power = power >> 1;
            base = base * base;
        }
        return res;
    }
}
