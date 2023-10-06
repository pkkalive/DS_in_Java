package GeeksForGeeks;

import java.util.Scanner;

public class ConvertCelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(cToF(sc.nextInt()));

    }
    public static double cToF(int C){
        return ((C * 9.0) /5.0) + 32;
    }
}
