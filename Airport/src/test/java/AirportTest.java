import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNotNull;

public class AirportTest {
    private Airport airport;
    private Plane plane;
    private Plane plane_2;

    @Before
    public void initObjects() {
        airport = new Airport();
        plane = new Plane();
        plane_2 = new Plane();
    }

    @Test
    public void objectExists() {
        assertNotNull(airport);
    }

    @Test
    public void hangerIsEmpty() {
        ArrayList<Plane> empty_arraylist = new ArrayList<Plane>();
        assertEquals(empty_arraylist,airport.hanger);
    }

    @Test
    public void landingPlaneAddsPlaneToHanger() {
        ArrayList<Plane> test_arraylist = new ArrayList<Plane>();
        test_arraylist.add(plane);
        airport.land(plane);
        assertEquals(test_arraylist,airport.hanger);
    }

    @Test
    public void takeoffPlaneRemovesPlaneFromHanger() {
        ArrayList<Plane> test_arraylist = new ArrayList<Plane>();
        test_arraylist.add(plane_2);
        airport.land(plane);
        airport.land(plane_2);
        airport.take_off(plane);
        assertEquals(test_arraylist,airport.hanger);
    }

    @Test
    public void planeIsToldToLandUsingLand() {
        airport.land(plane);

    }

    @Test
    public void planeIsToldToTakeoffUsingTakeoff() {
        airport.take_off(plane);

    }
}
