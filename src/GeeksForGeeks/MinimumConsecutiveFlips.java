package GeeksForGeeks;

public class MinimumConsecutiveFlips {
    static void minGroupFlips(int[] nums){
        int N = nums.length, count = 1;
        for (int i = 1; i < N; i++) {

            if (nums[i] != nums[i -1]){
                if(nums[i] != nums[0]){
                    System.out.print("From " + i + " to ");
                } else {
                    System.out.println(i -1);
                }
            } else {
                count++;
            }
        }
        if (nums[N - 1] != nums[0]){
            System.out.println(N - 1);
        }
        if (count == N){
            System.out.println("Zero Flips");
        }
    }

    public static void main(String[] args) {
        minGroupFlips(new int[]{1, 1, 0, 0, 0, 1});
        minGroupFlips(new int[]{1, 1, 1, 1});
        minGroupFlips(new int[]{0, 0, 0, 0});
        minGroupFlips(new int[]{1, 1, 0, 0});
        minGroupFlips(new int[]{1, 1, 1, 0, 0});
        minGroupFlips(new int[]{1, 0, 1, 0, 1});
        minGroupFlips(new int[]{1, 0, 1, 0, 1, 0});
        minGroupFlips(new int[]{0, 1, 0, 1, 0});
        minGroupFlips(new int[]{0, 1, 0, 1, 0, 1});
    }
}
