package GeeksForGeeks;

public class LargestElement {
    static int largest(int[] nums){
        int max = nums[0];
        for (int num: nums){
            if (num > max){
                max = num;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(largest(new int[]{20, 10, 20, 4, 100}));
    }
}
