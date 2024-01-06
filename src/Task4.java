import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {

        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {2, 3, 4, 5, 6};
        System.out.println("Массив1" + " " + Arrays.toString(array1));
        System.out.println("Массив2" + " " + Arrays.toString(array2));
        int sum = 0;
        for (int i = 0; i < array1.length; i++) {
            sum += array1[i];
        }
        double average = (double) sum / array1.length;
        System.out.println("one" + " " + average);
        int sum2 = 0;
        for (int j = 0; j < array2.length; j++) {
            sum2 += array2[j];
        }
        double average2 = (double) sum2 / array1.length;
        System.out.println("too" + " " + average2);
        if (average > average2) {
            System.out.println("Среднее арифметическое массива1 больше среднего арифметического массива2");
        } else if (average < average2) {
            System.out.println("Среднее арифметическое массива2 больше среднего арифметического массива1");
        }

        else {
            System.out.println("Среднее арифметическое обоих массивов равны");
        }


    }


    }






