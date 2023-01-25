package org.example;

import java.util.Scanner;

public class Study1 {

    public static void main(String[] args) {
        System.out.println("테스트~");

//        int plus = plus(3, 4);
//        System.out.println(plus);
//
//        int minus = minus(5, 7);
//        System.out.println(minus);
//
//        int multiplication = multiplication(4, 9);
//        System.out.println(multiplication);
//
//        double division = division(3, 7);
//        System.out.println(division);

        calculator();
    }

    //캡슐화 : 보여줄 필요가 없는 부분은 내부적으로 감춤

    public static void calculator() {

        //연산자를 입력받고(기능) 다음에 숫자 2개 입력받기
        Scanner scanner = new Scanner(System.in);

        //연산자입력받기
        while (true) {
            System.out.println("연산자를 입력하세요 (+,-,*,/)");
            String operator = scanner.nextLine();
            
            // todo - equals 와 == 차이 알아내기
            if (!(operator.equals("+") || operator.equals("-") || operator.equals("*") || operator.equals("/"))) {
                System.out.println("프로그램을 종료합니다");
                break;
            }

            System.out.println("첫번째 숫자를 입력하세요");
            int num1 = Integer.parseInt(scanner.nextLine());
            System.out.println("두번째 숫자를 입력하세요");
            int num2 = Integer.parseInt(scanner.nextLine());

            double value = getValue(operator, num1, num2);
            System.out.println("결과는 : " + value);
        }
    }

    private static double getValue(String operator, int num1, int num2) {

        if (operator.equals("+")) {
            return Calculator.plus(num1, num2);
        }
        if (operator.equals("-")) {
            return Calculator.minus(num1, num2);
        }
        if (operator.equals("*")) {
            return Calculator.multiplication(num1, num2);
        }
        return Calculator.division(num1, num2);

    }

}
