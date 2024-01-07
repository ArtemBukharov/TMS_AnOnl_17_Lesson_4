import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = {1,3,5,7,9,33,14,3};
        int counter = 0;
        System.out.println("Введите число из массива ");
        int number = scanner.nextInt();
        for (int i : array) {
            if (number == i) {
                counter++;
            }
        }
        if (counter != 0) {
            int[] resultarray = new int[array.length - counter];
            for (int i = 0, j = 0; i < array.length; i++) {
                if (number != array[i]) {
                    resultarray[j] = array[i];
                    j++;
                }
            }
            System.out.println("do"+ Arrays.toString(array));
            System.out.println("posle"+ Arrays.toString(resultarray));
        } else {
            System.out.println("Tакого числа нет в массиве");
        }
    }
}