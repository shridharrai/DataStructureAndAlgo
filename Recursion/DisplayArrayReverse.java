public class DisplayArrayReverse {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};

        displayArrReverse(arr, 0);
    }

    public static void displayArrReverse(int[] arr, int idx) {
        if(idx == arr.length) return;

        displayArrReverse(arr, idx + 1);
        System.out.println(arr[idx]);
    }
}