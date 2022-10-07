package task5;

public class task5 {
    public static int task5do(int[] arr) {
        int num = arr[0];
        int count = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > num) {
                num = arr[i];
            } else {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(task5.task5do(new int[]{1, 2 , 3, 10, 4, 5, 6}));
    }
}
