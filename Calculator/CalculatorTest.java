package seminars.first.Calculator;
import org.testng.annotations.Test;
import org.junit.jupiter.api.DisplayName;

import static com.github.attiand.assertj.jaxrs.Assertions.assertThat;
import static java.lang.Math.abs;
import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

        @Test
        @DisplayName("Проверка метода calculatingDiscount, на корректный рассчет сумму с учетом скидки для допустимых входных данных")
        public void testCalculatingDiscountWithValidInput() {
            double purchaseAmount = 100.0;
            int discountPercentage = 10;
            double expectedDiscountedPrice = 90.0; // Ожидаемая сумма с учетом скидки
            double actualDiscountedPrice = Calculator.calculatingDiscount(purchaseAmount, discountPercentage);
            assertEquals(actualDiscountedPrice, expectedDiscountedPrice, 0.00001);
        }


        @Test
        @DisplayName("Проверка метода calculateDiscount на выброс исключения, если сумма покупки равна нулю")
        public void testCalculateDiscountWithZeroPurchaseAmount() {
            double purchaseAmount = 0.0;
            int discountPercentage = 10;

                // Ожидается IllegalArgumentException, так как сумма покупки равна нулю
                assertThatIllegalArgumentException().isThrownBy(() -> {
                    Calculator.calculatingDiscount(purchaseAmount, discountPercentage);
                });
        }


        @Test
        @DisplayName("Проверка метода calculateDiscount на выброс исключения, если процент скидки отрицательный")
        public void testCalculateDiscountWithNegativeDiscountPercentage() {
            double purchaseAmount = 100.0;
            int discountPercentage = -10;

            // Ожидается IllegalArgumentException, так как процент скидки отрицательный
            assertThatIllegalArgumentException().isThrownBy(() -> {
                Calculator.calculatingDiscount(purchaseAmount, discountPercentage);
            });
        }

        @Test
        @DisplayName("Проверка метода calculateDiscount на выброс исключения, если процент скидки больше 100")
        public void testCalculateDiscountWithDiscountPercentageGreaterThan100() {
            double purchaseAmount = 100.0;
            int discountPercentage = 110;

            // Ожидается IllegalArgumentException, так как процент скидки больше 100
            assertThatIllegalArgumentException().isThrownBy(() -> {
                Calculator.calculatingDiscount(purchaseAmount, discountPercentage);
            });
        }

    }
