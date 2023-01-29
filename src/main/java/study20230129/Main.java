package study20230129;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Car car1 = new Car(0);

        //만들 차량 숫자입력을 받고
        Scanner scanner = new Scanner(System.in);
        int size = Integer.parseInt(scanner.nextLine());

        //입력받은 숫자만큼 배열만들어
        Car[] cars = new Car[size];

        //차 만들어
        for (int i = 0; i < size; i++) {
            cars[i] = new Car(i);
        }

        //호출할 차 번호 입력받아
        int input = Integer.parseInt(scanner.nextLine());

        cars[input].addSpeed(10);

//    -------------------------------------------

        //차 20대 보유중인데 20대(혹은N대) 더 늘렸다면? 어찌해야할까?
        int addSize = Integer.parseInt(scanner.nextLine());
        Car[] cars2 = new Car[size+addSize];

        for (int i = 0; i < size+addSize; i++) {
            if(i<size) {
                cars2[i] = cars[i];
            }else {
                cars2[i] = new Car(i);
            }
        }
        //이렇게 만들면 매번 새로 배열을 만들어줘야하니 불편함

        // TODO: 연결리스트 만들기


    }
}
