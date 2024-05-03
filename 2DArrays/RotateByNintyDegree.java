public class RotateByNintyDegree {
    public static void main(String[] args) {
        int[][] arr = {
            {5, 1, 9, 11},
            {2, 4, 8, 10},
            {13, 3, 6, 7},
            {15, 14, 12, 16}
        };

        transpose(arr);
        reverseRows(arr);
        display(arr);
    }

    public static void transpose(int[][] arr) {
        for(int i = 0; i < arr.length; ++i) {
            for(int j = i; j < arr[i].length; ++j) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }

    public static void reverseRows(int[][] arr) {
        for(int i = 0; i < arr.length; ++i) {
            int start = 0;
            int end = arr[i].length - 1;

            while(start < end) {
                int temp = arr[i][start];
                arr[i][start] = arr[i][end];
                arr[i][end] = temp;

                ++start;
                --end;
            }
        }
    }

    public static void display(int[][] arr) {
        for(int i = 0; i < arr.length; ++i) {
            for(int j = 0; j < arr[i].length; ++j) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}