import java.util.Random;
public class MyArray extends AbstractArray  {
    public MyArray() {
    }
    public String compareArray(double[] array1, double[] array2) {
        if(averageArray(array1) == averageArray(array2)) {
            return "Средние значения массивов равны";
        } else if (averageArray(array1) > averageArray(array2)) {
            return "Первый список имеет большее среднее значение";
        } else {
            return "Второй список имеет большее среднее значение";
        }
    }
    public double averageArray(double[] array) {
        double sum = 0;
        for (double j : array) {
            sum = sum + j;
        }
        double resultAverage = sum / array.length;
        return resultAverage;
    }
    @Override
     public double[] createArray(int len) {
        Random random = new Random();
        double[] array = new double[len];
        for (int i = 0; i < array.length; i++) {
            array[i] = Math.abs(random.nextDouble(3, 10));
        }
        return array;
    }

}
