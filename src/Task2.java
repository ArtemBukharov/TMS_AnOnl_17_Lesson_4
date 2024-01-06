import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        int number = scanner.nextInt();
        int[] array = new int[]{1, 5, 6, 7, 9, 11};
        int[] resultarray = new int[array.length - 1];
        System.out.println("do" + Arrays.toString(array));
        for (int i = 0, k = 0; i < array.length; i++) {
            if (array[i] != number) {
                resultarray[k]=array[i];
                k++;
            }



        }
        System.out.println("posle" + Arrays.toString(resultarray));
    }


}
