import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Level1Test {

    Level1 obj;

    @BeforeEach
    void setUp() {
        obj = new Level1();
    }

    @Test
    void shouldReturn2From30() {
        assertEquals(2d, obj.calculateTurnRadiusFrom(1d, 30d));
    }
    
    @Disabled
    @Test
    void From13_76() {
        assertEquals(2d, obj.calculateTurnRadiusFrom(1d, 13.76d));
    }

    @Disabled
    @Test
    void From2_34() {
        assertEquals(2d, obj.calculateTurnRadiusFrom(1d, 2.34d));
    }

    @Disabled
    @Test
    void From90() {
        assertEquals(2d, obj.calculateTurnRadiusFrom(2.45d, 90d));
    }
}

