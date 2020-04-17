package ohm.softa.a05.model;

public class Flower extends Plant {

    private PlantColor color;

    public Flower(double height, String family, String name, PlantColor color) {
        super(height, family, name);
        if(color == PlantColor.GREEN || color == null)
            throw new IllegalArgumentException("The color of a flower can't be green.");
        else
            this.color = color;
    }

    @Override
    public PlantColor getColor() {
        return this.color;
    }
}
