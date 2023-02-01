package seminars.third.coverage;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class SomeServiceTest {
    private SomeService someService;

    @BeforeEach
    void setUp() {
            someService = new SomeService();
        }

    @Test
    void fizzTest() {
        assertThat(someService.fizzBuzz(9)).isEqualTo("Fizz");
    }

    @Test
    void buzzTest() {
        assertThat(someService.fizzBuzz(10)).isEqualTo("Buzz");
    }

    @Test
    void fizzBuzzTest() {
        assertThat(someService.fizzBuzz(15)).isEqualTo("FizzBuzz");
    }

    @Test
    void noFizzBuzzTest() {
        assertThat(someService.fizzBuzz(2)).isEqualTo("2");
    }

    @Test
    void firstElement6() {
        assertTrue(someService.firstLast6(new int[]{6,2,3}));
    }

    @Test
    void lastElement6() {
        assertTrue(someService.firstLast6(new int[]{2,3,6}));
    }

    @Test
    void ElementTest() {
        assertFalse(someService.firstLast6(new int[]{1,6,3}));
    }

    @Test
    void OrdinaryDiscountCoverageTest() {

        System.out.println(someService.calculatingDiscount(2000.0, 10));
        assertThat(someService.calculatingDiscount(2000.0, 50))
                .isEqualTo(1000); // обычная скидка
        assertThat(someService.calculatingDiscount(2000.0, 100))
                .isEqualTo(0); // обычная скидка
        assertThat(someService.calculatingDiscount(2000.0, 0))
                .isEqualTo(2000); // обычная скидка
    }

    @Test
    void More100DiscountCoverageTest() {
        assertThatThrownBy(() ->
                someService.calculatingDiscount(2000.0, 110))
                .isInstanceOf(ArithmeticException.class)
                .hasMessage("Скидка должна быть в диапазоне от 0 до 100%"); // процент скидки больше 100%
    }

    @Test
    void Less100DiscountCoverageTest() {
        assertThatThrownBy(() ->
                someService.calculatingDiscount(2000.0, -10))
                .isInstanceOf(ArithmeticException.class)
                .hasMessage("Скидка должна быть в диапазоне от 0 до 100%"); // процент скидки меньше 0
    }

    @Test
    void SumBuyCoverageTest() {
        assertThatThrownBy(() ->
                someService.calculatingDiscount(-100, 10))
                .isInstanceOf(ArithmeticException.class)
                .hasMessage("Сумма покупки не может быть отрицательной");
    }


    @Test
    void luckySumA13() {
        assertThat(someService.luckySum(13, 1, 2)).isEqualTo(3);
    }

    @Test
    void luckySumB13() {
        assertThat(someService.luckySum(1, 13, 3)).isEqualTo(4);
    }

    @Test
    void luckySumC13() {
        assertThat(someService.luckySum(1, 4, 13)).isEqualTo(5);
    }

    @Test
    void luckySumNo13() {
        assertThat(someService.luckySum(1, 2, 3)).isEqualTo(6);
    }

}