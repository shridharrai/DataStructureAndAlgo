public class ShellRotate {
    public static void main(String[] args) {
        int[][] arr = {
            {11, 12, 13, 14, 15, 16},
            {21, 22, 23, 24, 25, 26},
            {31, 32, 33, 34, 35, 36},
            {41, 42, 43, 44, 45, 46},
            {51, 52, 53, 54, 55, 56},
            {61, 62, 63, 64, 65, 66}
        };
        int shell = 2;
        int k = 1;

        int[] shellArr = getShell(arr, shell);
        rotateArr(shellArr, k);
        fillShell(arr, shellArr, shell);
        
        displayArr(arr);
    }

    public static void displayOneDArr(int[] arr) {
        for(int i = 0; i < arr.length; ++i) {
            System.out.print(arr[i] + "\t");
        }
    }

    public static int[] getShell(int[][] arr, int shell) {
        int minr = shell - 1;
        int minc = shell - 1;
        int maxr = arr.length - shell;
        int maxc = arr[0].length - shell;
        int size = (2 * (maxr - minr)) + (2 * (maxc - minc));
        int[] shellArr = new int[size];
        int index = 0;

        //left wall
        for(int i = minr, j = minc; i <= maxr; ++i) {
            shellArr[index] = arr[i][j];
            ++index;
        }
        minc++;

        //bottom wall
        for(int i = maxr, j = minc; j <= maxc; ++j) {
            shellArr[index] = arr[i][j];
            ++index;
        }
        --maxr;

        //right wall
        for(int i = maxr, j = maxc; i >= minr; --i) {
            shellArr[index] = arr[i][j];
            ++index;
        }
        --maxc;

        //top wall
        for(int i = minr, j = maxc; j >= minc; --j) {
            shellArr[index] = arr[i][j];
            ++index;
        }

        return shellArr;
    }

    public static void fillShell(int[][] arr, int[] shellArr, int shell) {
        int minr = shell - 1;
        int minc = shell - 1;
        int maxr = arr.length - shell;
        int maxc = arr[0].length - shell; 
        int index = 0;

        //left wall
        for(int i = minr, j = minc; i <= maxr; ++i) {
            arr[i][j] = shellArr[index];
            ++index;
        }
        ++minc;

        //bottom wall
        for(int i = maxr, j = minc; j <= maxc; ++j) {
            arr[i][j] = shellArr[index];
            ++index;
        }
        --maxr;

        //right wall
        for(int i = maxr, j = maxc; i >= minr; --i) {
            arr[i][j] = shellArr[index];
            ++index;
        }
        --maxc;

        //top wall
        for(int i = minr, j = maxc; j >= minc; --j) {
            arr[i][j] = shellArr[index];
            ++index;
        }
    }

    public static void rotateArr(int[] arr, int k) {
        k = k % arr.length;

        if(k < 0) k = k + arr.length;

        reverseArr(arr, 0, arr.length - k - 1);
        reverseArr(arr, arr.length - k, arr.length - 1);
        reverseArr(arr, 0, arr.length - 1);
    }

    public static void reverseArr(int[] arr, int startIdx, int endIdx) {
        while(startIdx < endIdx) {
            int temp = arr[startIdx];
            arr[startIdx] = arr[endIdx];
            arr[endIdx] = temp;

            ++startIdx;
            --endIdx;
        }
    }

    public static void displayArr(int[][] arr) {
        for(int i = 0; i < arr.length; ++i) {
            for(int j = 0; j < arr[i].length; ++j) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}