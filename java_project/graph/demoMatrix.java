package java_project.graph;

public class demoMatrix {
    public static void dfs_mat(int [][]mat, int rows, int cols, int x, int y, boolean[][] visited) {
        // Print the current cell value
        System.out.print(mat[x][y]+"        ");
        
        // Mark the current cell as visited
        visited[x][y] = true;
        
        // Possible moves: right, down, left, up
        int[] dx = {0, 1, 0, -1};
        int[] dy = {1, 0, -1, 0};
        
        // Explore the neighbors
        for (int i = 0; i < 4; i++) {
            int new_x = x + dx[i];
            int new_y = y + dy[i];
            
            // Check if the new position is within bounds and not visited
            if (new_x >= 0 && new_x < rows && new_y >= 0 && new_y < cols && !visited[new_x][new_y]) {
                dfs_mat(mat, rows, cols, new_x, new_y, visited);
            }
        }
    }

    public static void main(String[] args) {
        int[][] mat = {
            {1, 2, 3, 4, 5},
            {2, 3, 4, 5, 6},
            {4, 6, 8, 2, 4},
            {3, 2, 1, 5, 6}
        };
        
        int rows = mat.length;
        int cols = mat[0].length;
        
        // Initialize the visited array
        boolean[][] visited = new boolean[rows][cols];
        
        // Start DFS from the top-left corner (0, 0)
        dfs_mat(mat, rows, cols, 0, 0, visited);
    }
}
