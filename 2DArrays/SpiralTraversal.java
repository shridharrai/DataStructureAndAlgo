public class SpiralTraversal {
    public static void main(String[] args) {
        int[][] arr = {
            {11, 12, 13, 14, 15},
            {21, 22, 23, 24, 25},
            {31, 32, 33, 34, 35},
            // {41, 42, 43, 44}
        };

        traverse(arr);
    }

    public static void traverse(int[][] arr) {
        int minRow = 0;
        int minCol = 0;
        int maxRow = arr.length - 1;
        int maxCol = arr[0].length - 1;
        int totalElement = arr.length * arr[0].length;
        int count = 0;

        while(count < totalElement) {
            // left wall
            for(int i = minRow, j = minCol; i <= maxRow && count < totalElement; ++i) {
                System.out.println(arr[i][j]);
                count++;
            }
            minCol++;

            // bottom wall
            for(int i = maxRow, j = minCol; j <= maxCol && count < totalElement; ++j) {
                System.out.println(arr[i][j]);
                count++;
            }
            --maxRow;

            // right wall
            for(int i = maxRow, j = maxCol; i >= minRow && count < totalElement; --i) {
                System.out.println(arr[i][j]);
                count++;
            }
            --maxCol;

            // top wall
            for(int i = minRow, j = maxCol; j >= minCol && count < totalElement; --j) {
                System.out.println(arr[i][j]);
                count++;
            }
            minRow++;
        } 
    }
}