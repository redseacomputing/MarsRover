import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Level2Test {

    Level2 obj;

    @BeforeEach
    void setUp() {
        obj = new Level2();
    }

    @Test
    void newDirectionShouldReturn28_65WithDistanceOne() {
        assertEquals(28.65d, obj.calculateNewDirectionFrom(1.00d, 1.00d, 30.00d));
    }
}