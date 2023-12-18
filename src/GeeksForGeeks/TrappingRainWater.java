package GeeksForGeeks;

public class TrappingRainWater {
    static int maxWater(int[] heights){
        int left = 0, right = heights.length - 1;
        int maxCapacity = 0, leftMax = heights[0], rightMax = heights[heights.length - 1];
        while (left < right){
            if (heights[left] < heights[right]){
                leftMax = Math.max(leftMax, heights[left]);
                maxCapacity += leftMax - heights[left];
                left++;
            } else {
                rightMax = Math.max(rightMax, heights[right]);
                maxCapacity += rightMax - heights[right];
                right--;
            }
        }
        return maxCapacity;
    }

    public static void main(String[] args) {
        System.out.println(maxWater(new int[]{0,1,0,2,1,0,1,3,2,1,2,1}));
        System.out.println(maxWater(new int[]{4,2,0,3,2,5}));
    }
}
