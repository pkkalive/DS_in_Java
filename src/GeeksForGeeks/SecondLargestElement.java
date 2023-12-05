package GeeksForGeeks;

public class SecondLargestElement {
    static int secondLargest(int[] nums){
        int second_max = -1, max = nums[0], n = nums.length;
        for (int i = 1; i < n; i++) {
            if(nums[i] > max){
                second_max = max;
                max = nums[i];
            } else if (nums[i] != max && nums[i] > second_max) {
                second_max = nums[i];
            }
        }
        return second_max;
    }

    public static void main(String[] args) {
        System.out.println(secondLargest(new int[]{48, 12, 35, 1, 10, 34, 1, 46}));
    }
}
