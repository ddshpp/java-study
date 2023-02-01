package study20230125;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class CalculatorTest {

    @ParameterizedTest()
    @CsvSource(value = {"3:5:8", "10:15:25", "5:5:10"}, delimiter = ':')
    @DisplayName("더하기를 계산한다")
    public void testAdd(int a, int b, int expected) {
        // given

        // when
        int value = Calculator.plus(a, b);

        // then
        assertThat(value).isEqualTo(expected);
    }

    @ParameterizedTest()
    @CsvSource(value = {"10:8:2", "5:5:0", "26:25:1"}, delimiter = ':')
    @DisplayName("빼기를 계산한다")
    public void testMinus(int a, int b, int expected) {
        // given

        // when
        int value = Calculator.minus(a, b);

        // then
        assertThat(value).isEqualTo(expected);
    }

    @ParameterizedTest()
    @CsvSource(value = {"10:8:80", "5:5:25", "26:0:0"}, delimiter = ':')
    @DisplayName("곱하기를 계산한다")
    public void testMultiplication(int a, int b, int expected) {
        // given

        // when
        int value = Calculator.multiplication(a, b);

        // then
        assertThat(value).isEqualTo(expected);
    }

    @ParameterizedTest()
    @CsvSource(value = {"8:8:1", "5:5:1", "1:2:0.5"}, delimiter = ':')
    @DisplayName("나누기를 계산한다")
    public void testDivision(double a, double b, double expected) {
        // given

        // when
        double value = Calculator.division(a, b);

        // then
        assertThat(value).isEqualTo(expected);
    }

    @Test
    @DisplayName("분모가 0 일경우 에러가 발생한다")
    void testDivision2() {
        // given
        double a = 5.0;
        double b = 0.0;

        // when

        // then
        assertThatThrownBy(() -> Calculator.division(a, b)).isExactlyInstanceOf(IllegalArgumentException.class);
    }
}