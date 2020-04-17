package ohm.softa.a05;

import ohm.softa.a05.collections.SimpleList;
import ohm.softa.a05.collections.SimpleListImpl;
import ohm.softa.a05.model.Plant;
import ohm.softa.a05.model.PlantColor;

public class PlantBed<T extends Plant> {
    SimpleList<T> plants = new SimpleListImpl<>();


    public void addPlant(T plant) {
        plants.add(plant);
    }

    public int size() {
        return plants.size();
    }

    public SimpleList<T> getPlantsByColor(PlantColor color) {
        SimpleList<T> result = new SimpleListImpl<>();
        /*
        for (T p : plants) {
            if(p.getColor() == color) {
                result.add(p);
            }
        }
        */
        result = plants.filter(p -> p.getColor().equals(color));

        return result;
    }
}
