public class ExitPointOfMatrix {
    public static void main(String[] args) {
        int[][] arr = {
            {0, 0, 0, 1},
            {0, 0, 0, 0},
            {1, 0, 0, 1},
            {0, 1, 1, 0}
        };

        findExitPoint(arr);
    }

    public static void findExitPoint(int[][] arr) {
        int i = 0;
        int j = 0;
        int direction = 0;  // 0 -> East, 1 -> South, 2 -> West, 3 -> North

        while(i >= 0 && i < arr.length && j >= 0 && j < arr[0].length) {
            direction = (direction + arr[i][j]) % 4;

            if(direction == 0) ++j;
            else if(direction == 1) ++i;
            else if(direction == 2) --j;
            else if(direction == 3) --i;
        }

        if(i < 0) ++i;
        else if(i == arr.length) --i;
        else if(j < 0) ++j;
        else if(j == arr[0].length) --j;

        System.out.println("Exit point is " + i + " " + j);
    }
}