package task8;

public class task8 {
    public static void task8do(int[] arr1, int[] arr2) {
        int[] arr3 = new int[arr1.length + arr2.length];
        int num1 = 0;
        int num2 = 0;
        for (int i = 0; i < arr3.length-1; i++) {
            if (arr1[num1] < arr2[num2]) {
                arr3[i] = arr1[num1];
                num1++;

            } else if (arr2[num2] < arr1[num1]) {
                arr3[i] = arr2[num2];
                num2++;
            } else if (arr2[num2] == arr1[num1])
                if (num1 < num2
                ) {
                    arr3[i] = arr1[num1];
                    num1++;
                } else {
                    arr3[i] = arr2[num2];
                    num2++;
                }
        }
        printArray(arr3);
    }

    private static void printArray(int[] arr) {
        for (int el : arr
        ) {
            System.out.print(el + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        task8.task8do(new int[] {1, 2, 3, 4, 8, 10}, new int[] {3, 5, 9, 14});
    }
}
