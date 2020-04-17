package ohm.softa.a05.tests.model;

import ohm.softa.a05.model.PlantColor;
import ohm.softa.a05.model.Shrub;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShrubTests {

    private final Logger logger = LogManager.getLogger();

    @Test
    void testColorFullShrub() {
        logger.info("testing that a green flower can not exist");
        Shrub shrub = new Shrub(3.5, "roses", "test");
        assertEquals(PlantColor.GREEN, shrub.getColor());
    }
}
