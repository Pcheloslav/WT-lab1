package task4;

import static java.lang.Math.sqrt;

public class task4 {
    public static void task4do(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (findIfSimple(arr[i])) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    private static boolean findIfSimple(int num) {
        if (num >= 2) {
            for (int j = 2; j <= sqrt(num); j++) {
                if (num % j == 0) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        task4.task4do(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9});
    }
}
