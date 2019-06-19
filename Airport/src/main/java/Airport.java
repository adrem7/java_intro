import java.util.ArrayList;

public class Airport {

    int capacity;
    ArrayList<Plane> hanger = new ArrayList<Plane>();

    public Airport() {
        capacity = 10;
    }

    public void land(Plane plane) {
        hanger.add(plane);
        plane.lands();
    }

    public void take_off(Plane plane) {
        hanger.remove(plane);
        plane.takes_off();
    }
}
