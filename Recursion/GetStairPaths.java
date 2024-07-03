import java.util.ArrayList;

public class GetStairPaths {
    public static void main(String[] args) {
        int n = 4;
        ArrayList<String> paths = getStairPaths(n);
        System.out.println(paths);
    }

    public static ArrayList<String> getStairPaths(int n) {
        if(n == 0) {
            ArrayList<String> basePath = new ArrayList<>();
            basePath.add("");
            return basePath;
        } else if(n < 0) {
            ArrayList<String> basePath = new ArrayList<>();
            return basePath;
        }

        ArrayList<String> firstPaths = getStairPaths(n - 1);
        ArrayList<String> secondPaths = getStairPaths(n - 2);
        ArrayList<String> thirdPaths = getStairPaths(n - 3);

        ArrayList<String> myPaths = new ArrayList<String>();
        for(String path : firstPaths) myPaths.add("1" + path);
        for(String path : secondPaths) myPaths.add("2" + path);
        for(String path : thirdPaths) myPaths.add("3" + path);
        return myPaths;
    }
}