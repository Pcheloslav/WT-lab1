package task1;

import java.util.Scanner;

public class task1 {
    static double square(double a){
        return a*a;
    }

    public static void main(String[] args) {
        Scanner sc_y = new Scanner(System.in);
        Scanner sc_x = new Scanner(System.in);
        System.out.println("Введите числа x и y:");

        int x = sc_x.nextInt();
        int y = sc_y.nextInt();
        double nom = 1 + square(Math.sin(x+y));
        double denom = 2 + Math.abs(x - (2 * x)/(1+ x*x*y*y));

        double func = nom/denom + x;

        System.out.println("Вы ввели числа " + x + " и " + y);
        System.out.println("Числитель, знаменатель, значение выражения " + nom+" "+denom+" "+func);
        sc_x.close();
        sc_y.close();
    }
}
