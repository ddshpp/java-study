package study20230209.car;

public class KoreaCar extends AbstractCar {

    //이렇게 하면 이해하기 좋음 , 80이라고 되어있으면 이게 무슨 숫자인가 고민하게됨, 상단에 변수값만 수정하면 다 적용되니 실수발생 낮아짐
    private static final int LIMIT_SPEED = 80;
    //이렇게 초기화 해주면 객체 생성시 적용됨 + 보기좋음

    @Override
    public void move(int input) {
        this.speed = Math.min(input, LIMIT_SPEED);
        if (input < 0) {
            this.speed = 0;
        }
    }
}

