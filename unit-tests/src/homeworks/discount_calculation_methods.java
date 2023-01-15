package homeworks;


public class discount_calculation_methods {
    public static double discountCalculation (double sum, double discount){
        double result;
        if (sum <= 0) {
            throw new ArithmeticException("Your sum is less or equal to 0. Sum must be more 0!");
        }
        else if (discount <= 0) {
            throw new ArithmeticException("Discount is less or equal to 0%. Discount must be more 0% and less 100%!");
        }
        else if (discount >= 100) {
            throw new ArithmeticException("Discount is more or equal to 100%. Discount must be more 0% and less 100%!");
        } else {
            result = (100 - discount) * sum / 100;
        }
        return result;
    }
}
