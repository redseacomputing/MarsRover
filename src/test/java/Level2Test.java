import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
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

    @Test
    void newYCoordinatesShouldBe0_96() {
        assertEquals(0.96d, obj.calculateYCoordinatesFrom(1.00d, 1.00d, 30.00d));
    }

    @Test
    void newXCoordinatesShouldBe0_25() {
        assertEquals(0.25d, obj.calculateXCoordinatesFrom(1.00d, 1.00d, 30.00d));
    }


    @Test
    void newXCoordinatesExample2() {
        assertEquals(1.61d, obj.calculateXCoordinatesFrom(2.13d, 4.30d, 23.00d));
    }

    @Test
    void newYCoordinatesExample2() {
        assertEquals(3.87d, obj.calculateYCoordinatesFrom(2.13d, 4.30d, 23.00d));
    }

    @Test
    void newDirectionExample2() {
        assertEquals(45.21d, obj.calculateNewDirectionFrom(2.13d, 4.30d, 23.00d));
    }
    @Test
    void newXCoordinatesExample3() {
        assertEquals(1.06d, obj.calculateXCoordinatesFrom(1.75d, 3.14d, 23.00d));
    }

    @Test
    void newYCoordinatesExample3() {
        assertEquals(2.89d, obj.calculateYCoordinatesFrom(1.75d, 3.14d, 23.00d));
    }

    @Test
    void newDirectionExample3() {
        assertEquals(40.16d, obj.calculateNewDirectionFrom(1.75d, 3.14d, 23.00d));
    }

    @Test
    void newXCoordinatesExample4() {
        assertEquals(9.63d, obj.calculateXCoordinatesFrom(2.7d, 45d, -34.00d));
    }

    @Test
    void newYCoordinatesExample4() {
        assertEquals(0.52d, obj.calculateYCoordinatesFrom(2.7d, 45d, -34.00d));
    }

    @Test
    void newDirectionExample4() {
        assertEquals(-173.81d, obj.calculateNewDirectionFrom(2.7d, 45d, -34.00d));
    }

    @Test
    void newXCoordinatesExample5() {
        assertEquals(1.13d, obj.calculateXCoordinatesFrom(4.2d, -5.3d, 20.00d));
    }

    @Test
    void newYCoordinatesExample5() {
        assertEquals(-5.14d, obj.calculateYCoordinatesFrom(4.2d, -5.3d, 20.00d));
    }

    @Test
    void newDirectionExample5() {
        assertEquals(-24.73d, obj.calculateNewDirectionFrom(4.2d, -5.3d, 20.00d));
    }

    @Test
    void newXCoordinatesExample6() {
        assertEquals(0d, obj.calculateXCoordinatesFrom(9.53d, 8.12d, 0.00d));
    }


    @Test
    void newYCoordinatesExample6() {
        assertEquals(8.12d, obj.calculateYCoordinatesFrom(9.53d, 8.12d, 0.00d));
    }

    @Test
    void newDirectionExample6() {
        assertEquals(0d, obj.calculateNewDirectionFrom(9.53d, 8.12d, 0.00d));
    }
}