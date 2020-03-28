class Solution {
    
    private void discover_island(char[][] grid, boolean[][] visited, int i, int j) {
        visited[i][j] = true;
        
        int[] dx = new int[]{0, -1, 0, 1};
        int[] dy = new int[]{-1, 0, 1, 0};
        int m = grid.length;
        int n = grid[0].length;
        
        for(int k = 0; k < 4; k++) {
            int row = i + dx[k];
            int col = j + dy[k];
            
            if(row >= 0 && col >= 0 && row < m && col < n && grid[row][col] == '1' && !visited[row][col]) {
                discover_island(grid, visited, row, col);
            }
        }
    }
    
    public int numIslands(char[][] grid) {
        if(grid == null || grid.length == 0 || grid[0].length == 0) return 0;
        
        int m = grid.length;
        int n = grid[0].length;
        int num_islands = 0;
        
        boolean visited[][] = new boolean[m][n];
        
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(grid[i][j] == '1' && !visited[i][j]) {
                    // some func that dsicovers the island
                    discover_island(grid, visited, i, j);
                    num_islands++;
                }
            }
        }
        
        return num_islands;
    }
}
    