package GeeksForGeeks;

public class MaximumSumOfK {
    static int maxSum(int[] nums, int K){
        int curSum = 0, maxSum, N = nums.length;
        if (K > N){
            return -1;
        }
        for (int i = 0; i < K; i++) {
            curSum += nums[i];
        }
        maxSum = curSum;
        for (int i = K; i < N; i++) {
            curSum += (nums[i] - nums[i - K]);
            maxSum = Math.max(maxSum, curSum);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        System.out.println(maxSum(new int[]{100, 200, 300, 400}, 2));
        System.out.println(maxSum(new int[]{1, 4, 2, 10, 23, 3, 1, 0, 20}, 4));
        System.out.println(maxSum(new int[]{2, 3}, 3));
    }
}
