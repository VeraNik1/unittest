import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

    class AbstractArrayTest {
        class TestArray extends AbstractArray{
        }
        TestArray testArray = new TestArray();
        /** unit-test проверка создания массива определенной длины c нулевыми значениями*/
        @Test
        void createArrayFromAbstractClassTest() {

            double[] array = testArray.createArray(10);
            assertThat(array).hasSize(10);
            assertThat(array).isEqualTo(new double[10]);
        }

    }

