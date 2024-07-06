public class PrintMazePathWithJump {
    public static void main(String[] args) {
        printMazePathsWithJumps(1, 1, 3, 3, "");
    }

    public static void printMazePathsWithJumps(int sr, int sc, int dr, int dc, String path) {
        if(sr == dr && sc == dc) {
            System.out.print(path + ", ");
            return;
        }

        // Horizontal option
        for(int i = 1; i <= dc - sc; ++i) printMazePathsWithJumps(sr, sc + i, dr, dc, path + "h" + i);
        // Vertical option
        for(int i = 1; i <= dr - sr; ++i) printMazePathsWithJumps(sr + i, sc, dr, dc, path + "v" + i);
        // Diagonal option
        for(int i = 1; i <= dc - sc && i <= dr - sr; ++i) 
        printMazePathsWithJumps(sr + i, sc + i, dr, dc, path + "d" + i);
    }
}