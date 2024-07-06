public class PrintMazePath {
    public static void main(String[] args) {
        printMazePaths(1, 1, 3, 3, "");
    }

    public static void printMazePaths(int sr, int sc, int dr, int dc, String path) {
        if(sr == dr && sc == dc) {
            System.out.print(path + ", ");
            return;
        }

        if(sc + 1 <= dc) printMazePaths(sr, sc + 1, dr, dc, path + "H");
        if(sr + 1 <= dr) printMazePaths(sr + 1, sc, dr, dc, path + "V");
    }
}