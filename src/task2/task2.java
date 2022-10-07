package task2;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите Х:");
        while (!scan.hasNextDouble()) {
            System.out.println("Введите Х:");
            scan.next();
        }
        double x = scan.nextDouble();
        System.out.println("Введите Y:");
        while (!scan.hasNextDouble()) {
            System.out.println("Введите Y:");
            scan.next();
        }
        double y = scan.nextDouble();
        boolean popal = false;
        if (y <= 5 && y > 0) {
            popal = x >= -4 && x <= 4;
        } else {
            if (y <= 0 && y >= -3) {
                popal = x >= -6 && x <= 6;
            } else popal = false;
        }
        System.out.println(popal);
    }
}
