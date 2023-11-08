public abstract class AbstractArray {
    /**
     * список
     */
    double[] array;

    /**
     * среднее значение
     */
    private double resultAverage;

    /**
     * создание массива длины заданной длины с нулевыми значениями
     */
    double[] createArray(int len){
        double[] array = new double[len];
        return array;
    }
}
