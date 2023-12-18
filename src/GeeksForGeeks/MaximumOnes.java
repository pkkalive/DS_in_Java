package GeeksForGeeks;

public class MaximumOnes {
    static int maxOnes(int[] nums){
        int count = 0, maxCount = 0;
        for (int num: nums) {
            if(num == 0){
                count = 0;
            } else {
                count++;
                maxCount = Math.max(maxCount, count);
            }
        }
        return maxCount;
    }

    public static void main(String[] args) {
        System.out.println(maxOnes(new int[]{1, 1, 1, 1}));
        System.out.println(maxOnes(new int[]{0, 0, 0, 0}));
        System.out.println(maxOnes(new int[]{0, 0, 0, 0, 1, 1, 1, 1, 1}));
        System.out.println(maxOnes(new int[]{0, 0, 0, 0, 1, 1, 1, 1, 1, 0, 0, 1, 1}));
    }
}
