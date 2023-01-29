package study20230129;

public class Car {

    //변수 - 생성자 - 비지니스메소드 - 갯셋

    private int number;
    private int speed;

    public Car(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void addSpeed(int addSpeedValue) {
        speed += addSpeedValue;
    }

    @Override
    public String toString() {
        return "Car{" +
                "number=" + number +
                ", speed=" + speed +
                '}';
    }
}

