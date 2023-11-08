import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class MyArrayTest {

    MyArray arrayTest = new MyArray();


    /** unit-тест проверка метода сравнения средних значений двух списков (средние значения равны)*/
    @Test
    void compareArrayAverageEqualsTest() {
        double[] array1 = new double[]{1,1,1,1,1};
        double[] array2 = new double[]{1,1,1,1,1};
        assertThat(arrayTest.compareArray(array1, array2)).isEqualTo("Средние значения массивов равны");
    }

    /** unit-тест проверка метода сравнения двух списков (среднее значение 1-го больше)*/
    @Test
    public void compareArrayAverageFirstBigger() {
        double[] array1 = new double[]{2,2,2,2,3};
        double[] array2 = new double[]{1,1,1,1,1};

        assertThat(arrayTest.compareArray(array1, array2)).isEqualTo("Первый список имеет большее среднее значение");
    }

    /** unit-тест проверка метода сравнения двух списков (среднее значение 2-го больше)*/
    @Test
    public void compareArrayAverageSecondBigger() {
        double[] array7 = new double[]{1,1,1,1,1};
        double[] array8 = new double[]{2,2,2,2,3};

        assertThat(arrayTest.compareArray(array7, array8)).isEqualTo("Второй список имеет большее среднее значение");
    }

    /** unit-тест проверка метода вычисления среднего значения списка*/
    @Test
    void averageArrayTest() {
        double[] array3 = new double[]{1,1,1,1,1};

        assertThat(arrayTest.averageArray(array3)).isEqualTo(1);
    }

   /** параметризованный unit-тест проверка метода создания списка заданной длины */
    @ParameterizedTest
    @CsvSource(value = {"1", "2", "10", "50"})
    void createArrayCheck(int len) {
        double[] array4 = arrayTest.createArray(len);
        assertThat(array4.length).isEqualTo(len);
    }

    /** тест, который проверяет создание нового списка в классе MyArray*/
    @Test
    public void createMyArrayTest(){
        MyArray myListMock = mock(MyArray.class);
        when(myListMock.createArray(5)).thenReturn(new double[]{1,1,1,1,1});
    }

}
