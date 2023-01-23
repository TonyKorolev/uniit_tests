package homeworks.hw1.homework_calculator;
import homeworks.hw1.discount_calculation_methods;

import static org.assertj.core.api.Assertions.*;
public class Main {
    public static void main(String[] args) {
        assertThat(discount_calculation_methods.discountCalculation(50, 20)).isEqualTo(40);
        assertThat(discount_calculation_methods.discountCalculation(5.0, 2.0)).isEqualTo(4.9);
        assertThat(discount_calculation_methods.discountCalculation(0, 20)).isEqualTo(0);
        assertThat(discount_calculation_methods.discountCalculation(-50, 20)).isEqualTo(-40);
        assertThat(discount_calculation_methods.discountCalculation(50, 0)).isEqualTo(50);
        assertThat(discount_calculation_methods.discountCalculation(50, -50)).isEqualTo(75);
        assertThat(discount_calculation_methods.discountCalculation(50, 150)).isEqualTo(-25);
    }
}
