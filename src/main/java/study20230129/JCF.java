package study20230129;

import java.util.ArrayList;
import java.util.List;

public class JCF {
    public static void main(String[] args) {

        //어레이리스트
        //유연하게 처리하기 위해
        List<Car> cars = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            cars.add(new Car(i));
        }

        int size = cars.size();

        for (int i = size; i < size + 20; i++) {
            cars.add(new Car(i));
        }

        //length는 배열에서 사용
        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }

        //인덱스로 접근할때가 아니라면 이렇게하면 속도빠름
        //성능을 최적화 하기 위해 수많은 고민
        printCars(cars);
    }

    //ctrl+alt+M 하면 메소드 만들어줌
    private static void printCars(List<Car> cars) {
        for (Car car : cars) {
            System.out.println(car);
        }
    }

}
