package GeeksForGeeks;

public class MaximumSubarraySum {
    static int maxSubarraySum(int[] nums){
        int N = nums.length;
        int max = nums[0], maxTotal = nums[0];
        for (int i = 1; i < N; i++) {
            max = Math.max(max + nums[i], nums[i]);
            maxTotal = Math.max(max, maxTotal);
        }
        return maxTotal;
    }

    public static void main(String[] args) {
        System.out.println(maxSubarraySum(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
        System.out.println(maxSubarraySum(new int[]{5,4,-1,7,8}));
    }
}
