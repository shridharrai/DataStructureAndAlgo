public class MatrixMultiplication {
    public static void main(String[] args) {
        int[][] arr1 = {
            {10, 0, 0},
            {0, 1, 20}
        };
        int[][] arr2 = {
            {10, 1, 1, 1},
            {20, 1, 1, 1},
            {3, 2, 0, 30}
        };

        if(arr1[0].length != arr2.length) {
            System.out.println("Invalid input");
            return;
        }

        int[][] product = multiplication(arr1, arr2);
        printArray(product);
    }

    public static int[][] multiplication(int[][] arr1, int[][] arr2) {
        int[][] resArr = new int[arr1.length][arr2[0].length];

        for(int i = 0; i < resArr.length; ++i) {
            for(int j = 0; j < resArr[i].length; ++j) {
                int result = 0;
            for(int k = 0; k < arr1[i].length; ++k) {
                int multiplication = arr1[i][k] * arr2[k][j];
                result += multiplication;
            }
            resArr[i][j] = result;
            }
        }

        return resArr;
    }

    public static void printArray(int[][] arr) {
        System.out.println("Result array is");

        for(int i = 0; i < arr.length; ++i) {
            for(int j = 0; j < arr[i].length; ++j) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}