package ohm.softa.a05.tests.model;

import ohm.softa.a05.model.Flower;
import ohm.softa.a05.model.PlantColor;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class FlowerTests {
    private final Logger logger = LogManager.getLogger();

    @Test
    void testGreenFlower() {
        logger.info("testing that a green flower can not exist");
        assertThrows(IllegalArgumentException.class, () -> new Flower(3.5, "roses", "test", PlantColor.GREEN));
    }
}
