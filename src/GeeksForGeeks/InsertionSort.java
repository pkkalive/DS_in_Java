package GeeksForGeeks;

public class InsertionSort {
    private static void insertionSort(int[] arr){
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while(j >= 0 && arr[j] > key){
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
        print(arr);
    }

    private static void print(int[] arr){
        for (int num : arr){
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr1 = new int[]{2, 10, 8, 7};
        int[] arr2 = new int[]{2, 1, 4, 3};
        int[] arr3 = new int[]{3, 5, 10, 20, 30, 40};

        //Insertion Sort
        insertionSort(arr1);
        insertionSort(arr2);
        insertionSort(arr3);
    }
}
