package study20230209.car;

public class JapanCar extends AbstractCar {
    private static final int LIMIT_SPEED = 70;

    @Override
    public void move(int input) {
        this.speed = Math.min(input, LIMIT_SPEED);
        if (input < 0) {
            this.speed = 0;
        }
    }
}
