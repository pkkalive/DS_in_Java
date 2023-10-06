package GeeksForGeeks;

import java.util.Scanner;

public class AbsoluteValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(absolute(sc.nextInt()));
    }
    public static int absolute(int I){
        if (I < 0) {
            return -1 * I;
        }
        return I;
    }
}
