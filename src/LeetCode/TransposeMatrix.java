package LeetCode;

public class TransposeMatrix {
    static int[][] transpose(int[][] matrix) {
        int rows = matrix.length, cols = matrix[0].length;
        int[][] newMatrix = new int[cols][rows];

        for (int i = 0; i < cols; i++){
            for (int j = 0; j < rows; j++){
                newMatrix[i][j] = matrix[j][i];
            }
        }
        return newMatrix;
    }

    public static void main(String[] args) {
        int[][] ans = transpose(new int[][]{{1,2,3},{4,5,6},{7,8,9}});
        for (int[] an : ans) {
            for (int j = 0; j < ans[0].length; j++) {
                System.out.print(an[j] + " ");
            }
            System.out.println();
        }
    }
}
