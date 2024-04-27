public class WaveTraversal {
    public static void main(String[] args) {
        int[][] arr = {
            {11, 12, 13, 14},
            {21, 22, 23, 24},
            {31, 32, 33, 34}
        };

        traverse(arr);
    }

    public static void traverse(int[][] arr) {
        for(int j = 0; j < arr[0].length; ++j) {
            boolean isEvenCol = j % 2 == 0;
            
            if(isEvenCol) {
                for(int i = 0; i < arr.length; ++i)
                System.out.println(arr[i][j]);
            } else {
                for(int i = arr.length - 1; i >= 0; --i)
                System.out.println(arr[i][j]);
            }
        }
    }
}