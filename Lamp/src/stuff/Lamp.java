package stuff;

import java.awt.*;

public class Lamp {
    private Color color;
    private String firm;
    private int power;
    private boolean isEco;
    private LampSize size;

    {
        color = Color.BLUE;
        firm = "EuroLamp";
        power = 40;
        isEco = true;
        size = LampSize.E27;
    }

    public Lamp() {
        System.out.println(color);
        System.out.println(firm);
        System.out.println(power);
        System.out.println(isEco);
        System.out.println(size);

    }

    public Lamp(int power) {
        this.power= power;
        System.out.println(color);
        System.out.println(firm);
        System.out.println(this.power);
        System.out.println(isEco);
        System.out.println(size);

    }
}
