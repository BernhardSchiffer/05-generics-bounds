package ohm.softa.a05.model;

public class Shrub extends Plant {

    private PlantColor color;

    public Shrub(double height, String family, String name) {
        super(height, family, name);
        this.color = PlantColor.GREEN;
    }

    @Override
    public PlantColor getColor() {
        return this.color;
    }
}
