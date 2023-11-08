import java.util.Arrays;

public class Main {
       public static void main(String[] args){
        //проверка работоспособности методов
        double[] array = new double[]{1, 2, 3, 4, 5};
        System.out.println(Arrays.stream(array).average());

        MyArray myList = new MyArray();
        myList.averageArray(array);
        System.out.println(myList.averageArray(array));

        MyArray controller = new MyArray();

        double[] array1 = controller.createArray(5);
        System.out.println(Arrays.toString(array1));
        System.out.println(controller.averageArray(array1));
        double[] array2 = controller.createArray(10);
        System.out.println(Arrays.toString(array2));
        System.out.println(controller.averageArray(array2));
        System.out.println(controller.compareArray(array1, array2));
    }
}
