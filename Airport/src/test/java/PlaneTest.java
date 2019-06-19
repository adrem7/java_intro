import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNotNull;

public class PlaneTest {
    private Plane plane;

    @Before
    public void initObjects() {
        plane = new Plane();
    }

    @Test
    public void objectExists() {
        assertNotNull(plane);
    }

    @Test
    public void planeIsNotFlyingOnCreation() {
        assertEquals(false, plane.flying);
    }

    @Test
    public void planeIsFlyingWhenTakesoff() {
        plane.takes_off();
        assertEquals(true, plane.flying);
    }

    @Test
    public void planeIsNotFlyingWhenLands() {
        plane.takes_off();
        plane.lands();
        assertEquals(false, plane.flying);
    }
}
