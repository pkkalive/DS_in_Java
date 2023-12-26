package GeeksForGeeks;

public class ConvertFive {
    private static int convert(int num){
        int ans = 0, multiplier = 1;
        while (num > 0){
            int last = num % 10;
            if ( last == 0){
                last = 5;
            }
            ans += (last * multiplier);
            multiplier *= 10;
            num /= 10;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(convert(1004));
        System.out.println(convert(121));
    }
}
