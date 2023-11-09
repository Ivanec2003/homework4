public class Bicycle implements Transport {
    private double speed = 50.4;//km/h

    @Override
    public void start() {
        System.out.println("Bicycle start moving");
    }

    @Override
    public void stop() {
        System.out.println("Bicycle stop moving");
    }

    @Override
    public double getSpeed() {
        return speed;
    }
}
