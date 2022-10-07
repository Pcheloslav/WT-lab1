package task9;

import task9.enums.Color;
import task9.objects.Ball;
import task9.objects.Basket;

public class Task9 {
    public static void main(String[] args) {

        var basket = new Basket();
        basket.addBall(new Ball(Color.BLUE, 3));
        basket.addBall(new Ball(Color.GREEN, 1));
        basket.addBall(new Ball(Color.RED, 1));

        System.out.println("weight of basket is: " + basket.getWeight());
        System.out.println("number of blue balls: " + basket.getBlueBallsCount());
    }
}
