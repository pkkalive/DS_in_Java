package Scaler;

public class MaxSumContiguousSubarray {
    public static void main(String[] args) {
        System.out.println(maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
    }
    public static int maxSubArray(int[] A){
        int max_sum = Integer.MIN_VALUE, cur_sum = 0;
        for (int num : A){
            cur_sum = cur_sum + num;
            max_sum = Math.max(cur_sum, max_sum);
            if (cur_sum < 0){
                cur_sum = 0;
            }
        }
        return max_sum;
    }
}
