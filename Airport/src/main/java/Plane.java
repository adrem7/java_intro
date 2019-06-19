public class Plane {
    boolean flying;

    public Plane() {
        flying = false;
    }

    public void takes_off() {
        flying = true;
    }

    public void lands() {
        flying = false;
    }
}
