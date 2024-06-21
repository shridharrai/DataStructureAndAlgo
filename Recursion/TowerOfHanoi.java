public class TowerOfHanoi {
    public static void main(String[] args) {
        int numOfDisks = 3;
        char tower1 = 'A';
        char tower2 = 'B';
        char tower3 = 'C';

        toh(numOfDisks, tower1, tower2, tower3);
    }

    public static void toh(int n, char tower1, char tower2, char tower3) {
        if(n == 0) return;

        toh(n - 1, tower1, tower3, tower2);  // will print the inst. to move n - 1 disks from t1(source) to t3(destination) using t2 as helper
        System.out.println(n + "[" + tower1 + " -> " + tower2 + "]");  // inst. to move nth disk from t1 to t2
        toh(n - 1, tower3, tower2, tower1);  // will print the inst. to move n - 1 disks from t3(source) to t2(destination) using t1 as helper
    }
}