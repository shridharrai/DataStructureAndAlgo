public class SaddlePoint {
    public static void main(String[] args) {
        int[][] arr = {
            {11, 12, 13, 14},
            {21, 22, 23, 24},
            {31, 32, 33, 34},
            {41, 42, 43, 44}
        };

        findSaddlePoint(arr);
    }

    public static void findSaddlePoint(int[][] arr) {
        for(int i = 0; i < arr.length; ++i) {

            // First find minimum in row
            int minInRowIdx = 0;
            for(int j = 0; j < arr[i].length; ++j) {
                if(arr[i][j] < arr[i][minInRowIdx]) {
                    minInRowIdx = j;
                }
            }

            // Now check whether the min of row is max of it's col or not
            boolean isSaddlePoint = true;
            for(int k = 0; k < arr.length; ++k) {
                if(arr[k][minInRowIdx] > arr[i][minInRowIdx]) {
                    isSaddlePoint = false;
                    break;
                }
            }

            if(isSaddlePoint) {
                System.out.println("Saddle point " + arr[i][minInRowIdx]);
                return;
            }
        }

        System.out.println("No Saddle Point");
    }
}