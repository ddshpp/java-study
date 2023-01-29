package study20230125;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

//        for (int i = 1; i < 10; i++) {
//            for (int j = 1; j < 10; j++) {
//                System.out.println(i + "*" + j + " : " + (i * j));
//            }
//            System.out.println();
//        }

        //for문 안에 인자(i)는 가능한 건들지 말자
        //사람이 유지보수하기 쉽게 쓰자
        for (int i = 1; i < 10; i++) {
            if (i % 2 != 0) {
                continue;
            }
            for (int j = 1; j < 10; j++) {
                System.out.println(i + "*" + j + " : " + (i * j));
            }
            System.out.println();
        }
    }


}