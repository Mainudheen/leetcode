class Solution {
    public boolean satisfiesConditions(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                // Check vertical condition
                if (i + 1 < m && grid[i][j] != grid[i + 1][j]) {
                    return false;
                }

                // Check horizontal condition
                if (j + 1 < n && grid[i][j] == grid[i][j + 1]) {
                    return false;
                }
            }
        }

        return true;
    }
}