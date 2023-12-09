package GeeksForGeeks;

public class RemoveDuplicates {
    static int remove(int[] nums){
        int res = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[res - 1]){
                nums[res] = nums[i];
                res += 1;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(remove(new int[]{10, 20, 20, 20, 30, 30, 30, 40}));
    }
}
