package task6;

public class task6 {
    public static void task6do(int[] arr) {
        int[][] ans = new int[arr.length][arr.length];
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans.length; j++) {
                ans[i][j] = arr[((i + j) % arr.length)];
            }
        }
        printArray(ans);
    }

    private static void printArray(int[][] arr) {
        for (int[] row: arr
        ) {
            for (int col: row
            ) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        task6.task6do(new int[] {1, 2, 3, 4, 5, 6});
    }
}
