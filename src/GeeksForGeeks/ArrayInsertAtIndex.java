package GeeksForGeeks;

public class ArrayInsertAtIndex {
    static int[] insertAtIndex(int[] arr, int sizeOfArray, int index, int element) {
        //Your code here, Geeks
        for (int i = sizeOfArray - 1; i > index; i--){
            arr[i] = arr[i - 1];
        }
        arr[index] = element;
        return arr;
    }

    public static void main(String[] args) {
        int[] ans = insertAtIndex(new int[]{1, 2, 3, 4, 5, 0}, 6, 5, 90);
        for (int item: ans){
            System.out.print(item+ " ");
        }
        System.out.println();
        ans = insertAtIndex(new int[]{1, 2, 3, 4, 5, 6, 0}, 7, 2, 95);
        for (int item: ans){
            System.out.print(item+ " ");
        }
    }
}
