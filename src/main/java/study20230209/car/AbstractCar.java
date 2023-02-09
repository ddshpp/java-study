package study20230209.car;

public abstract class AbstractCar implements Car  {

    protected int speed;

    @Override
    public int getSpeed() {
        return speed;
    }
}
