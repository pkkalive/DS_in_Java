package GeeksForGeeks;

public class MoveZerosEnd {
    static int[] moveZeros(int[] arr){
        int count = 0, n = arr.length;
        for (int i = 0; i < n; i++) {
            if(arr[i] != 0){
                int temp = arr[i];
                arr[i] = arr[count];
                arr[count] = temp;
                count += 1;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] ans = moveZeros(new int[]{10, 5, 0, 0, 0, 12, 22});
        for (int item: ans) {
            System.out.print(item + " ");
        }
    }
}
