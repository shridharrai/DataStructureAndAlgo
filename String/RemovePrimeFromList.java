import java.util.ArrayList;
import java.util.Arrays;

public class RemovePrimeFromList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(8, 14, 13, 17, 19, 21, 24, 23));

        removePrime(list);

        System.out.println(list);
    }

    public static void removePrime(ArrayList<Integer> list) {
        for(int i = list.size() - 1; i >= 0; --i) {
            int ele = list.get(i);

            if(isPrime(ele)) {
                list.remove(i);
            }
        }
    }

    public static boolean isPrime(int num) {
        for(int i = 2; i * i <= num; ++i) {
            if(num % i == 0) return false;
        }

        return true;
    }
}