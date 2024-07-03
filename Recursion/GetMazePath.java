import java.util.ArrayList;

public class GetMazePath {
    public static void main(String[] args) {
        ArrayList<String> paths = getMazePaths2(0, 0, 2, 2);
        System.out.println(paths);
    }

    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
        if(sr == dr && sc == dc) {
            ArrayList<String> basePath = new ArrayList<>();
            basePath.add("");
            return basePath;
        } else if(sr > dr) {
            ArrayList<String> basePath = new ArrayList<>();
            return basePath;
        } else if(sc > dc) {
            ArrayList<String> basePath = new ArrayList<>();
            return basePath;
        }

        ArrayList<String> hPaths = getMazePaths(sr, sc + 1, dr, dc);
        ArrayList<String> vPaths = getMazePaths(sr + 1, sc, dr, dc);

        ArrayList<String> myPaths = new ArrayList<>();
        for(String path : hPaths) myPaths.add("H" + path);
        for(String path : vPaths) myPaths.add("V" + path);
        return myPaths;
    }

    public static ArrayList<String> getMazePaths2(int sr, int sc, int dr, int dc) {
        if(sr == dr && sc == dc) {
            ArrayList<String> basePath = new ArrayList<>();
            basePath.add("");
            return basePath;
        }

        ArrayList<String> hPaths = new ArrayList<>();
        ArrayList<String> vPaths = new ArrayList<>();
        if(sc < dc) hPaths = getMazePaths2(sr, sc + 1, dr, dc);
        if(sr < dr) vPaths = getMazePaths2(sr + 1, sc, dr, dc);

        ArrayList<String> myPaths = new ArrayList<>();
        for(String path : hPaths) myPaths.add("H" + path);
        for(String path : vPaths) myPaths.add("V" + path);
        return myPaths;
    }
}