public class AllIndexOfOccurance {
    public static void main(String[] args) {
        int[] arr = {2, 3, 6, 9, 8, 3, 2, 3, 6, 4};
        int ele = 3;

        int[] indices = allIndices(arr, ele, 0, 0);
        for(int index : indices) System.out.println(index);
    }

    public static int[] allIndices(int[] arr, int ele, int index, int foundSoFar) {
        if(index == arr.length) return new int[foundSoFar];

        if(arr[index] == ele) ++foundSoFar;
        int[] indices = allIndices(arr, ele, index + 1, foundSoFar);

        if(arr[index] == ele) indices[foundSoFar - 1] = index;
        return indices;

    }
}