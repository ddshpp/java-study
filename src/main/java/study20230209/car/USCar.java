package study20230209.car;

public class USCar extends AbstractCar {

    private static final int LIMIT_SPEED = 120;

    public void move(int input) {
        this.speed = Math.min(input, LIMIT_SPEED);
        if (input < 0) {
            this.speed = 0;
        }
    }
}
