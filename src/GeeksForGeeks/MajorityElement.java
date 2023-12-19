package GeeksForGeeks;

public class MajorityElement {
    static int majorityElementIdx(int[] nums){
        int res = 0, count = 1, N = nums.length;
        for (int i = 1; i < N; i++) {
            if (nums[res] == nums[i]){
                count++;
            } else {
                count--;
            }
            if (count == 0){
                res = i;
                count = 1;
            }
        }
        return res;
    }

    static int majorityElement(int[] nums, int idx){
        int count = 0, N = nums.length;
        for (int num : nums) {
            if (nums[idx] == num) {
                count++;
            }
        }
        return count > N/2 ? nums[idx] : -1;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{3, 3, 4, 2, 4, 4, 2, 4, 4};
        int majorityIdx = majorityElementIdx(nums);
        System.out.println(majorityElement(nums,majorityIdx));
        nums = new int[]{3, 3, 4, 2, 4, 4, 2, 4};
        majorityIdx = majorityElementIdx(nums);
        System.out.println(majorityElement(nums,majorityIdx));
    }

}
