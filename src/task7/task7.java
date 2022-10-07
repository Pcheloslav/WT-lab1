package task7;

public class task7 {
    public static void task7do(int[] arr) {
        int n = arr.length;
        for (int temp = n / 2; temp > 0; temp /= 2) {
            for (int i = temp; i < n; i += 1) {
                int x = arr[i];
                int j;
                for (j = i; j >= temp && arr[j - temp] > x; j -= temp) {
                    arr[j] = arr[j - temp];
                }
                arr[j] = x;
            }
        }
        printArray(arr);
    }

    private static void printArray(int[] arr) {
        for (int el : arr
        ) {
            System.out.print(el + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        task7.task7do(new int[] {6, 5, 4, 3, 2, 1});
    }
}
