package study20230209.car;

public class ChinaCar extends AbstractCar {

    private static final int LIMIT_SPEED = 100;

    @Override
    public void move(int input) {
        this.speed = Math.min(input, LIMIT_SPEED);
        if (input < 0) {
            this.speed = 0;
        }
    }
}
