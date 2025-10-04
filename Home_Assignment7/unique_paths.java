package ICP.Home_Assignment7;

import java.util.Arrays;

public class unique_paths {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        for (int[] row : dp) Arrays.fill(row, -1);
        return rec(0, 0, n, m, dp); 
    }

    public static int rec(int r, int c, int n, int m, int[][] dp) {
        // out of bounds
        if (r >= m || c >= n) return 0;

        // base case
        if (r == m - 1 && c == n - 1) return 1;

        if (dp[r][c] != -1) return dp[r][c];

        int a = rec(r + 1, c, n, m, dp);
        int b = rec(r, c + 1, n, m, dp);
        return dp[r][c] = a + b;
    }

}
