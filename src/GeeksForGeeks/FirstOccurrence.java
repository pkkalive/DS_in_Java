package GeeksForGeeks;

public class FirstOccurrence {
    public static void main(String[] args) {
        System.out.println(firstOccurrence(new int[]{5, 10, 10, 15, 20, 20, 20}, 20));
    }

    static int firstOccurrence(int[] nums, int key){
        int left = 0, right = nums.length - 1;
        while (left <= right){
            int mid = (left + right) / 2;
            if (nums[mid] > key){
                right = mid - 1;
            } else if(nums[mid] < key){
                left = mid + 1;
            } else {
                if (mid == 0 || nums[mid] != nums[mid - 1]){
                    return mid;
                } else {
                    right = mid - 1;
                }
            }
        }
        return -1;
    }
}
