public class FloodFill {
    public static void main(String[] args) {
        int row = 4;
        int col = 3;
        int[][] matrix = {
            {0, 1, 1},
            {0, 0, 1},
            {1, 0, 0},
            {0, 1, 0}
        };
        boolean[][] visited = new boolean[row][col];

        floodFill(matrix, 0, 0, visited, "");
    }

    public static void floodFill(int[][] matrix, int row, int col, boolean[][] visited, String path) {
        if(row < 0 || col < 0 || row == matrix.length || col == matrix[0].length 
           || matrix[row][col] == 1 || visited[row][col]) {
            return;
           }

           if(row == matrix.length - 1 && col == matrix[0].length - 1) {
            System.out.println(path);
            return;
           }

        // mark as visited   
        visited[row][col] = true;
        // top
        floodFill(matrix, row - 1, col, visited, path + "t");
        // left
        floodFill(matrix, row, col - 1, visited, path + "l");
        // down
        floodFill(matrix, row + 1, col, visited, path + "d");
        // right
        floodFill(matrix, row, col + 1, visited, path + "r");
        // reset the visited
        visited[row][col] = false;
    }
}