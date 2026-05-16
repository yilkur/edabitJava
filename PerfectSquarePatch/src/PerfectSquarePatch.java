public class PerfectSquarePatch {
    public static int[][] squarePatch(int n) {
        int[][] arr = new int[n][n];

        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                arr[row][col] = n;
            }
        }

        return arr;
    }
}
