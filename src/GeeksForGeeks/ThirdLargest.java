package GeeksForGeeks;

public class ThirdLargest {
    private static int thirdLargest(int[] a){
        int firstMax = Integer.MIN_VALUE, secondMax = Integer.MIN_VALUE, thirdMax = Integer.MIN_VALUE;
        for (int num : a) {
            if (num > firstMax) {
                thirdMax = secondMax;
                secondMax = firstMax;
                firstMax = num;
            }
            if (num > secondMax && num != firstMax) {
                thirdMax = secondMax;
                secondMax = num;
            }
            if (num > thirdMax && num != firstMax && num != secondMax){
                thirdMax = num;
            }
        }
        return thirdMax;
    }

    public static void main(String[] args) {
        System.out.println(thirdLargest(new int[]{2, 4, 1, 3, 5}));
    }
}
