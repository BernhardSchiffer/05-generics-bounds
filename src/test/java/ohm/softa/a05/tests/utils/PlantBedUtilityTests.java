package ohm.softa.a05.tests.utils;

import ohm.softa.a05.PlantBed;
import ohm.softa.a05.collections.SimpleList;
import ohm.softa.a05.model.Flower;
import ohm.softa.a05.model.PlantColor;
import ohm.softa.a05.utils.PlantBedUtility;
import org.junit.jupiter.api.Test;

import java.util.Iterator;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class PlantBedUtilityTests {

    @Test
    void testSplitByPlantColor() {
        PlantBed<Flower> flowers = new PlantBed<>();
        flowers.addPlant(new Flower(3.5, "weq", "aasdf", PlantColor.RED));
        flowers.addPlant(new Flower(4.5, "weq", "aasdf", PlantColor.BLUE));
        flowers.addPlant(new Flower(3, "weq", "aasdf", PlantColor.YELLOW));
        flowers.addPlant(new Flower(2, "weq", "aasdf", PlantColor.ORANGE));

        Map<PlantColor, SimpleList<Flower>> result = PlantBedUtility.splitBedByColor(flowers);

        Iterator<Map.Entry<PlantColor, SimpleList<Flower>>> i = result.entrySet().iterator();

        while (i.hasNext()) {
            Map.Entry<PlantColor, SimpleList<Flower>> pair = i.next();

            SimpleList<Flower> list = pair.getValue();
            PlantColor pc = pair.getKey();
            if (pc != PlantColor.GREEN) {
                assertEquals(1, list.size());
            }
            else {
                assertEquals(0, list.size());
            }

            for (Flower f : list) {
                assertEquals(pc, f.getColor());
            }
        }
    }
}
