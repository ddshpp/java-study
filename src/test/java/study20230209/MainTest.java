package study20230209;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import study20230209.car.*;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class MainTest {

    @ParameterizedTest
    @CsvSource(value = {"50:50", "60:60", "70:70", "80:80", "90:80", "100:80", "-1:0"}, delimiter = ':')
    @DisplayName("한국자동차 속도 테스트")
    void testCar(int a, int expected) {
        // given
        KoreaCar koreaCar = new KoreaCar();

        // when
        koreaCar.move(a);
        int solution = koreaCar.getSpeed();

        // then
        assertThat(solution).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource(value = {"50:50", "60:60", "70:70", "80:80", "90:90", "100:100", "-1:0", "110:100"}, delimiter = ':')
    @DisplayName("중국자동차 속도 테스트")
    void testCar2(int a, int expected) {
        // given
        ChinaCar chinaCar = new ChinaCar();

        // when
        chinaCar.move(a);
        int solution = chinaCar.getSpeed();

        // then
        assertThat(solution).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource(value = {"50:50", "60:60", "70:70", "80:80", "120:120", "100:100", "-1:0", "130:120"}, delimiter = ':')
    @DisplayName("미국자동차 속도 테스트")
    void testCar3(int a, int expected) {
        // given
        USCar usCar = new USCar();

        // when
        usCar.move(a);
        int solution = usCar.getSpeed();

        // then
        assertThat(solution).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource(value = {"50:50", "60:60", "70:70", "80:70", "90:70", "100:70", "-1:0", "110:70"}, delimiter = ':')
    @DisplayName("일본자동차 속도 테스트")
    void testCar4(int a, int expected) {
        // given
        JapanCar japanCar = new JapanCar();

        // when
        japanCar.move(a);
        int solution = japanCar.getSpeed();

        // then
        assertThat(solution).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource(value = {"70:70"}, delimiter = ':')
    @DisplayName("익명자동차 속도 테스트")
    void testCar5(int a, int expected) {
        // given
        KoreaCar koreaCar = new KoreaCar();
        ChinaCar chinaCar = new ChinaCar();
        USCar usCar = new USCar();
        JapanCar japanCar = new JapanCar();

        // when
        koreaCar.move(a);
        int solution1 = koreaCar.getSpeed();
        chinaCar.move(a);
        int solution2 = chinaCar.getSpeed();
        usCar.move(a);
        int solution3 = usCar.getSpeed();
        japanCar.move(a);
        int solution4 = japanCar.getSpeed();

        // then
        assertThat(solution1).isEqualTo(expected);
        assertThat(solution2).isEqualTo(expected);
        assertThat(solution3).isEqualTo(expected);
        assertThat(solution4).isEqualTo(expected);
    }

    @ParameterizedTest
    @ValueSource(ints = {0, 1, 2, 3})
    @DisplayName("익명자동차 속도 테스트")
    void testCar6(int a) {
        // given
        List<Car> cars = List.of(new KoreaCar(), new ChinaCar(), new USCar(), new JapanCar());
        int expected = 70;

        // when
        Car car = cars.get(a);
        car.move(expected);
        int solution = car.getSpeed();

        // then
        assertThat(solution).isEqualTo(expected);
    }


}