public class SearchInSortedMatrix {
    public static void main(String[] args) {
        int[][] arr = {
            {11, 12, 13, 14},
            {21, 22, 23, 24},
            {31, 32, 33, 34},
            {41, 42, 43, 44}
        };
        int ele = 42;

        // findEle(arr, ele);
        findEleOptimised(arr, ele);
    }

    public static void findEle(int[][] arr, int ele) {
        int i = 0;
        int j = arr[0].length - 1;

        while(i < arr.length && j >= 0) {
            if(arr[i][j] == ele) {
                System.out.println("Element found at index " + i + " " + j);
                return;
            } else if(arr[i][j] < ele) {
                ++i;
            } else {
                --j;
            }
        }

        System.out.println("Not Found");
    }

    public static void findEleOptimised(int[][] arr, int ele) {
        int startIdx = 0;
        int endIdx = arr.length - 1;
        int lastCol = arr[0].length - 1;
        int row = -1;

        while(startIdx <= endIdx) {
            int mid = (startIdx + endIdx) / 2;

            if(ele >= arr[mid][0] && ele <= arr[mid][lastCol]) {
                row = mid;
                break;
            }

            if(arr[mid][lastCol] < ele) {
                startIdx = mid + 1;
            } else if(arr[mid][lastCol] > ele) {
                endIdx = mid - 1;
            }
        }

        if(row < 0) {
            System.out.println("Not found");
            return;
        }
        System.out.println("Row is " + row);

        startIdx = 0;
        endIdx = lastCol;
        while(startIdx <= endIdx) {
            int mid = (startIdx + endIdx) / 2;

            if(arr[row][mid] == ele) {
                System.out.println("Column is " + mid);
                break;
            } else if(arr[row][mid] < ele) {
                startIdx = mid + 1;
            } else {
                endIdx = mid - 1;
            }
        }
    }
}