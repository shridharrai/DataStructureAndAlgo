public class DiagonalTraversal {
    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };

        traverse(arr);
    }

    public static void traverse(int[][] arr) {
        for(int col = 0; col < arr[0].length; ++col) {
            for(int i = 0, j = col; j < arr[0].length; ++i, ++j) {
                System.out.println(arr[i][j]);
            }
        }
    }
}