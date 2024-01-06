import java.util.Arrays;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size");
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i]= (int)(Math.random()*100) ;



        }
        System.out.println(Arrays.toString(array));
    }


}


