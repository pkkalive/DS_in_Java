package GeeksForGeeks;

public class SubarrayWithGivenSum {
    static String isSubSum(int[] nums, int sum){
        if (sum == 0) return "No";
        int arrSum = 0, start = 0, end = 0, N = nums.length;
        while (end < N) {
            arrSum += nums[end];
            while (arrSum > sum) {
                arrSum -= nums[start];
                start++;
            }
            if (arrSum == sum) {
                return "Yes";
            }
            end++;
        }
        return "No";
    }
    public static void main(String[] args) {
        System.out.println(isSubSum(new int[]{1, 4, 20, 3, 10, 5}, 33));
        System.out.println(isSubSum(new int[]{1, 4, 0, 0, 3, 10, 5}, 7));
        System.out.println(isSubSum(new int[]{1, 4}, 0));
    }
}
