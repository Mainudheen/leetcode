class Solution {

    public int numMagicSquaresInside(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;

        if (row < 3 || col < 3) return 0;

        int ans = 0;

        // FIX 1: Proper traversal
        for (int rowst = 0; rowst <= row - 3; rowst++) {
            for (int colst = 0; colst <= col - 3; colst++) {
                if (leftRight(grid, rowst, colst)) {
                    ans++;
                }
            }
        }
        return ans;
    }

    public static boolean leftRight(int[][] grid, int rowst, int colst) {

        // FIX 2: center must be 5
        if (grid[rowst + 1][colst + 1] != 5) return false;

        boolean[] seen = new boolean[10];

        // FIX 3: check numbers 1–9 distinct
        for (int i = rowst; i < rowst + 3; i++) {
            for (int j = colst; j < colst + 3; j++) {
                int val = grid[i][j];
                if (val < 1 || val > 9 || seen[val]) return false;
                seen[val] = true;
            }
        }

        // FIX 4: row & column sum
        for (int i = 0; i < 3; i++) {
            int rowSum = 0, colSum = 0;
            for (int j = 0; j < 3; j++) {
                rowSum += grid[rowst + i][colst + j];
                colSum += grid[rowst + j][colst + i];
            }
            if (rowSum != 15 || colSum != 15) return false;
        }

        // FIX 5: diagonal sum
        int d1 = grid[rowst][colst] + grid[rowst + 1][colst + 1] + grid[rowst + 2][colst + 2];
        int d2 = grid[rowst][colst + 2] + grid[rowst + 1][colst + 1] + grid[rowst + 2][colst];

        if (d1 != 15 || d2 != 15) return false;

        return true;
    }
}
