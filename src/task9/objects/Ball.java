package task9.objects;

import task9.enums.Color;
import task9.interfaces.Colorable;
import task9.interfaces.Weightable;

public class Ball implements Weightable, Colorable {
    private final Color color;
    private final int weight;

    public Ball(Color color, int weight) {
        this.color = color;
        this.weight = weight;
    }

    @Override
    public int getWeight() {
        return weight;
    }

    @Override
    public Color getColor() {
        return color;
    }
}
