package ohm.softa.a05.tests;

import ohm.softa.a05.PlantBed;
import ohm.softa.a05.collections.SimpleList;
import ohm.softa.a05.model.Flower;
import ohm.softa.a05.model.Plant;
import ohm.softa.a05.model.PlantColor;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlantBedTests {
    private final Logger logger = LogManager.getLogger();

    private PlantBed<Plant> testbed = new PlantBed<>();
    private Flower rose = new Flower(3.5, "roses", "red-rose", PlantColor.RED);
    private Flower tulip = new Flower(5, "tulip", "yellow-tulip", PlantColor.YELLOW);

    @BeforeEach
    void setup() {
        testbed.addPlant(rose);
        testbed.addPlant(tulip);
    }

    @Test
    void testAddPlant() {
        logger.info("testing the add function of PlantBed");
        PlantBed<Plant> plants = new PlantBed<>();
        plants.addPlant(rose);
        assertEquals(1, plants.size());
    }

    @Test
    void testGetPlantsByColor() {
        SimpleList<Plant> result = testbed.getPlantsByColor(PlantColor.YELLOW);

        for(Plant p : result) {
            assertEquals(PlantColor.YELLOW, p.getColor());
        }
    }
}
