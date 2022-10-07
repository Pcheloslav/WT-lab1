package task3;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите Х:");
        while (!scan.hasNextDouble()) {
            System.out.println("Введите Х:");
            scan.next();
        }
        double x = scan.nextDouble();
        System.out.println("Введите H:");
        while (!scan.hasNextDouble()) {
            System.out.println("Введите H:");
            scan.next();
        }
        double h = scan.nextDouble();
        System.out.println("Введите A:");
        while (!scan.hasNextDouble()) {
            System.out.println("Введите A:");
            scan.next();
        }
        double a = scan.nextDouble();
        System.out.println("Введите B:");
        while (!scan.hasNextDouble()) {
            System.out.println("Введите B:");
            scan.next();
        }
        double b = scan.nextDouble();
        double f;
        while (x <= b) {
            if (x < a) {
                x += h;
            } else {
                f = Math.tan(x);
                System.out.printf("|%10f|%10f|\n", x, f);
                x += h;
            }
        }
    }
}
