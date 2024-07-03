import java.util.ArrayList;

public class GetMazePathsWithJumps {
    public static void main(String[] args) {
        ArrayList<String> paths = getMazePathsWithJumps(1, 1, 3, 3);
        System.out.println(paths);
    }

    public static ArrayList<String> getMazePathsWithJumps(int sr, int sc, int dr, int dc) {
        if(sr == dr && sc == dc) {
            ArrayList<String> basePath = new ArrayList<>();
            basePath.add("");
            return basePath;
        }
        
        ArrayList<String> paths = new ArrayList<>();

        // Horizontal paths
        for(int i = 1; i <= dc - sc; ++i) {
            ArrayList<String> hPaths = getMazePathsWithJumps(sr, sc + i, dr, dc);
            for(String path : hPaths) paths.add("h" + i + path);
        }

        // Vertical paths
        for(int i = 1; i <= dr - sr; ++i) {
            ArrayList<String> vPaths = getMazePathsWithJumps(sr + i, sc, dr, dc);
            for(String path : vPaths) paths.add("v" + i + path);
        }

        // Diagonal paths
        for(int i = 1; i <= dr - sr && i <= dc - sc; ++i) {
            ArrayList<String> dPaths = getMazePathsWithJumps(sr + i, sc + i, dr, dc);
            for(String path : dPaths) paths.add("d" + i + path);
        }

        return paths;
    }
}