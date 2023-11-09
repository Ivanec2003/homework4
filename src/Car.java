public class Car implements Transport {
    private double speed = 356.5;//km/h

    @Override
    public void start() {
        System.out.println("Car start moving");
    }

    @Override
    public void stop() {
        System.out.println("Car stop moving");
    }

    @Override
    public double getSpeed() {
        return speed;
    }
}
